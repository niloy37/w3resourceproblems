// attempted solution - https://www.w3resource.com/java-exercises/basic/java-basic-exercise-15.php


import java.util.*;

class SwapVariables{
public static void main (String [] args){
Scanner var = new Scanner(System.in);
System.out.println("Enter a= ");
int a = var.nextInt();
System.out.println("Enter b =");
int b = var.nextInt();


System.out.println("A= "+a+" B= "+b);
//swapping a and b
int temp =a;
a=b;
b=temp;
System.out.println("Printing variables after swapping...");
System.out.println("A= "+a+" B= "+b);





  }
}