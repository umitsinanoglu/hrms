package kodlamaio.hrms.core.verifications.concretes;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.verifications.abstracts.EmployeeVerificationService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeVerificationManager implements EmployeeVerificationService {

    @Override
    public Result verifyAccount() {
        return new SuccessResult("Account is verified by HRMS.");
    }
}