package kodlamaio.hrms.dataAccess.abstracts;


import kodlamaio.hrms.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<Job, Integer> {
    Job findByTitle(String positionName);
};
