package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setName("Balenbay");
        System.out.println(student.getName());
    }
}
