package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    public String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();


    @Size(max = 150)
    public String getDescription() {
        return description;
    }

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<Job> getJobs() {
        return jobs;
    }

}