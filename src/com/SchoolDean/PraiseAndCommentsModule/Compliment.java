package com.SchoolDean.PraiseAndCommentsModule;

import java.util.ArrayList;

public class Compliment extends Student {

    private ArrayList<String> compliments;

    public Compliment(String name) {
        super(name);
        this.compliments = new ArrayList<>();
    }

    public void addCompliment(String compliment) {
        compliments.add(compliment);
    }

    public void displayCompliments() {
        System.out.println("Pochwała dla " + name + ":");
        for (String compliment : compliments) {
            System.out.println(compliment);
        }
    }

}
