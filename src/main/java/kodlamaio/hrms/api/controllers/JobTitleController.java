package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitleController {

    @Autowired
    private JobTitleService jobtitleservice;

    @GetMapping("/getall")
    public List<JobTitle> getAll() {

        return this.jobtitleservice.getAll();
    }


}
