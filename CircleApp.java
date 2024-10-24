//Lab Task 3
//Tadisa Jakarasi


import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // creating the scanner object
        double radius, diameter, area;
        System.out.println("*** CIRCLE APP ***");
        System.out.print("Enter radius: "); //prompt for input
        radius = keyboard.nextDouble(); //input method for radius called
        diameter = (radius*2);//calculation being performed
        area = 3.142*(radius*radius);//calculation being performed
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println(" END OF PROGRAM ");
    }
}
