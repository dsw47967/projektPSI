package com.SchoolDean.SchoolDeanModule.SchoolClass;

import com.SchoolDean.SchoolDeanModule.schoolJournal;

import java.util.Map;

public class SchoolClass1A extends schoolJournal {
    public SchoolClass1A(String schoolClass, int grade, Map<String, schoolJournal> students, String student) {
        super(schoolClass, grade, student);
    }

    @Override
    public String getStudent() {
        return super.getStudent();
    }

    @Override
    public void setStudent(String student) {
        super.setStudent(student);
    }

    @Override
    public String removeStudent(String student) {
        return super.removeStudent(student);
    }

    @Override
    public String getSchoolClass() {
        return super.getSchoolClass();
    }

    @Override
    public int addGrade(int grade) {
        return super.addGrade(grade);
    }

    @Override
    public int removeGrade(int grade) {
        return super.removeGrade(grade);
    }
}
