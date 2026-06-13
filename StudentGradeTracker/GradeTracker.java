import java.util.HashMap;
import java.util.Scanner;

public class GradeTracker {

    static HashMap<String, Integer> students = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Report");
            System.out.println("3. Search Student");
            System.out.println("4. Update Grade");
            System.out.println("5. Delete Student");
            System.out.println("6. Top Performer");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayReport();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateGrade();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    displayTopper();
                    break;

                case 7:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void addStudent() {

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine().trim();

        if (students.containsKey(name)) {
            System.out.println("Student already exists!");
            return;
        }

        System.out.print("Enter Grade (0-100): ");
        int grade = sc.nextInt();
        sc.nextLine();

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid Grade!");
            return;
        }

        students.put(name, grade);

        System.out.println("Student Added Successfully!");
    }

    public static void searchStudent() {

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        if (students.containsKey(name)) {
            System.out.println("Grade: " + students.get(name));
        } else {
            System.out.println("Student Not Found!");
        }
    }

    public static void updateGrade() {

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        if (!students.containsKey(name)) {
            System.out.println("Student Not Found!");
            return;
        }

        System.out.print("Enter New Grade: ");
        int grade = sc.nextInt();
        sc.nextLine();

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid Grade!");
            return;
        }

        students.put(name, grade);

        System.out.println("Grade Updated Successfully!");
    }

    public static void deleteStudent() {

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        if (students.remove(name) != null) {
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }
    }

    public static double calculateAverage() {

        int sum = 0;

        for (int grade : students.values()) {
            sum += grade;
        }

        return (double) sum / students.size();
    }

    public static int getHighestScore() {

        int highest = Integer.MIN_VALUE;

        for (int grade : students.values()) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    public static int getLowestScore() {

        int lowest = Integer.MAX_VALUE;

        for (int grade : students.values()) {
            if (grade < lowest) {
                lowest = grade;
            }
        }

        return lowest;
    }

    public static void displayTopper() {

        if (students.isEmpty()) {
            System.out.println("No Student Data Available!");
            return;
        }

        String topper = "";
        int highest = Integer.MIN_VALUE;

        for (String s : students.keySet()) {

            if (students.get(s) > highest) {
                highest = students.get(s);
                topper = s;
            }
        }

        System.out.println("\n----- Top Performer -----");
        System.out.println("Name  : " + topper);
        System.out.println("Grade : " + highest);
    }

    public static void displayReport() {

        if (students.isEmpty()) {
            System.out.println("No Student Data Available!");
            return;
        }

        System.out.println("\n----- Student Summary Report -----");

        for (String s : students.keySet()) {

            System.out.println(
                    "Name : " + s +
                    " | Grade : " + students.get(s)
            );
        }

        System.out.printf("\nAverage Score : %.2f%n", calculateAverage());
        System.out.println("Highest Score : " + getHighestScore());
        System.out.println("Lowest Score  : " + getLowestScore());
        System.out.println("Total Students: " + students.size());
    }
}