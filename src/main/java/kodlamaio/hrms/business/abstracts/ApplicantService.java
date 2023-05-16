package kodlamaio.hrms.business.abstracts;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Applicant;

import java.util.List;

public interface ApplicantService {
    DataResult<List<Applicant>> getAll();

    Result add(Applicant applicant) throws Exception;

}
