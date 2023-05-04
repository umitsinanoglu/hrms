package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.ApplicantService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
public class ApplicantController {

    @Autowired
    private ApplicantService ApplicantService;

    @GetMapping("/getAll")
    public DataResult<List<Applicant>> getAll() {

        return this.ApplicantService.getAll();
    }

    @PostMapping("/addApplicant")
    public Result add(@RequestBody Applicant Applicant) throws Exception {

        return this.ApplicantService.add(Applicant);
    }
}