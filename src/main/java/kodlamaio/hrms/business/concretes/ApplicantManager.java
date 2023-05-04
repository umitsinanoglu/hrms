package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.ApplicantService;
import kodlamaio.hrms.business.validation.abstracts.ValidationRuleService;
import kodlamaio.hrms.core.adapters.abstracts.MernisService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.core.verifications.abstracts.EmailVerificationService;
import kodlamaio.hrms.dataAccess.abstracts.ApplicantDao;
import kodlamaio.hrms.entities.concretes.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantManager implements ApplicantService {
    @Autowired
    private ApplicantDao applicantDao;
    @Autowired
    private MernisService mernisService;

    @Autowired
    private ValidationRuleService validationRuleService;
    @Autowired
    private EmailVerificationService emailVerificationService;


    @Override
    public DataResult<List<Applicant>> getAll() {

        return new SuccessDataResult<List<Applicant>>(applicantDao.findAll(), "Query returned successfully.");
    }

    @Override
    public Result add(Applicant applicant) throws Exception {

        Result validationResult = validationRuleService.checkApplicant(applicant);
        if (!validationResult.isSuccess()) {
            return new ErrorResult(validationResult.getMessage());
        }

        boolean mernisValidationResult = checkapplicant(applicant);
        if (!mernisValidationResult) {
            return new ErrorResult("The person does not exist. Plase check the given info.");
        }

        boolean emailAndIdValidationResult = checkEmailAndId(applicant);
        if (emailAndIdValidationResult)
            return new ErrorResult("E-mail or identity number already exists.");

        System.out.println(this.emailVerificationService.verifyEmail(applicant.getEmail()).getMessage());
        this.applicantDao.save(applicant);
        return new SuccessResult("The applicant is added successfully.");
    }

    // Auxiliary Functions

    public boolean checkapplicant(Applicant applicant) throws Exception {

        boolean mernisValidationResult = this.mernisService.checkPerson(applicant);
        if (!mernisValidationResult)
            return false;
        return true;
    }

    public boolean checkEmailAndId(Applicant applicant) {

        Applicant findByEmailOrIdentityNumberResult = this.applicantDao.findByEmailOrIdentityNumber(applicant.getEmail(), applicant.getIdentityNumber());
        if (findByEmailOrIdentityNumberResult == null)
            return false;
        return true;
    }


}