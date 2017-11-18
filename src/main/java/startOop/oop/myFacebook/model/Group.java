package startOop.oop.myFacebook.model;

import java.time.LocalDate;

public class Group {

    private String name;
    private String followrs;
    private LocalDate dateOfCreate;

    public Group(String name, String followrs, LocalDate dateOfCreate) {
        this.name = name;
        this.followrs = followrs;
        this.dateOfCreate = dateOfCreate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFollowrs() {
        return followrs;
    }
    public void setFollowrs(String followrs) {
        this.followrs = followrs;
    }
    public LocalDate getDateOfCreate() {
        return dateOfCreate;
    }
    public void setDateOfCreate(LocalDate dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    @Override
    public String toString() {
        return "Group " +
                "name='" + name + '\'' +
                ", followrs='" + followrs + '\'' +
                ", dateOfCreate='" + dateOfCreate + '\'';
    }
}
