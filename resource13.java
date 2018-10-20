//atempted solution https://www.w3resource.com/java-exercises/basic/java-basic-exercise-13.php 


import java.util.*;
import java.lang.*;
import java.io.*;



class resource13 {
public static void main (String [] args) {

System.out.println("Enter Height and Width : " );
Scanner var = new Scanner(System.in);
double x = var.nextDouble();
double y = var.nextDouble();
double area = x*y;
double perimeter = x+x+y+y;

System.out.println("Area is = "+area);
System.out.println("Perimeter is = "+perimeter);

}
}