//package com.example.src;
//import statement declaration
import java.util.Scanner;
//Class declaration
public class Hello{
// Field/Variable/Attribute/Properties declaration
private String message;
//Parameterized Constructor declaration
public Hello(String message) {
this.message = message;
}
//Main method declaration
public static void main(String[] args){
// Object declaration
Hello program = new Hello("Hello, World!");
//calling (invoking) of instance method
program.printMessage();
//Scanner class object for user input
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
//read the user entered input
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");
//close the scanner object
scanner.close();
}
//method declaration to print message
public void printMessage()
{
//method implementation
System.out.println(message);
}
}
