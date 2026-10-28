/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;
import java.util.*;
/**
 *
 * @author USER
 */
public class StudentInformationSystem {

   
    public static void main(String[] args) {
        String studentName = "aki";
        String studentID = "s88887";
        Scanner scan = new Scanner(System.in);
        
        int mark1;
        int mark2;


        System.out.println("Student Information System");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        
        //store mark1
        System.out.print("Mark 1: ");
        mark1 = scan.nextInt();
        
        //store mark 2
        System.out.print("Mark 2: ");
        mark2 = scan.nextInt();
        
        //calculation operation
        int totalMark = mark1 + mark2;

        System.out.println("Total Mark: " + totalMark);

        if (totalMark >= 80) {
            System.out.println("Grade: Excellent");
        } else if (totalMark >= 60) {
            System.out.println("Grade: Good");
        } else {
            System.out.println("Grade: Needs Improvement");
        }
    }
    
}
