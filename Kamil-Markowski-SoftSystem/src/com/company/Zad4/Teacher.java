package com.company.Zad4;

import java.util.List;

public class Teacher {
    private String fistName;
    private String lastName;

    private List<Group> groupList;




    public Teacher(String fistName, String lastName, List<Group> groupList) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.groupList = groupList;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }
}
