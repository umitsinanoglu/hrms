package kodlamaio.hrms.core.verifications.concretes;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.verifications.abstracts.EmailVerificationService;
import org.springframework.stereotype.Service;

@Service
public class EmailVarificationManager implements EmailVerificationService {

	@Override
	public Result verifyEmail(String email) {
		// TODO Auto-generated method stub
		return new SuccessResult("Please verify your account. We sent the e-mail to your e-mail address: " + email);
	}

}