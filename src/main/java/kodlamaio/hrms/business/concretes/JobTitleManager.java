package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDataAccess;
import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {
	@Autowired
	private JobTitleDataAccess jobtitledataaccess;

	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return this.jobtitledataaccess.findAll();
	}

}
