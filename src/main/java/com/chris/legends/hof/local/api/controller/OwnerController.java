package com.chris.legends.hof.local.api.controller;

import com.chris.legends.hof.local.api.model.Owner;
import com.chris.legends.hof.local.api.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/owners")
public class OwnerController {

    private OwnerRepository ownerRepository;

    @Autowired
    public OwnerController(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

    @GetMapping("/all")
    @ResponseBody
    public Iterable<Owner> getAllOwners(){
        return ownerRepository.findAll();
    }

    @GetMapping("/{firstName}")
    @ResponseBody
    public Owner getOwnerByFirstName(@PathVariable String firstName) {
        return ownerRepository.findByFirstName(firstName);
    }
}

