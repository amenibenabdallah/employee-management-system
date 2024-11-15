import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion <Employee>{
    List<Employee> employees;

    public SocieteArrayList(List employees){
        this.employees=new ArrayList<>(employees);
    }
    @Override
    public void ajouterEmploye(Employee employee) {
           employees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
            for(Employee e:employees){
                if(e.getNom().equals(nom)){
                    return true;
                }
            }

        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        return employees.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employee employee) {
         employees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        System.out.println(this.employees);
    }

    @Override
    public void trierEmployeParId() {
        employees.sort(Comparator.comparingInt(Employee::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
         employees.sort(Comparator.comparing(Employee::getNom)
                 .thenComparing(Employee::getNomDepartement)
                 .thenComparing(Employee::getGrade));
    }
}
