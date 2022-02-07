//MyStatistics.java
//App designed to count user inputs for various statistics functions
//Designed by Russ Gleber

import java.util.Scanner;

public class MyStatistics{
  
  // main method
  public static void main(String[] arg){

// declare variables
int n1,n2,n3,n4,n5=0;
int result;
int count_val=0;
int mean_val=0;
int sum_val=0;
Scanner sc=new Scanner(System.in);

// input
System.out.println("Please enter 1st number:");
n1= sc.nextInt();
//increase the count
count_val ++;

System.out.println("Please enter 2nd number:");
n2= sc.nextInt();
//increase the count
count_val ++;

System.out.println("Please enter 3rd number:");
n3= sc.nextInt();
//increase the count
count_val ++;

System.out.println("Please enter 4th number:");
n4= sc.nextInt();
//increase the count
count_val ++;

System.out.println("Please enter 5th number:");
n5= sc.nextInt();
//increase the count
count_val ++;


// calculation
mean_val=(n1+n2+n3+n4+n5/5); //gives the mean
sum_val=(n1+n2+n3+n4+n5); //gives the sum


// print result
System.out.println("Your input has "+count_val+" numbers");
System.out.println("The sum is: "+(sum_val));
System.out.println("The mean is: "+(mean_val));
  }
  
}