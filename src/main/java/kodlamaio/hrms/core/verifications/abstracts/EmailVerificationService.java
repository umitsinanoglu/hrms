package kodlamaio.hrms.core.verifications.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;

public interface EmailVerificationService {

	Result verifyEmail(String email);
}