import java.util.Comparator;

/**
 * Created by rench1732786 on 2018-03-26.
 */
public class Comparer implements Comparator<Livre> {

    public int compare(Livre o1, Livre o2){
        int maisonComparee = o1.getMaisonDedition().compareTo(o2.getMaisonDedition());
        if (maisonComparee==0){
            int auteurCompare = o1.getAuteur().compareTo(o2.getAuteur());
            if (auteurCompare==0){
                int titreCompare = o1.getTitre().compareTo(o2.getTitre());
                if (titreCompare==0){
                    return o1.compareTo(o2);
                }
                return titreCompare;
            }
            return auteurCompare;
        }
        return maisonComparee;
    }
}
