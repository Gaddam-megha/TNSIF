import com.Meghana.assignment.employees.Developer;
import com.Meghana.assignment.employees.Manager;
import com.Meghana.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
        Manager m = new Manager("Asha", "M-101", 95000, 8);
        Developer d = new Developer("Ravi", "D-202", 85000, "Java");

        System.out.println("== Before raises ==");
        System.out.println(EmployeeUtilities.summary(m));
        System.out.println(EmployeeUtilities.summary(d));

        EmployeeUtilities.giveRaise(m, 5.0);   // +5%
        EmployeeUtilities.giveRaise(d, 10.0);  // +10%

        System.out.println("\n== After raises ==");
        System.out.println(EmployeeUtilities.summary(m));
        System.out.println(EmployeeUtilities.summary(d));

        System.out.println("\nHigh earners (>= 90,000)?");
        System.out.println("Manager:   " + EmployeeUtilities.isHighEarner(m, 90000));
        System.out.println("Developer: " + EmployeeUtilities.isHighEarner(d, 90000));

        
    }
}


