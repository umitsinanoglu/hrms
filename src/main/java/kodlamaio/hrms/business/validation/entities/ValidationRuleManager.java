package kodlamaio.hrms.business.validation.entities;


import kodlamaio.hrms.business.validation.abstracts.ValidationRuleService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Applicant;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.stereotype.Service;

import java.time.Year;

@Service
public class ValidationRuleManager implements ValidationRuleService {

    @Override
    public Result checkApplicant(Applicant applicant) {

        Year currentYear = Year.now();

        if (applicant.getFirstName().isEmpty() || applicant.getLastName().isEmpty() || applicant.getIdentityNumber().isEmpty() || applicant.getEmail().isEmpty()
                || applicant.getPassword().isEmpty()) {
            return new ErrorResult("Please fill the blanks completely.");
        }

        if (applicant.getBirthYear() <= 0 || applicant.getBirthYear() > currentYear.getValue()) {
            return new ErrorResult("Wrong birth of year.");
        }
        return new SuccessResult("Validation OK.");
    }

    @Override
    public Result checkEmployer(Employer employer) {

        if (employer.getCompanyName().isEmpty() || employer.getWebAddress().isEmpty() || employer.getEmail().isEmpty() || employer.getPhoneNumber().isEmpty()
                || employer.getPassword().isEmpty())
            return new ErrorResult("Please fill the blanks completely.");
        else if (!employer.getEmail().contains(employer.getWebAddress()))
            return new ErrorResult("Your email must contains the domain in it.");

        return new SuccessResult("Validation OK.");

    }

}