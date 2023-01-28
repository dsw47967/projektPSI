package com.SchoolDean.LoginModule.user;

public class ITAdminstrator extends User {
    public ITAdminstrator(int id, String name, String surname, String email, int phoneNumber, String role) {
        super(id, name, surname, email, phoneNumber, role);
    }

    public void generateErrorReport(){
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setPhoneNumber(int phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getRole() {
        return super.getRole();
    }

    @Override
    public void setRole(String role) {
        super.setRole(role);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public int getPhoneNumber() {
        return super.getPhoneNumber();
    }
}
