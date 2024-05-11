package com.example.online_aram_project;

public class CurrentDictationItem {
    private String name;
    private String email;
    private String current;
    private String place;

    public CurrentDictationItem(){}

    public CurrentDictationItem(String name, String email, String current, String place) {
        this.name = name;
        this.email = email;
        this.current = current;
        this.place = place;
    }

    public String getName() {return name;}

    public String getEmail() {return email;}

    public String getCurrent() {return current;}

    public String getPlace() {return place;}


}
