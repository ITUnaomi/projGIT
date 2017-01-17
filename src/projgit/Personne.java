public /**
 * Personne
 */
public class Personne {

    private String IdPersonne;
    private String Nom;
    private String DateNaissance;
    private String Sexe;

    public void setIdPersonne(String id){
        IdPersonne=id;
    }
    public String getIdPersonne(){
        return IdPersonne;
    }

    public void setNom(String id){
        Nom=id;
    }
    public String getNom(){
        return Nom;
    }

    public void setDateNaissance(String id){
        DateNaissance=id;
    }
    public String getDateNaissance(){
        return DateNaissance;
    }

    public void setSexe(String id){
        Sexe=id;
    }
    public String getSexe(){
        return Sexe;
    }
    public Personne (parameters) {
        
    }
    public String toString(){
        return "('"+IdPersonne+"','"+Nom+"','"+DateNaissance+"','"+Sexe+"')";
    }

    public void insert(){
        Connexion con=new Connexion();
        
    }
}