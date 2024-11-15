import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        // prosit 9
        /*Employee e1 = new Employee(2, "Doe", "Jane", "HR", 2);
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
        societe.displayEmploye();*/

        //prosit 10
        Departement d1 = new Departement(1, "HR", 20);
        Departement d2 = new Departement(5, "IT", 50);
        Departement d3 = new Departement(3, "Finance", 30);

        DepartementHashSet departementHashSet = new DepartementHashSet();

        // Adding departments
        departementHashSet.ajouterDepartement(d1);
        departementHashSet.ajouterDepartement(d2);
        departementHashSet.ajouterDepartement(d3);

        // Display all departments
        System.out.println("All departments:");
        departementHashSet.displayDepartement();

        // Search for a department
        System.out.println("\nSearching for IT department: " + departementHashSet.rechercherDepartement("IT"));

        // Remove a department
        departementHashSet.supprimerDepartement(d1);
        System.out.println("\nDepartments after removal:");
        departementHashSet.displayDepartement();

        // Sorting departments by ID
        System.out.println("\nDepartments sorted by ID:");
        System.out.println(departementHashSet.trierDepartementById());
    }
}
