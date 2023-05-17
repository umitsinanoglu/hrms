package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {

    JobPosting findById(int id);

    List<JobPosting> findByIsActive(boolean isActive);

    List<JobPosting> findByIsActiveOrderByEndDateAsc(boolean isOpen);

    List<JobPosting> findByEmployerCompanyNameAndIsActive(String employerCompanyName, boolean isActive);

}
