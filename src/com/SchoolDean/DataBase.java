package com.SchoolDean;

public class DataBase {
    public DataBase(String url, String user, String password) {
    }
    String addUser(){
        return "Dodano użytkownika";
    }
    String addStudent(){
        return "Dodano ucznia";
    }
    String removeUser(){
        return "Usunięto użytkownika";
    }
    String removeStudent(){
        return "Usunięto ucznia";
    }
    String editUser(){
        return "Modyfikacja użytkownika";
    }
    String editStudent(){
        return "Modyfikacja ucznia";
    }
}
