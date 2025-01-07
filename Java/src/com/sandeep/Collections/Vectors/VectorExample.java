package com.sandeep.Collections.Vectors;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        v1.add("Sandeep");
        v1.add("Shavukari");
        v1.add("1");
        v1.add("2");
        v1.add("3");
        v1.add("4");
        v1.add("5");
        v1.add("6");
        v1.add("7");
        v1.add("8");
        v1.add("9");

        System.out.println("Original Vector: " + v1);
        System.out.println("Capacity: " + v1.capacity());
        System.out.println("Size: " + v1.size());
        System.out.println("Is Vector Empty? " + v1.isEmpty());

        Vector v2 = new Vector<>(v1);
        v2.add(5, "Inserted");
        v2.set(0, "Updated");
        v2.setElementAt("NewElement", 3);

        System.out.println("Updated Vector: " + v2);

        Vector v3 = new Vector(v1);
        System.out.println("Element at index 1: " + v3.get(1));
        System.out.println("Element at index 2 using elementAt: " + v3.elementAt(2));

        Vector deleteVector = new Vector(v1);
        deleteVector.remove(7);
        deleteVector.remove("Shavukari");

        System.out.println("Vector after Deletions: " + deleteVector);

        Vector clearVector = new Vector(v1);
        clearVector.clear();

        System.out.println("Cleared Vector: " + clearVector);
        System.out.println("Is Cleared Vector Empty? " + clearVector.isEmpty());
    }
}
