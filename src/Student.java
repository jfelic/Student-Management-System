import java.util.Scanner;

public class Student {
    //Attributes
    public String firstName;
    public String lastName;
    public int gradeYear;
    public String[] courses = new String[5];
    public String studentID;
    public double balance;
    private static int id = 1000;
    private static int cost = 600;

    //Constructor
    //test
    public Student(Scanner in) {

        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's current grade level: ");
        this.gradeYear = in.nextInt();

        generateID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    public void generateID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void courseEnrollment() {
        String[] courses = {"History 101", "Mathematics 101", "English 101", "Chemistry 101", "Computer Science 101"};
        System.out.println("Please enter which courses this student will be enrolling in from this list: ");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("-" + courses[i]);
        }
        System.out.println("*Enter Q when finished*");

        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < this.courses.length - 1; i++){
            this.courses[i] = in.nextLine();
            if(this.courses[i].equals("Q") || this.courses[i].equals("q")) 
                break;
        }

        // int i = 0;
        // do {
        //     if(i == 5)
        //         break;
        //     this.courses[i] = in.nextLine();
        //     if(this.courses[i].equals("Q") || this.courses[i].equals("q")) 
        //         break;
        //     else
        //         i++;  
        // }
        // while (1 != 0);

    // Print enrolled courses
    System.out.println("Enrolled Courses:");
    for (String course : this.courses) {
        System.out.println(course);
    }
        in.close();

    }

    public double enrollmentCost(int numOfClasses) {
        return 0.0;
    }

    public void getBalance(){

    }

    public void payTuition(double deposit) {

    }

    public void getStatus() {

    }
}
