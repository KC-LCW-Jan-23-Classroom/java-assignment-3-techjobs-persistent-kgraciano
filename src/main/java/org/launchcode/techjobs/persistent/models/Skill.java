package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    public String description;

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


}