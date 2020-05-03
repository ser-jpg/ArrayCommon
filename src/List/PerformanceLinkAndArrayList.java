package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceLinkAndArrayList {


    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        zamanHesapla("arrayList", arrayList);
        System.out.println("**************************************8");

        zamanHesapla("linkedList", linkedList);

    }

    public static void zamanHesapla(String veri, List<Integer> list) {
        // listin sonuna deger ekleme
        long baslangic;
        long bitis;
        baslangic = System.currentTimeMillis();
        System.out.println("baslangic: " + baslangic);

        for (int i = 0; i < 10000; i++) {
           // list.add(i); // basa ekleme
            list.add(0,i);// araya ekleme

        }
        bitis = System.currentTimeMillis();
        long fark = bitis - baslangic;

        System.out.println("bitis: " + bitis);
        System.out.println(veri + "fark=" + fark);
    }
}
