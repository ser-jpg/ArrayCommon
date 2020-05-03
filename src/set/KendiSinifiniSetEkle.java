package set;

import java.util.HashSet;
import java.util.Set;

public class KendiSinifiniSetEkle {


    public static void main(String[] args) {

        Set<player> set=new HashSet<>();
        player player1=new player("serkan",1);
        player player2=new player("abbas",2);
        player player3=new player("kazim",3);
        player player4=new player("serkan",1);
        /*serkan id iki tane ayni oldugu halde set ikisini de depoladi.
        cunku ben kendi sinifimi olusturdum bu sinifa equals ve hashcode metodlarini yazmam lazim.
        diger String zate icinde bu kodlari bulundurdugundan dolayi set dublicate kabul eymiyor

         */

        set.add(player1);
        set.add(player2);
        set.add(player3);
        set.add(player4);
        for (player p:set ) {
            System.out.println(p);
        }
    }
}
 class player {

    private String isim;
    private int id;

    public player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "player{" + "isim='" + isim + '\'' + ", id=" + id + '}';
    }
}