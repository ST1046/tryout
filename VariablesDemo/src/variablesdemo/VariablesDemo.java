/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variablesdemo;

/**
 *
 * @author lab_services_student
 */

import java.util.Scanner;

public class VariablesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        String studentName;
        int studentAge;
        double resultAverage; 
        boolean isRegistered = true; 
        
        System.out.println("-------------------------");
        
         Scanner input = new Scanner(System.in); //calling the inbuilt scanner class that allows us to use inputs
        
        System.out.println("Enter the student name:");
        studentName = input.nextLine();    //when its a simple string then only use 'input.nextLine()'
        System.out.println("Student name is:"+ studentName);
        
        System.out.println("Student age is:");
        studentAge = input.nextInt();  //because its an interger make use of nextLine TWICE
        input.nextLine(); 
        System.out.println("Student age is:"+ studentAge);
        
        System.out.println("Student Average is:" );
        resultAverage = input.nextDouble();
        input.nextLine();
        System.out.println("Student result is:"+ resultAverage);
        
        System.out.println("Is the user registered or not (yes) or (no)");
        String response = input.nextLine().trim().toLowerCase();
        isRegistered = response.equals("yes");
        System.out.println("Registered:" + isRegistered);
        
        //close scanner
        input.close();
        
        /* A student managment need to print out the student
        details name, age, result average and rexprd of yje syidemy os registered
        or not. In this task you are required to print out a students Details in
        */
      /*  
       String studentName = "Jade Lewis";
        int studentAge = 20;
        double resultAverage = 90.5;
        boolean isRegistered= true; 
        
        System.out.println("------Student Details---");
        System.out.println("Student Name:" + studentName);
        System.out.println("Student Age:" + studentAge);
        System.out.println("Student Average:" + resultAverage);
        System.out.println("Is student Registered:" + isRegistered);
        
        
         String carBrand = "Toyota";
        int modelYear = 2023;
        double engineCapacity = 1.5;
        boolean isCarNew= true; 
        
        System.out.println("------Car Details---");
        System.out.println("Car Brand:" + carBrand);
        System.out.println("Model Age:" + modelYear);
        System.out.println("Engine Capacity:" + engineCapacity + "   Liters");
        System.out.println("Is the car new:" + isCarNew); */
    }
    
}
