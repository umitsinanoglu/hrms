package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {
    @Autowired
    private JobDao jobDao;

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<>(this.jobDao.findAll(), "Data listelendi");
    }

    @Override
    public Result add(Job job) {
        if (this.jobDao.findByTitle(job.getJobTitle()) != null) {
            return new ErrorResult("Job position exists in the database.");
        }

        this.jobDao.save(job);
        return new SuccessResult("Job position has added successfully.");
    }

}
