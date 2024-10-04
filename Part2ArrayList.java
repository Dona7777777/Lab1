package edu.neu.mgen.lab;

import java.util.ArrayList;

public class Part2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Dona");
        names.add("Mike");
        names.add("Andy");
        names.add("James");
        names.add("John");
        ArrayList<String> newNames = new ArrayList<>();
        for (String name : names) {
            char first = Character.toLowerCase(name.charAt(0));
            char last = Character.toUpperCase(name.charAt(name.length() - 1));
            String middle = name.substring(1, name.length() - 1);
            String newName = last + middle + first;
            newNames.add(newName);
        }
        System.out.print("Names = { ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
            if (i < names.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");

        System.out.print("Names (switched) = { ");
        for (int i = 0; i < newNames.size(); i++) {
            System.out.print(newNames.get(i));
            if (i < newNames.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }
}
