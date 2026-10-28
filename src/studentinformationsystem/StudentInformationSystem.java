/***************************************************************** 
* Author:Ummu Hanie' Bt Mohd sabri
* Program name:student information system
* Description:to display student basic information 
* Date:28 October 2026
* modified date:none
* version:1.0
*****************************************************************/

package studentinformationsystem;

public class StudentInformationSystem {
    public static void main(String[] args) {
        //store student information
        String studentName = "Nur Dini"; 
        String studentID = "12345";
        
    //store students mark
    int mark1 = 85;
    int mark2 = 90;
    //calculate total marks
    int total = mark1 + mark2;
    //display student information and results
    System.out.println("Student Information System");
    System.out.println("Student Name: " + studentName);
    System.out.println("Student ID: " + studentID);
    System.out.println("Mark 1: " + mark1);
    System.out.println("Mark 2: " + mark2);
    System.out.println("Total Marks: " + total);
    //determine the student results
    if (total >= 160) {
        System.out.println("Result: Excellent");
    } else if (total >= 100) {
        System.out.println("Result: Good");
    } else {
        System.out.println("Result: Needs Improvement");
    }
}
}
    