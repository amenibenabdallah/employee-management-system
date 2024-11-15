public class Departement {
    public class Departement {
        private int id;
        private String nom;
        private int nbEmployes;

        // Constructor without parameters
        public Departement() {}

        // Constructor with parameters
        public Departement(int id, String nom, int nbEmployes) {
            this.id = id;
            this.nom = nom;
            this.nbEmployes = nbEmployes;
        }

        // Getters and Setters
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

        public int getNbEmployes() {
            return nbEmployes;
        }

        public void setNbEmployes(int nbEmployes) {
            this.nbEmployes = nbEmployes;
        }

        // Override equals method
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Departement dep) {
                return this.id == dep.id && this.nom.equals(dep.nom);
            }
            return false;
        }

        // Override toString method
        @Override
        public String toString() {
            return "Departement{id=" + id + ", nom='" + nom + "', nbEmployes=" + nbEmployes + "}";
        }
    }

}
