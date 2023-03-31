package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.concretes.CandidateManager;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
    @Autowired
    private CandidateManager candidateManager;


    @GetMapping("/getall")
    public List<Candidate> getAll() {
        return this.candidateManager.getAll();
    }

}





