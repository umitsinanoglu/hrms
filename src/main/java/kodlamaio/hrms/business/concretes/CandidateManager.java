package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDataAccess;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
	@Autowired
	private CandidateDataAccess candidatedataaccess;

	@Override
	public List<Candidate> getAll() {
		// TODO Auto-generated method stub
		return this.candidatedataaccess.findAll();
	}

}
