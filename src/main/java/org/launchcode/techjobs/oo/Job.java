package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job () {
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }



    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String noDataString = "Data not available";
        if (getName() == null && getCoreCompetency() == null && getPositionType() == null && getLocation() == null && getEmployer() == null){
            return "OOPS! This job does not seem to exist.";
        }
        if (this.name.isEmpty()) {
            setName(noDataString);
        }
        if (this.employer.toString().isEmpty()) {
            setEmployer(new Employer(noDataString));
        }
        if (this.location.toString().isEmpty()) {
            setLocation(new Location(noDataString));
        }
        if (this.positionType.toString().isEmpty()) {
            setPositionType(new PositionType(noDataString));
        }
        if (this.coreCompetency.toString().isEmpty()) {
            setCoreCompetency(new CoreCompetency(noDataString));
        }
      String solution = System.lineSeparator() + " ID: " + getId() + "\r\n" + " Name: " + getName() + "\r\n" + " Employer: " + getEmployer() + "\r\n" + " Location: " + getLocation() + "\r\n" + " Position Type: " + getPositionType() + "\r\n" + " Core Competency: " + getCoreCompetency() + System.lineSeparator();
      return solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
