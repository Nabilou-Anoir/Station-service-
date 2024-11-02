import java.util.Date;

public class Achat {
    //**Attribut
    private Date date;
    private int poste;
    private Carburant carburant;
    private double quantite;
    private double  prixLitre;
    private double prixpaye;

    //**Constructeurs
    public Achat(Date date, int poste, Carburant carburant, double quantite, double prixLitre, double prixpaye) {
        this.date = date;
        this.poste=poste;
        this.carburant = carburant;
        this.quantite = quantite;
        this.prixLitre = prixLitre;
        this.prixpaye = quantite*prixLitre;
    }
    //***Getters/setters
    public Date getDate() {
        return date;
    }

    public Carburant getCarburant() {
        return carburant;
    }

    public double getQuantite() {
        return quantite;
    }

    public double getPrixLittre() {
        return prixLitre;
    }

    public double getPrixpaye() {
        return prixpaye;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPoste(int poste) {
        this.poste = poste;
    }

    public void setCarburant(Carburant carburant) {
        this.carburant = carburant;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public void setPrixLittre(double prixLitre) {
        this.prixLitre = prixLitre;
    }

    public void setPrixpaye(double prixpaye) {
        this.prixpaye = prixpaye;
    }

    @Override
    public String toString() {
        return "Achat: " +
                "date = " + date +
                ", poste=" + poste +
                ", carburant=" + carburant +
                ", quantite=" + quantite +
                ", prixLitre=" + prixLitre +
                ", prixpaye=" + prixpaye +
                '}';
    }
}
