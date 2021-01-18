package com.company;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimeter += points.get(i).distance(points.get(i+1));
        }

        perimeter += points.get(points.size()-1).distance(points.get(0));
        return perimeter;
    }

    public double getLongestSide() {
        double max = points.get(points.size()-1).distance(points.get(0));
        for (int i = 0; i < points.size() - 1; i++) {
            double distance = points.get(i).distance(points.get(i+1));
            if (distance > max) {
                max = distance;
            }
        }

        return max;
    }

    public double getAverageLength() {
        double perimeter = calculatePerimeter();
        double average = perimeter / points.size();
        return average;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "points=" + points +
                '}';
    }
}
