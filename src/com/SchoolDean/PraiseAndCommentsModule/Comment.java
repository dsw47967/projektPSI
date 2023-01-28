package com.SchoolDean.PraiseAndCommentsModule;

import java.util.ArrayList;

public class Comment extends Student {

    private ArrayList<String> comments;
    public Comment(String name) {
        super(name);
        this.comments = new ArrayList<>();
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public void displayComments() {
        System.out.println("Uwaga dla " + name + ":");
        for (String comment : comments) {
            System.out.println(comment);
        }
    }
}
