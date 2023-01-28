package com.SchoolDean.SchoolDeanModule;

import java.util.HashMap;
import java.util.Map;

public abstract class schoolJournal {
    final String SchoolClass;
    protected int Grade;
    protected String Student;

    public schoolJournal(String schoolClass, int grade, String student) {
        this.SchoolClass = schoolClass;
        this.Grade = grade;
        this.Student = student;
    }

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }

    public String removeStudent(String student){
        return student;
    }

    public String getSchoolClass() {
        return SchoolClass;
    }

    public int addGrade(int grade) {
        Grade = grade;
        return grade;
    }

    public int removeGrade(int grade){
        return grade;
    }



}
