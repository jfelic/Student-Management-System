import java.util.Scanner;

public class Student {
    //Attributes
    public String firstName;
    public String lastName;
    public int gradeYear;
    public String[] courses = new String[5];
    public int coursesEnrolled = 0;
    public String studentID;
    public double balance;
    private static int id = 1000;
    private static int cost = 600;

    //Constructor
    //test
    public Student(Scanner in) {

        System.out.print("\nEnter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("\nEnter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println("\nEnter student's current grade level: \n-1 for Freshman\n-2 for Sophomore\n-3 for Junior\n-4 for Senior");
        this.gradeYear = in.nextInt();

        generateID();

        System.out.println("\n" + firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    public void generateID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void courseEnrollment() {
        Scanner in = new Scanner(System.in);
        String[] courseOptions = {"History 101", "Mathematics 101", "English 101", "Chemistry 101", "Computer Science 101"};

        //User instructions//
        System.out.println("Please enter which courses this student will be enrolling in from this list (Or enter \'Q\' to quit): ");
        for (int i = 0; i < courseOptions.length; i++) {
            System.out.println("-" + courseOptions[i]);
        }
        
        //Storing user input//
        for(int i = 0; i < this.courses.length; i++){
            String userInput = in.nextLine();
            if(userInput.equals("Q") || userInput.equals("q")) {
                break;
            } else {
                this.courses[i] = userInput;
                this.coursesEnrolled += 1;
            }
        }
        
        // Print enrolled courses //
        System.out.println("\nEnrolled Courses:");
        for (int i = 0; i < this.courses.length; i++) {
            if(this.courses[i] == null) {this.courses[i] = "Empty";}
            System.out.println(this.courses[i]);
        }
    }

    public void enrollmentCost() {
        this.balance = this.coursesEnrolled * cost;
        System.out.println("\nTotal cost: $" + this.balance);
    }

    public void getBalance(){
        System.out.println(this.balance);
    }

    public void payTuition(double deposit) {
        this.balance = this.balance - deposit;
    }

    public void getStatus() {

    }
}
