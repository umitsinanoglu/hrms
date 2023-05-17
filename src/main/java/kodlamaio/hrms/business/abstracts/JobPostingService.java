package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;

import java.util.List;

public interface JobPostingService {

    DataResult<List<JobPosting>> getAll();

    Result add(JobPosting jobPosting);

    DataResult<JobPosting> findById(int id);

    DataResult<List<JobPosting>> findByIsActive(boolean isActive);

    DataResult<List<JobPosting>> findByIsActiveOrderByEndDateAsc(boolean isActive);

    DataResult<List<JobPosting>> findByEmployerCompanyNameAndIsActive(String employerCompanyName, boolean isActive);

    DataResult<JobPosting> setJobPostingStatus(int id, boolean newStatus);


}
