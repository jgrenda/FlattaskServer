package hwr.sem4.csa.util;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.io.Serializable;


@Embeddable
public class Dotos implements Serializable{

    private int id = 0;
    private String title = "";
    private String description ="";
    private int value = 0;
    private int duration = 0;
    private Participator assignedTo = null;
  /*  private Participator assignedBy = null;*/

    public Dotos(){

    }

    public Dotos(String title, String description, int value, int duration, Participator assignedTo, Participator assignedBy) {
        this.title = title;
        this.description = description;
        this.value = value;
        this.duration = duration;
        this.assignedTo = assignedTo;
      /*  this.assignedBy = assignedBy;*/
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Participator getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Participator assignedTo) {
        this.assignedTo = assignedTo;
    }

  /*  public Participator getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(Participator assignedBy) {
        this.assignedBy = assignedBy;
    }*/
}
