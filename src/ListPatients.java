import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListPatients implements InterfacePatient {
    private List<Patient> listP;

    public ListPatients() {
        listP = new ArrayList<>();
    }


    public void ajouterPatient(Patient p) {
        listP.add(p);
    }


    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }


    public boolean rechercherPatient(Patient p) {
        return listP.contains(p);
    }


    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);
    }

    public void afficherPatients() {
        System.out.println("Liste des patients : ");
        listP.forEach(patient -> System.out.println(patient.toString()));

    }

    public void trierPatientsParNom() {
        System.out.println("Liste des patients triés par nom : ");
        listP.sort(Comparator.comparing(Patient::getNom));
        listP.forEach(patient -> System.out.println(patient.toString()));

    }

}
