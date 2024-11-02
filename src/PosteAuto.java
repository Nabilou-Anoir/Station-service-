
public class PosteAuto extends Poste {
 private String typePoste="Automatique";
    public PosteAuto(int numeroPoste, String type, String horaire) {
        super(numeroPoste, type, horaire);
    }

    public PosteAuto(int numeroPoste, Carburant carburant) {
        super(numeroPoste, carburant);
    }
    public String getTypePoste() {
        return typePoste;
    }
}
