package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSetInterfacesDifferent {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkSet = new LinkedHashSet<>();
        Set<String> threeSet = new TreeSet<>();

        hashSet.add("Java");
        hashSet.add("C++");
        hashSet.add("Phayton");
        hashSet.add("Ruby");
        for (String h : hashSet) {
            System.out.println(h);// rasgele bastiracak
        }
        System.out.println("*************************");
        linkSet.add("Java");
        linkSet.add("C++");
        linkSet.add("Ruby");
        linkSet.add("phayton");
        for (String l : linkSet) {
            System.out.println(l);} // ekleme siramiza gore bastiracak

            System.out.println("*************************");
            threeSet.add("Java");
            threeSet.add("C++");
            threeSet.add("Phayton");
            threeSet.add("Ruby");
            for (String t : threeSet) {
                System.out.println(t);// harf sirasina gore bastirir

            }

        }
    }
