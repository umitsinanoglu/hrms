package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobPosting")
public class JobPostingController {
    @Autowired
    private JobPostingService jobPostingService;

    @GetMapping("/getAll")
    public DataResult<List<JobPosting>> getAll() {
        return this.jobPostingService.getAll();
    }

    @PostMapping("/save")
    public Result addJobAdvertisement(@RequestBody JobPosting jobPosting) {
        return this.jobPostingService.add(jobPosting);
    }

    @GetMapping("/getActiveJobPostings")
    public DataResult<List<JobPosting>> findByIsOpen() {
        return this.jobPostingService.findByIsActive(true);
    }

    @GetMapping("/getActiveJobPostingsOrderBy")
    public DataResult<List<JobPosting>> findByIsActiveOrderByEndDateAsc() {
        return this.jobPostingService.findByIsActiveOrderByEndDateAsc(true);
    }

    @GetMapping("/getAllWithCompanyName")
    public DataResult<List<JobPosting>> findByEmployerCompanyNameAndIsActive(@RequestParam String employerName, @RequestParam Boolean isActive) {
        return this.jobPostingService.findByEmployerCompanyNameAndIsActive(employerName, isActive);
    }

    @PatchMapping("/updateWithId")
    DataResult<JobPosting> setJobPostingStatus(@RequestParam int id, @RequestParam boolean newStatus) {
        return this.jobPostingService.setJobPostingStatus(id, newStatus);
    }
}
