package com.tomassirio.mutants.MutantsAPI.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class Mutant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "created_at", nullable = false)
    @CreatedDate
    private Date createdAt;
    @Column(name = "created_by", nullable = false)
    @CreatedBy
    private String createdBy;
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;
    @Column(name = "updated_by", nullable = false)
    @LastModifiedBy
    private String updatedBy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets created at.
     *
     * @return the created at
     */
    public Date getCreatedAt() {
        return createdAt;
    }
    /**
     * Sets created at.
     *
     * @param createdAt the created at
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    /**
     * Gets created by.
     *
     * @return the created by
     */
    public String getCreatedBy() {
        return createdBy;
    }
    /**
     * Sets created by.
     *
     * @param createdBy the created by
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    /**
     * Gets updated at.
     *
     * @return the updated at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }
    /**
     * Sets updated at.
     *
     * @param updatedAt the updated at
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    /**
     * Gets updated by.
     *
     * @return the updated by
     */
    public String getUpdatedBy() {
        return updatedBy;
    }
    /**
     * Sets updated by.
     *
     * @param updatedBy the updated by
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}