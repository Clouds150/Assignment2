
package formatterrr;

public class Formatterrr {
    public static void main(String[] args) {
        String name = "Alexis";
        int age = 25;
        double salary = 50000.50;

        String formattedString = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);

        System.out.println(formattedString);
    }
}
