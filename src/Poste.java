
public class Poste {
    //**Les postes
    private int numeroPoste;
    private String type;
    private String horaire;
    private double quantiteCarbutant=0;
    private double prixLitre=0;
    private double prixTotalAPayer=0;
    private Carburant carburantPoste;

    // **Constructeurs
    public Poste(int numeroPoste,String type) {
        this.numeroPoste = numeroPoste;
        this.type = type;
    }
    public Poste(int numeroPoste, String type, String horaire) {
        this.numeroPoste = numeroPoste;
        this.horaire =horaire;

    }
    public Poste(int numeroPoste, Carburant carburant) {
        this.numeroPoste = numeroPoste;
        this.carburantPoste = carburant;
        resetCompteurs();
    }
    public void resetCompteurs() {
        this.quantiteCarbutant = 0;
        this.prixLitre = 0;
        this.prixTotalAPayer = 0;
    }
    //**Affichage
    @Override
    public String toString() {
        return "Poste" +
                " n° " + numeroPoste +
                " horaire " + horaire + '\'';
    }
    //**Setter et getter Compteurs
    public void setCompteurs(int quantiteCarbutant,int prixAuLittre) {
        quantiteCarbutant=quantiteCarbutant;
        prixAuLittre=prixAuLittre;

    }

    public void setNumeroPoste(int numeroPoste) {
        this.numeroPoste = numeroPoste;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public void setQuantiteCarbutant(double quantiteCarbutant) {
        this.quantiteCarbutant = quantiteCarbutant;
    }

    public void setPrixLitre(double prixLitre) {
        this.prixLitre = prixLitre;
    }

    public void setPrixTotalAPayer(double prixTotalAPayer) {
        this.prixTotalAPayer = prixTotalAPayer;
    }

    public void setCarburantPoste(Carburant carburantPoste) {
        this.carburantPoste = carburantPoste;
    }

    public Carburant getCarburantPoste() {
        return carburantPoste;
    }

    public double getPrixTotalAPayer() {
        return prixTotalAPayer;
    }

    public double getPrixLitre() {
        return prixLitre;
    }

    public double getQuantiteCarbutant() {
        return quantiteCarbutant;
    }

    public String getHoraire() {
        return horaire;
    }

    public int getNumeroPoste() {
        return numeroPoste;
    }
}