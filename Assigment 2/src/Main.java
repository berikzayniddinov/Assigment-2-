import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // printData method
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

    public static void main(String[] args) {
        // Creating employees and students
        Employee emp1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee emp2 = new Employee("George", "Harrison", "Senior Developer", 50000.00);
        Student stu1 = new Student("Ringo", "Starr", 3.0);
        Student stu2 = new Student("Paul", "McCartney", 2.5);

        // Adding employees and students to the list
        ArrayList<Person> people = new ArrayList<>();


        Collections.addAll(people, emp1, emp2, stu1, stu2);

        // Sorting the list based on the amount of money they make
        Collections.sort(people);

        // Calling printData method
        printData(people);
    }
}