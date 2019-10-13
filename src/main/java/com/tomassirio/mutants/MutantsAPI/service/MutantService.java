package com.tomassirio.mutants.MutantsAPI.service;

import com.tomassirio.mutants.MutantsAPI.model.Mutant;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MutantService {

    Character[] nitrogenBase = {'A', 'T', 'C', 'G'};

    public Mutant checkMutancy(String[] dna) {
        isValidDna(dna);
        return null;
    }

    private Boolean isValidDna(String[] dna){
        for(String string : dna){
            if(string.length() != dna.length || !isValidString(string))
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    private Boolean isValidString(String dna){
        for(int i = 0; i < dna.length(); i++){
            if(!Arrays.asList(nitrogenBase).contains(dna.charAt(i)))
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }


}
