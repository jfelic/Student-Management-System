import java.util.Scanner;

public class Student {
    //Attributes
    public String firstName;
    public String lastName;
    public int gradeYear;
    public String[] courses;
    public String studentID;
    public double balance;
    private static int id = 1000;
    private static int cost = 600;

    //Constructor
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's current grade level: ");
        this.gradeYear = in.nextInt();
        in.close();

        generateID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
        in.close();
    }

    public void generateID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void courseEnrollment() {

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
