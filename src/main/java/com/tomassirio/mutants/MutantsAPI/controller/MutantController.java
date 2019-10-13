package com.tomassirio.mutants.MutantsAPI.controller;


import com.tomassirio.mutants.MutantsAPI.model.Mutant;
import com.tomassirio.mutants.MutantsAPI.repository.MutantRepository;
import com.tomassirio.mutants.MutantsAPI.service.MutantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class MutantController {
    @Autowired
    private MutantRepository mutantRepository;
    @Autowired
    private MutantService mutantService;

    @PostMapping("/mutant")
    public Mutant checkMutancy(@Valid @RequestBody String[] mutant) {
        return mutantService.checkMutancy(mutant);
    }

}