package org.example;

import java.util.Scanner;

class Area {
private double length;
private double breath;
public Area(double length, double breath ){
    this.length =length;
    this.breath=breath;

    }
    public double returnArea(){
    return length*breath;
    }
}
public class Areah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of regtangle");
        double length = scanner.nextDouble();
        System.out.println("Enter the breath");
        double breath = scanner.nextDouble();

        if (length <= 0) {
            System.out.println("Wrong entry");
        }
        if (breath <= 0) {
            System.out.println("Wrong entry");
        }
        Area rectangle = new Area(length,breath);
        double area = rectangle.returnArea();
        System.out.println(area);
    }
}



