import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/**
 * Created by rench1732786 on 2018-03-26.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TreeSet<Livre> biblio3 = new TreeSet();
        TreeSet<Livre> biblio2 = new TreeSet<> (new Comparer());
        ArrayList<Livre> biblio1 = new ArrayList<>();
        ArrayList<Livre> biblio4 = new ArrayList<>();
        ArrayList<Livre> biblio5 = new ArrayList<>();

        biblio1.add(new Livre(1974, "Brave New World", "012367B", "MissPeggy", "Aldous Huxley", "Penguin"));
        biblio1.add(new Livre(1984, "Octobre Rouge", "63867U", "Tom Clancy's", "Tom Clancy", "Wo"));
        biblio1.add(new Livre(2017, "Frigiel et Fluffy", "22222222F","Minecraft", "Frigiel", "Mojang Editions"));
        biblio1.add(new Livre(0, "Bible", "5623960J", "L'Ancien Testament", "Jesus", "Religion Editions"));
        biblio1.add(new Livre(65, "Coran", "7777yhfg", "L'Ancien Testament", "Mohammed", "Religion Editions"));
        biblio1.add(new Livre(1939, "Mine Kampf", "neinnein", "Nazi edition", "Hitler", "Hitler's den"));
        biblio1.add(new Livre(2017, "Frigiel et Fluffy 2", "22227772F","Minecraft", "Frigiel", "Mojang Editions"));
        biblio1.add(new Livre(2018, "How to Git", "wfh63875", "A complete guide", "Nic", "Alt-F4"));
        biblio1.add(new Livre(2009, "Twilight 1", "ywgufwgY8", "Team Jacob", "Katniss Everdeen", "Editions vampires"));
        biblio1.add(new Livre(2018, "Fortnite for noobs", "fashg6355324464275gwuefr6532r", "Battle Royale Guidde", "Ninja et Drake", "EpicBooks"));

        remplir(biblio1, biblio2);
        remplir(biblio1, biblio3);
        remplir(biblio1, biblio4);
        remplir(biblio1, biblio5);

        System.out.println("___________________________________________________________________________________");
        System.out.println("TreeSet en ordre d'année");
        for (Livre livre : biblio3){
            livre.afficher();
        }
        System.out.println("___________________________________________________________________________________");
        System.out.println("TreeSet avec le comparateur");
        for (Livre livre : biblio2){
            livre.afficher();
        }
        System.out.println("___________________________________________________________________________________");
        System.out.println("En ordre d'année avec l'algorythme");
        algo(biblio1);
        for (Livre livre : biblio1){
            livre.afficher();
        }
        System.out.println("___________________________________________________________________________________");
        System.out.println("Collections.sort sans le comparateur");
        Collections.sort(biblio4);
        for (Livre livre : biblio4){
            livre.afficher();
        }
        System.out.println("___________________________________________________________________________________");
        System.out.println("Collections.sort avec comparateur");
        Collections.sort(biblio5, new Comparer());
        for (Livre livre : biblio5){
            livre.afficher();
        }
    }

    public static void algo(ArrayList<Livre> list){
        Livre livre=null;
        int indice;
        for(int i=0; i<list.size(); i++){
            livre = list.get(i);
            indice=i;
            for (int j=i; j<list.size(); j++) {
                    if (list.get(j).compareTo(list.get(indice)) < 0) {
                        livre = list.get(j);
                        indice=j;
                    }
            }
            list.remove(indice);
            list.add(i, livre);
        }
    }

    public static void remplir(Collection<Livre> list, Collection<Livre> newList) {
        for (Livre livre : list) {
            newList.add(livre);
        }
        }
    }
