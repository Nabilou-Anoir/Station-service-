public class PosteManuel extends Poste {
   private String typePoste = "Manuel";

    public PosteManuel(int numeroPoste, String type, String horaire) {
        super(numeroPoste, type, horaire);
    }

    public String getType() {
        return typePoste;
    }
}
