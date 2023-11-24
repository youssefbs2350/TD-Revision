import java.util.HashSet;
import java.util.Set;

public class SetMedecins {
    private Set<Medecin> setM;

    public SetMedecins() {
        setM = new HashSet<>();
    }

    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }

    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(medecin -> medecin.getCin() == cin);
    }

    public void afficherMedecins() {
        setM.forEach(medecin -> System.out.println(medecin.toString()));
    }

    public long nombreMedecins() {
        return setM.size();
    }
}
