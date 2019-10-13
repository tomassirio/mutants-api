package com.tomassirio.mutants.MutantsAPI.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "stats")
@EntityListeners(AuditingEntityListener.class)
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "mutant_count", nullable = false)
    int mutant_count;
    @Column(name = "human_count", nullable = false)
    int human_count;
    @Column(name = "ratio", nullable = false)
    int ratio;
}
