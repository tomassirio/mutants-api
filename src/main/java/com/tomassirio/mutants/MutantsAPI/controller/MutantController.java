package com.tomassirio.mutants.MutantsAPI.controller;


import com.tomassirio.mutants.MutantsAPI.model.Mutant;
import com.tomassirio.mutants.MutantsAPI.repository.MutantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class MutantController {
    @Autowired
    private MutantRepository mutantRepository;

    @PostMapping("/mutant")
    public Mutant checkMutancy(@Valid @RequestBody Mutant mutant) {
//        return mutantService.checkMutancy();
            return null;
    }

}