package kodlamaio.hrms.dataAccess.abstracts;


import kodlamaio.hrms.entities.concretes.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantDao extends JpaRepository<Applicant, Integer> {

    Applicant findByEmailOrIdentityNumber(String email, String identityNumber);
}
