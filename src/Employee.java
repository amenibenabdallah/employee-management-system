public class Employee {
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    public Employee(){}

    public Employee(int id, String nom, String prenom, String nomDepartement, int grade){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nomDepartement=nomDepartement;
        this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean equals (Object obj){
        if (this==obj){
            return true;
        }
        if(obj instanceof Employee e){
            return this.id == e.id && this.nom.equals(e.nom);
        }
        return false;
    }
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom Departement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }
}
