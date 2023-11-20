/* Project instructions:
         * -You are a Database Admin for a university and need to create an 
         * application to manage student enrollments and balance.
         * 
         * -Your application should do the following:
         *      -Ask the user how many students will be added to the database
         *      -The user should be prompted to enter the name and year for 
         *       each student.
         *      -The student should have a 5-digit unique ID, with the first
         *       number being their grade level
         *      -A student can enroll in the following courses:
         *          -History 101
         *          -Mathematics 101
         *          -English 101
         *          -Chemistry 101
         *          -Computer Science 101
         *      -Each course costs $600 to enroll
         *      -The student should be able to view their balanace and pay 
         *       tuition.
         *      -To see the status of the student, we should see their name,
         *       ID, courses enrolled, and balance.
         */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("How many students will you be entering into the database?");
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for(int i = 0; i < numOfStudents; i++) {
            in.nextLine();
            students[i] = new Student(in);
            students[i].courseEnrollment(in);
            students[i].enrollmentCost();
            System.out.println("Would you like to make a payment?(Enter \'y\' for yes or \'n\' for no): ");
            String answer = in.nextLine();
            if (answer.equals("y") || answer.equals('Y')){
                System.out.println("\nPlease enter payment amount: ");
                double payment = in.nextDouble();
                in.nextLine();
                students[i].payTuition(payment, in);
            } else {
                System.out.println("\nNo payment received.\n");
            }
            students[i].getStatus();
        }

        System.out.println("");
    }
}

