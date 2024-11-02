import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //** Creation des postes:
        Poste auto1=new Poste(1,"Automatique");
        Poste manu1=new Poste(2,"Manuel","fermé");
        Poste manu2=new Poste(3,"Manuel","fermé");
        Poste manu3= new Poste(4,"Manuel","fermé");
        //**Affichage des postes
        System.out.println("Station service Servisol");
        System.out.println(auto1.toString());
        System.out.println(manu1.toString());
        System.out.println(manu2.toString());

        Achat a=new Achat(new Date(),1,Carburant.Gazole,20,2.89,57.00000000000004 );
        System.out.println(a.toString());
        System.out.println("Station : fermée");
        System.out.println("----citernes----");
        Citerne c2= new Citerne(Carburant.SP95,0.0,1000,500);
        Citerne c1=new Citerne(Carburant.Gazole,0.0,1000,500);
        Citerne c3 = new Citerne(Carburant.SP98,0.0,1000,500);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println("----postes-----");
        Map<Integer,Poste> listeposte=new HashMap<Integer,Poste>();;
        listeposte.put(1,auto1);
        listeposte.put(2,manu1);
        listeposte.put(3,manu2);
        listeposte.put(4,manu3);
        System.out.println(auto1);
        System.out.println(manu1);
        System.out.println(manu2);
        System.out.println(manu3);
        System.out.println("----Station : ouverte-----");
        System.out.println("----Prix des carburants-----");
        Station s1= new Station(c1);
        s1.ouvrir(1.42,1.63,1.75);
        System.out.println(s1.toString());
        System.out.println("----Citernes-----");
        s1.livrer(c1,5000);
        s1.livrer(c2,9000);
        s1.livrer(c3,7000);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println("----achats----");
        Achat a1= new Achat(new Date(),2,Carburant.Gazole,10,1.42,14.2);
        Achat a2= new Achat(new Date(),1,Carburant.SP98,40,1.75,70.0);
        Achat a3= new Achat(new Date(),4,Carburant.Gazole,20,1.42,28.4000000000000002);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(c1.toString());

    }

}