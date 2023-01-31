package com.example.alireza.onlineshop;

public class newUser {
    private String Username, Name, FamilyName, Password;
    private int Age;

    newUser() {}

    newUser(String User, String Pass, String FirstName, String LastName, int howOld) {
        Username = User;
        Password = Pass;
        Name = FirstName;
        FamilyName = LastName;
        Age = howOld;
    }

    newUser(String User, String Pass) {
        Username = User;
        Password = Pass;
    }

    public String getUsername() {
        return Username;
    }

    public String getName() {
        return Name;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public String getPassword() {
        return Password;
    }

    public int getAge() {
        return Age;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setFamilyName(String familyName) {
        FamilyName = familyName;
    }
}
class newAdmin extends newUser {
    newAdmin() {
        super();
    }

    newAdmin(String User, String Pass, String FirstName, String LastName, int howOld) {
        super(User, Pass, FirstName, LastName, howOld);
        // add new atributs
        //this.new = felan
    }
}