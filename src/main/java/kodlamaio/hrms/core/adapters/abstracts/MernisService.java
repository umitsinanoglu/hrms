package kodlamaio.hrms.core.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.Candidate;

public interface MernisService {

    public boolean checkPerson(Candidate candidate) throws Exception;
}