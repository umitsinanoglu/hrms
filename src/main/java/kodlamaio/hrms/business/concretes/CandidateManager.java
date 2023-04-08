package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.validation.abstracts.ValidationRuleService;
import kodlamaio.hrms.core.adapters.abstracts.MernisService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.core.verifications.abstracts.EmailVerificationService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    @Autowired
    private CandidateDao candidateDao;
    @Autowired
    private MernisService mernisService;

    @Autowired
    private ValidationRuleService validationRuleService;
    @Autowired
    private EmailVerificationService emailVerificationService;


    @Override
    public DataResult<List<Candidate>> getAll() {

        return new SuccessDataResult<List<Candidate>>(candidateDao.findAll(), "Query returned successfully.");
    }

    @Override
    public Result add(Candidate candidate) throws Exception {

        Result validationResult = validationRuleService.checkCandidate(candidate);
        if (!validationResult.isSuccess()) {
            return new ErrorResult(validationResult.getMessage());
        }

        boolean mernisValidationResult = checkCandidate(candidate);
        if (!mernisValidationResult) {
            return new ErrorResult("The person does not exist. Plase check the given info.");
        }

        boolean emailAndIdValidationResult = checkEmailAndId(candidate);
        if (emailAndIdValidationResult)
            return new ErrorResult("E-mail or identity number already exists.");

        System.out.println(this.emailVerificationService.verifyEmail(candidate.getEmail()).getMessage());
        this.candidateDao.save(candidate);
        return new SuccessResult("The candidate is added successfully.");
    }

    // Auxiliary Functions

    public boolean checkCandidate(Candidate candidate) throws Exception {

        boolean mernisValidationResult = this.mernisService.checkPerson(candidate);
        if (!mernisValidationResult)
            return false;
        return true;
    }

    public boolean checkEmailAndId(Candidate candidate) {

        Candidate findByEmailOrIdentityNumberResult = this.candidateDao.findByEmailOrIdentityNumber(candidate.getEmail(), candidate.getIdentityNumber());
        if (findByEmailOrIdentityNumberResult == null)
            return false;
        return true;
    }


}