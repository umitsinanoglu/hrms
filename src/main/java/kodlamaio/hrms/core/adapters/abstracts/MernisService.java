package kodlamaio.hrms.core.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.Applicant;

public interface MernisService {

    public boolean checkPerson(Applicant applicant) throws Exception;
}