import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {


        Employee e1 = new Employee(2, "Doe", "Jane", "HR", 2);
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(1, "Smith", "John", "Finance", 3));
        employeeList.add(new Employee(2, "Doe", "Jane", "HR", 2));
        employeeList.add(new Employee(3, "Brown", "Charlie", "IT", 1));

        SocieteArrayList societe = new SocieteArrayList(employeeList);



        System.out.println("All employees:");
        societe.displayEmploye();

        System.out.println("\nSearch for employee 'Smith':");
        System.out.println(societe.rechercherEmploye("Smith"));
        System.out.println("\nSearch for employee 'e1':");
        System.out.println(societe.rechercherEmploye(e1));
        System.out.println("\nremove employee 'e1':");
        societe.supprimerEmploye(e1);
        System.out.println("\n societe after removing e1");
        societe.displayEmploye();
        // Sort employees by ID
        societe.trierEmployeParId();
        System.out.println("\nAfter sorting by ID:");
        societe.displayEmploye();

        // Sort employees by name, department, and grade
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\nAfter sorting by name, department, and grade:");
        societe.displayEmploye();
    }
}
