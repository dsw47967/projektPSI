package com.SchoolDean.LoginModule.user;

public class ParentsStudent extends User {
    public ParentsStudent(int id, String name, String surname, String email, int phoneNumber, String role) {
        super(id, name, surname, email, phoneNumber, role);
    }
    public String viewStudentGrades(){
        return "Oceny";
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public int getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(int phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }
}
