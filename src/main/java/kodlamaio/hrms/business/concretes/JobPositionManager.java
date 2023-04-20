package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    @Autowired
    private JobPositionDao jobPositionDao;

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<>(this.jobPositionDao.findAll(), "Data listelendi");
    }

    @Override
    public Result add(Job jobPosition) {
        if(this.jobPositionDao.findByTitle(jobPosition.getTitle()) != null) {
            return new ErrorResult("Job position exists in the database.");
        }

        this.jobPositionDao.save(jobPosition);
        return new SuccessResult("Job position has added successfully.");
    }

}
