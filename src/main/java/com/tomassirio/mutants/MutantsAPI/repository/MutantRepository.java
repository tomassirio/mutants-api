package com.tomassirio.mutants.MutantsAPI.repository;


import com.tomassirio.mutants.MutantsAPI.model.Mutant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MutantRepository extends JpaRepository<Mutant, Long> {}