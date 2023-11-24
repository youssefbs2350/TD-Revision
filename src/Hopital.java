import java.util.*;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
        medecinPatiens = new TreeMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        if (!medecinPatiens.containsKey(m)) {
            medecinPatiens.put(m, new ListPatients());
            System.out.println("Le médecin " + m.getNom() + " " + m.getPrenom() + " a été ajouté à l'hôpital.");
        } else {
            System.out.println("Le médecin " + m.getNom() + " " + m.getPrenom() + " existe déjà dans l'hôpital.");
        }
    }


    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatiens.containsKey(m)) {
            medecinPatiens.get(m).ajouterPatient(p);
        } else {
            System.out.println("Le médecin n'existe pas dans l'hôpital.");
        }
    }

    public void afficherMap() {
        System.out.println("Afficher Map");
        medecinPatiens.forEach((medecin, patients) -> {
            System.out.println("Médecin : " + medecin);
            System.out.println("Patients : ");
            patients.afficherPatients();

        });
    }

    public void afficherMedcinPatients(Medecin m) {
        System.out.println("Afficher les Medcins et leurs Patients");
        if (medecinPatiens.containsKey(m)) {
            System.out.println("Médecin : " + m);
            System.out.println("Patients : ");
            medecinPatiens.get(m).afficherPatients();

        } else {
            System.out.println("Le médecin n'existe pas dans l'hôpital.");
        }
    }
}
