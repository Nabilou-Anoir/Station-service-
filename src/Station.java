import java.util.*;

public class Station {
    // **Attribut

    EnumMap<Carburant, Double> carburantPrix;//** EnuMap un carburant coresponds à un prix
    Map<Integer, Poste> postes; //** collection Map car un numero correspond à un poste
    EnumMap<Carburant, List<Achat>> carburantAchat;// fait+++YC : Cet attribut ne stocke qu'un seul achat, toi tu veux la liste des achats. Attention tu as deux Enum Map à définir. Une qui lie les carburants aux prix (achatCarburant), et une qui lie les carburant aux achats.
    List<Achat> Achats;
    Citerne citernes;
    private double prixGazo;
    private double prixSp95;
    private double prixSp98;


    //** Constructeur

    public Station (Citerne citernes) {
        this.citernes = citernes;
    }

    public Station(Citerne citernes, EnumMap<Carburant, Double> carburantPrix, Map<Integer, Poste> postes, EnumMap<Carburant, List<Achat>> carburantAchat) {
        this.citernes = citernes;
        this.carburantPrix = new EnumMap<>(Carburant.class);
        this.postes = postes;
        this.carburantAchat = new EnumMap<>(Carburant.class);
        // fait+++this.postes = postes
        // fait++YC : Pour initialiser la liste des prix
        // fait+++this.achatCarburant(=carburantachat) = new EnumMap<>(Carburant.class)
    }

    public Station(EnumMap<Carburant, Double> carburantPrix, Map<Integer, Poste> postes, EnumMap<Carburant, List<Achat>> carburantAchat) {
        this.carburantPrix = new EnumMap<>(Carburant.class);
        this.postes = new HashMap<>();
        this.carburantAchat = new EnumMap<>(Carburant.class);
    }

    //**fonction ouvrir(): modifie les prix des carburants et remet à zero les achats;
    // **entrée :les nouveaux prix
    //**Sortie: rien
    // le principe qui est appliqué ici c'est l'encapsulation car on souhaite acceder au different attribut d'une autre classe
    public void ouvrir(double prixGazo, double prixSp95, double prixSp98) {
        carburantAchat = null;
        carburantPrix= null;
        Achats=null;
        this.prixGazo = prixGazo;
        this.prixSp95 = prixSp95;
        this.prixSp98 = prixSp98;
        // YC : Attention, on ne print généralement rient dans les méthodes. Par contre tu devrais mettre à jour l'EnumMap qui contient tes prix (achatCarburant).
        // **** fait YC : N'oublie pas de vider la liste des achats (une fois que tu l'auras définie comme attribut).
    }

    @Override
    public String toString() {
        return "Station{" +
                "prixGazo=" + prixGazo +
                ", prixSp95=" + prixSp95 +
                ", prixSp98=" + prixSp98 +
                '}';
    }

    //**fonction livrer: remplit les citernes
    // **entrée :rien
    //**Sortie: boolean
    public double livrer(Citerne citerne, double quantite) {
        citerne.remplirciterne(quantite);
        return citerne.getNiveauCourant();
    }

    public boolean fermer() {
        return true;
    }


        // YC : Non, ici tu ne dois pas mettre à jour les prix mais bien les achats. Mais pour cela il te faut bien définir la collection qui contient les achats.
        // YC : Il s'agit ensuite de créer l'achat et de le put dans la liste des achats.


    public void acheterCarburant(Poste poste, Carburant carburant, double volume) {

        // Vérification de la quantité de carburant dans la citerne
        if ((citernes == null) || (citernes.getNiveauCourant() < volume)) {
            System.out.println("Carburant insuffisant dans la citerne.");
            return;
        }


        // Calcul du prix total
        double prixAuLitre=carburantPrix.get(carburant);
        double prixTotal = volume * prixAuLitre;

        // Création de l'achat
        Achat achatFait = new Achat(new Date(), poste.getNumeroPoste(), carburant, volume, prixAuLitre, prixTotal);

        // Enregistrement de l'achat dans la collection d'achats pour le carburant spécifié
        carburantAchat.computeIfAbsent(carburant, k -> new ArrayList<>()).add(achatFait);
    }
}
