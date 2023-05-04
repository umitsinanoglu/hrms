package kodlamaio.hrms.business.validation.abstracts;


import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Applicant;
import kodlamaio.hrms.entities.concretes.Employer;

public interface ValidationRuleService {

    Result checkApplicant(Applicant applicant);

    Result checkEmployer(Employer employer);

}