package com.SchoolDean;

import com.SchoolDean.PraiseAndCommentsModule.Comment;
import com.SchoolDean.PraiseAndCommentsModule.Compliment;

public class Main {
    public static void main(String[] args) {
        Comment comment1 = new Comment("Jan Kowalski");
        comment1.addComment("Trzy nieobecności ucznia w tygodniu. Prosze o kontakt.");
        comment1.displayComments();


        Compliment compliment1 = new Compliment("Jacek Kowalski");
        compliment1.addCompliment("Wzorowa obecność w tygodniu.");
        compliment1.displayCompliments();
    }

}