package com.tomassirio.mutants.MutantsAPI.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "mutant")
@EntityListeners(AuditingEntityListener.class)
public class Mutant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "dna", nullable = false)
    private String[] dna;

    public Mutant(String[] dna){
        this.dna = dna;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String[] getDna() {
        return dna;
    }

    public void setDna(String[] dna) {
        this.dna = dna;
    }
}