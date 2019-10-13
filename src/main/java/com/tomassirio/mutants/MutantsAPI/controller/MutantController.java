package com.tomassirio.mutants.MutantsAPI.controller;


import com.tomassirio.mutants.MutantsAPI.model.Mutant;
import com.tomassirio.mutants.MutantsAPI.model.dto.MutantDTO;
import com.tomassirio.mutants.MutantsAPI.repository.MutantRepository;
import com.tomassirio.mutants.MutantsAPI.service.MutantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.DelegatingServletInputStream;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class MutantController {

    @Autowired
    private MutantService mutantService;

    @PostMapping("/mutant")
    public ResponseEntity<Mutant> checkMutancy(@Valid @RequestBody MutantDTO mutantDTO) {
        Mutant mutant = mutantService.checkMutancy(mutantDTO);
        if(mutant != null)
            return ResponseEntity.ok().body(mutant);
        else
            return ResponseEntity.badRequest().body(null);

    }

}