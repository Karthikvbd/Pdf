package com.tnsifDAY4;



import java.util.Scanner;



public class CollegeFee {

 public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);



     // Get student details

     System.out.println("Enter student details:");

     System.out.print("Student ID: ");

     int studentId = scanner.nextInt();

     scanner.nextLine(); // Consume newline

     System.out.print("Student Name: ");

     String studentName = scanner.nextLine();

     System.out.print("Department: ");

     String department = scanner.nextLine();

     System.out.print("Gender: ");

     String gender = scanner.nextLine();

     System.out.print("Category (Hosteller/DayScholar): ");

     String category = scanner.nextLine();

     System.out.print("College Fee: ");

     double collegeFee = scanner.nextDouble();



     // Based on category, create appropriate object and calculate total fee

     if (category.equals("Hosteller")) {

         System.out.print("Room Number: ");

         int roomNumber = scanner.nextInt();

         System.out.print("Block Name: ");

         char blockName = scanner.next().charAt(0);

         scanner.nextLine(); // Consume newline

         System.out.print("Room Type (AC/Non-AC): ");

         String roomType = scanner.nextLine();



         Hosteller hosteller = new Hosteller(studentId, studentName, department, gender, category, collegeFee,

                 roomNumber, blockName, roomType);

         double totalFee = hosteller.calculateTotalFee();

         System.out.println("Total Fee: " + totalFee);

     } else if (category.equals("DayScholar")) {

         System.out.print("Bus Number: ");

         int busNumber = scanner.nextInt();

         System.out.print("Distance: ");

         float distance = scanner.nextFloat();



         DayScholar dayScholar = new DayScholar(studentId, studentName, department, gender, category, collegeFee,

                 busNumber, distance);

         double totalFee = dayScholar.calculateTotalFee();

         System.out.println("Total Fee: " + totalFee);

     } else {

         System.out.println("Invalid category entered.");

     }



     scanner.close();

 }

}
