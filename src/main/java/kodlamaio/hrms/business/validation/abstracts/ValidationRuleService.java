package kodlamaio.hrms.business.validation.abstracts;


import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.Employer;

public interface ValidationRuleService {

	Result checkCandidate(Candidate candidate);

	Result checkEmployer(Employer employer);

}