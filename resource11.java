//attempted Solution https://www.w3resource.com/java-exercises/basic/java-basic-exercise-11.php


import java.util.*;
import java.lang.*;
import java.io.*;



class resource11 {
public static void main (String [] args) {

Scanner var = new Scanner(System.in);
System.out.println("Radius = ");
double x = var.nextDouble();

double perimeter = 2*Math.PI*x;
double area = Math.PI*x*x;

System.out.println("Perimeter= "+perimeter);

System.out.println("Area - " + area);
}

}