package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitles")
public class JobPositionController {

    @Autowired
    private JobPositionService jobtitleservice;

    @GetMapping("/getall")
    public DataResult<List<JobPosition>> getAll() {
        return this.jobtitleservice.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPosition jobPosition) {
        return this.jobtitleservice.add(jobPosition);
    }

}
