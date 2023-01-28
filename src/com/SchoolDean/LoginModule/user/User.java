package com.SchoolDean.LoginModule.user;

public abstract class User {
    protected final int Id;
    protected String Name;
    protected String Surname;
    protected String Email;
    protected int PhoneNumber;
    protected String Role;

    public User(int id, String name, String surname, String email, int phoneNumber, String role) {
        Id = id;
        Name = name;
        Surname = surname;
        Email = email;
        PhoneNumber = phoneNumber;
        Role = role;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
