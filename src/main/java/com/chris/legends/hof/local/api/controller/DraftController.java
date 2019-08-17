package com.chris.legends.hof.local.api.controller;


import com.chris.legends.hof.local.api.model.Draft;
import com.chris.legends.hof.local.api.repository.DraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/draft")
public class DraftController {

    private DraftRepository draftRepository;

    @Autowired
    public DraftController(DraftRepository draftRepository){
        this.draftRepository = draftRepository;
    }

    @GetMapping("/all")
    @ResponseBody
    public Iterable<Draft> getAll(){
        return draftRepository.findAll();
    }

    @GetMapping("/{year}")
    @ResponseBody
    public Draft getDraftByYear(@PathVariable String year){
        return draftRepository.findByYear(year);
    }

}
