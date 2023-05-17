package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPostingDao;
import kodlamaio.hrms.entities.concretes.JobPosting;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobPostingManager implements JobPostingService {

    private JobPostingDao jobPostingDao;

    @Override
    public DataResult<List<JobPosting>> getAll() {
        return new SuccessDataResult<>(this.jobPostingDao.findAll());
    }

    @Override
    public Result add(JobPosting jobPosting) {
        this.jobPostingDao.save(jobPosting);
        return new SuccessResult();
    }

    @Override
    public DataResult<JobPosting> findById(int id) {
        return new SuccessDataResult<>(this.jobPostingDao.findById(id));
    }

    @Override
    public DataResult<List<JobPosting>> findByIsActive(boolean isActive) {
        return null;
    }

    @Override
    public DataResult<List<JobPosting>> findByIsActiveOrderByEndDateAsc(boolean isOpen) {
        return null;
    }

    @Override
    public DataResult<List<JobPosting>> findByEmployerCompanyNameAndIsActive(String employerCompanyName, boolean isActive) {
        return null;
    }

    @Override
    public DataResult<JobPosting> setJobPostingStatus(int id, boolean newStatus) {
        JobPosting jobPosting = findById(id).getData();
        jobPosting.setActive(newStatus);
        return new SuccessDataResult<>(this.jobPostingDao.save(jobPosting));
    }
}
