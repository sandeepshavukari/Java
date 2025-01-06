package com.sandeep.Collections.Vectors;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add("Sandeep");
        v.add("Shavukari");
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        v.add("6");
        v.add("7");
        v.add("8");
        v.add("9");

        System.out.println(v);
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Size: " + v.size());

        Vector cv = new Vector<>(v);
        cv.add(5, "Sandy");

        System.out.println(cv);
        System.out.println("Capacity: " + cv.capacity());
        System.out.println("Size: " + cv.size());

        Vector uv = new Vector<>(v);
        uv.set(0, "Updated");
        uv.remove(7);

        System.out.println(uv);
    }
}
