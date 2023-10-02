package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToMany()
    @JoinTable(name = "job_skills",
            joinColumns = @JoinColumn(name = "jobs_id"),
            inverseJoinColumns = @JoinColumn(name = "skills_id"))
    private List<Skill> skills;

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.



    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
