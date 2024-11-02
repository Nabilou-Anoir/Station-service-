import java.util.EnumMap;

public class Citerne {
    private double niveauCourant;
    private double niveauDalerte=1000;
    private double niveauMinimal=500;
    private Carburant carburant;


    //** Constructeurs(3 citernes/ carburant/ alimentent les postes :

    public Citerne(Carburant carburant,double niveauCourant) {
       this.carburant=carburant;
       this.niveauCourant=niveauCourant;
   }

    public Citerne(Carburant carburant, double niveauCourant, double niveauDalerte, double niveauMinimal) {
        this.niveauCourant = niveauCourant;
        this.niveauDalerte = niveauDalerte;
        this.niveauMinimal = niveauMinimal;
        this.carburant = carburant;
    }
    //** Affichage
    @Override
    public String toString() {
        return "Citerne{" +
                "niveauCourant=" + niveauCourant +
                ", niveauDalerte=" + niveauDalerte +
                ", niveauMinimal=" + niveauMinimal +
                ", carburant=" + carburant +
                '}';
    }
    //**fonction Remplirciterne: remplit les citernes
    // **parametre :citerne
    //**Sortie: boolean
    public void  remplirciterne(double quantite) {
       niveauCourant+=quantite; ; // fait**** YC : La méthode ne fais pas ce que l'on veut. Que veux-tu faire quand tu remplis la citerne ? Mettre à jour le niveauCourant avec un nouveau niveau. Donc il faut le nouveau niveau en parametre, et une modification de l'attribut correspondant dans la méthode.
    }
    public double getNiveauCourant() {
        return niveauCourant;
    }

    public double getNiveauDalerte() {
        return niveauDalerte;
    }

    public double getNiveauMinimal() {
        return niveauMinimal;
    }

    public Carburant getCarburant() {
        return carburant;
    }


    public void setNiveauCourant(double niveauCourant) {
        this.niveauCourant = niveauCourant;
    }

    public void setNiveauDalerte(double niveauDalerte) {
        this.niveauDalerte = niveauDalerte;
    }

    public void setNiveauMinimal(double niveauMinimal) {
        this.niveauMinimal = niveauMinimal;
    }

    public void setCarburant(Carburant carburant) {
        this.carburant = carburant;
    }

}
