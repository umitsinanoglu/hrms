package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.validation.abstracts.ValidationRuleService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.core.verifications.abstracts.EmailVerificationService;
import kodlamaio.hrms.core.verifications.abstracts.EmployeeVerificationService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    @Autowired
    private EmployerDao employerDao;
    @Autowired
    private ValidationRuleService validationRuleService;
    @Autowired
    private EmailVerificationService emailVerificationService;
    @Autowired
    private EmployeeVerificationService employeeVerificationService;


    @Override
    public DataResult<List<Employer>> getAll() {

        return new SuccessDataResult<List<Employer>>(employerDao.findAll(), "Query returned successfully.");
    }

    @Override
    public Result add(Employer employer) {

        Result validationResult = this.validationRuleService.checkEmployer(employer);
        if (!validationResult.isSuccess())
            return new ErrorResult(validationResult.getMessage());

        boolean emailValidationResult = checkEmail(employer);
        if (emailValidationResult)
            return new ErrorResult("E-mail already exists.");

        System.out.println(this.emailVerificationService.verifyEmail(employer.getEmail()).getMessage() + "\n" + this.employeeVerificationService.verifyAccount().getMessage());
        this.employerDao.save(employer);
        return new SuccessResult("The employer is added successfully.");
    }

    // Auxiliary Functions
    public boolean checkEmail(Employer employer) {

        Employer findByEmailResult = this.employerDao.findByEmail(employer.getEmail());
        if (findByEmailResult == null)
            return false;
        return true;
    }

}
