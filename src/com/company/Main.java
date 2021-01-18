package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\aghia\\OneDrive\\Рабочий стол\\file1.txt");
        scanner = new Scanner(file);
        Shape shape = new Shape();

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String a = line.substring(0, line.indexOf(","));
            String b = line.substring(line.indexOf(" ") + 1);

            Point point = new Point(Integer.parseInt(a), Integer.parseInt(b));
            shape.addPoint(point);
        }

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongestSide());
        System.out.println(shape.getAverageLength());
    }
}
