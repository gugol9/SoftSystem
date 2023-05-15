package com.company.Zad4;

import java.util.List;

public class Group {

    private String name;
    private List<Students> studentsList;
    private Teacher teacher;

    private Students students;


    public Group(String name, List<Students> studentsList, List<Teacher> teachersList) {
        this.name = name;
        this.studentsList = studentsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }


}
