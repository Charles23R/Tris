/**
 * Created by rench1732786 on 2018-03-26.
 */
public class Livre implements Comparable<Livre>{

    private int annee;
    private String titre;
    private String isbn;
    private String sousTitre;
    private String auteur;
    private String maisonDedition;

    public Livre(int annee, String titre, String isbn, String sousTitre, String auteur, String maisonDedition) {
        this.annee = annee;
        this.titre = titre;
        this.isbn = isbn;
        this.sousTitre = sousTitre;
        this.auteur = auteur;
        this.maisonDedition = maisonDedition;
    }

    @Override
    public int compareTo(Livre o) {
        return annee-o.getAnnee();
    }

    public void afficher(){
        System.out.println("-"+titre+", "+sousTitre+", "+auteur+", "+annee+", "+maisonDedition+", "+isbn);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSousTitre() {
        return sousTitre;
    }

    public void setSousTitre(String sousTitre) {
        this.sousTitre = sousTitre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getMaisonDedition() {
        return maisonDedition;
    }

    public void setMaisonDedition(String maisonDedition) {
        this.maisonDedition = maisonDedition;
    }
}
