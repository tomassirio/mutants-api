package com.tomassirio.mutants.MutantsAPI.service;

import com.tomassirio.mutants.MutantsAPI.model.Mutant;
import com.tomassirio.mutants.MutantsAPI.model.dto.MutantDTO;
import com.tomassirio.mutants.MutantsAPI.repository.MutantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MutantService {

    private static final int MUTANT_NITROGEN_BASE = 4;
    private static final int MATCHES_REQUIRED = 2;


    @Autowired
    private MutantRepository mutantRepository;

    Character[] nitrogenBase = {'A', 'T', 'C', 'G'};

    public Mutant checkMutancy(MutantDTO mutantDTO) {
        if(isValidDna(mutantDTO.getDna())) {
            int matches = 0;
            for(int i = 0; i < mutantDTO.getDna().length; i++){
                matches = getHorizontal(mutantDTO.getDna()[i]) ? matches + 1 : matches;
                matches = getVertical(mutantDTO.getDna(), i) ? matches + 1 : matches;
            }
            for(int i = 0; i < mutantDTO.getDna().length; i++){
                matches = getDiagonal(mutantDTO.getDna()) ? matches + 1 : matches;
            }
            if(matches >= MATCHES_REQUIRED){
                return mutantRepository.save(new Mutant(mutantDTO.getDna()));
            }
        }
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

    private Boolean getHorizontal(String dna){
        int res = 1;
        char c = 'z';
        for(int i = 0; i < dna.length(); i++){
            if(dna.charAt(i) == c)
                res++;
            else {
                c = dna.charAt(i);
                res = 1;
            }
            if(res == MUTANT_NITROGEN_BASE)
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private Boolean getVertical(String[] dna, int col){
        int res = 1;
        char c = 'z';
        for(int i = 0; i < dna.length; i++){
            if(dna[i].charAt(col) == c)
                res++;
            else {
                c = dna[i].charAt(col);
                res = 1;
            }
            if(res == MUTANT_NITROGEN_BASE)
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private Boolean getDiagonal(String[] dna){
        int res = 1;
        char c = 'z';
        for(int i = 0; i < dna.length; i++){
            if(dna[i].charAt(i) == c)
                res++;
            else {
                c = dna[i].charAt(i);
                res = 1;
            }
            if(res == MUTANT_NITROGEN_BASE)
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}



