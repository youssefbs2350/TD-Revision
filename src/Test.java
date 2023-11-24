public class Test{

    public static void main(String[] args) {


        Hopital hopital = new Hopital();

        // Ajout de médecins
        Medecin medecin1 = new Medecin(1, "AHMED", "MOHAMED", 1);
        Medecin medecin2 = new Medecin(2, "SAMIR", "JANEN", 4);

        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);

        // Ajout de patient

        Patient patient1 = new Patient(13, "MOHSEN", "BEN AHMED", 11);
        Patient patient2 = new Patient(11, "HASSEN", "SFEN", 21);
        Patient patient3 = new Patient(11, "HSAN", "KHALED", 35);

        hopital.ajouterPatient(medecin1, patient1);
        hopital.ajouterPatient(medecin1, patient2);
        hopital.ajouterPatient(medecin2, patient3);


        hopital.afficherMap();



        SetMedecins setMedecins = new SetMedecins();
        setMedecins.ajouterMedecin(medecin2);
        setMedecins.ajouterMedecin(medecin1);

        setMedecins.afficherMedecins();
    }
}
