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
         *      -To see the status of the student, we should see thier name,
         *       ID, courses enrolled, and balance.
         */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("How many students will you be entering into the database?");
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        Student stuTest = new Student(in);
        // for(int i = 0; i < numOfStudents; i++) {
        //     in.nextLine();
        //     students[i] = new Student(in);
        //     students[i].courseEnrollment();
        //     students[i].enrollmentCost();
        // }

        in.close();
    }
}

