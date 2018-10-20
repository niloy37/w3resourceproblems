//attempted solution https://www.w3resource.com/java-exercises/basic/java-basic-exercise-12.php 

import java.util.*;
import java.lang.*;
import java.io.*;



class resource12 {
public static void main (String [] args) {

System.out.println("Enter 3 numbers : " );
Scanner var = new Scanner(System.in);
double x = var.nextDouble();
double y = var.nextDouble();
double z = var.nextDouble();
double average = (x+y+z)/3;
System.out.println("Average = "+average);



}

}