package com.pluralsight;
import java.util.*;
public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("Hello world!");

    String firstName = PromptForString("First name:  ");
    String middleName = PromptForString("Middle name:  ");
    String lastName = PromptForString("Last name:  ");
    String suffix = PromptForString("Suffix:  ");

    System.out.println(firstName);
    System.out.println(middleName);
    System.out.println(lastName);
    System.out.println(suffix);

    String fullname;

        if (middleName.isBlank()){
            middleName = " ";
        }
        else{
            middleName = " " + middleName + " ";
        }

        if(!suffix.isBlank()){
            suffix = ", " + suffix;
        }

        fullname = firstName + middleName + lastName + suffix;

        System.out.println("Hello " + fullname);


    }


    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
