package sandbox.workspace.dyma.Chap06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    private static void playingWithArray() {
        var integers_01 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var integers_02 = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9, 0},
            {2, 0},
            {6, 6}
        };
        var cTable = new char[]{'a', 'l', 'o'};
        var sTable = new String[]{"mikey", "mouse", null, "plume"};

        for (int i : integers_01) {
            System.out.print(String.format("%d ", i));
        }
        System.out.print("\n");

        for (int[] is : integers_02) {
            for (int is2 : is) {
                System.out.print(String.format("%d ", is2));
            }
            System.out.print("\n");
        }
        
        for (char i : cTable) {
            System.out.print(String.format("%s ", i));
        }
        System.out.print("\n");
        for (String i : sTable) {
            System.out.print(String.format("[%s] ", i));
        }
        System.out.print("\n");
    }

    private static void playingWithList() {
        var list = new ArrayList<Integer>();
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(8);
        list.add(55);

        list.add(2, 10);

        list.set(3, 11);

        list.remove(3);

        System.out.println(list.contains(55));

        for (Integer integer : list) {
            System.out.print(String.format("%d ", integer));
        }
        System.out.print("\n");

        var list3x = new ArrayList<ArrayList<ArrayList<String>>>();
        list3x.add(new ArrayList<>());
        list3x.add(new ArrayList<>());
        list3x.add(new ArrayList<>());

        list3x.get(0).add(new ArrayList<>());
        list3x.get(1).add(new ArrayList<>());
        list3x.get(2).add(new ArrayList<>());

        list3x.get(0).get(0).add("0-0-0");
        list3x.get(0).get(0).add("0-0-1");
        list3x.get(0).get(0).add("0-0-2");
        list3x.get(1).get(0).add("1-0-0");
        list3x.get(1).get(0).add("1-0-1");
        list3x.get(1).get(0).add("1-0-2");
        list3x.get(2).get(0).add("2-0-0");

        for (ArrayList<ArrayList<String>> arrayList : list3x) {
            for (ArrayList<String> arrayList2 : arrayList) {
                for (String element : arrayList2) {
                    System.out.print(String.format("%s ", element));
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private static void playingWithSet() {

        var set = new HashSet<String>();

        set.add("Victor");
        set.add("Mikael");
        set.add("Mikael");
        set.add("Tom");
        set.add(null);
        set.add("Tom");
        set.add("TomA");
        set.add("TomB");
        set.add(null);

        System.out.println(set);

        if (set.contains("TomA")) {
            System.out.println("TomA exists in set");
        } else {
            System.out.println("TomA doen't exist in set");
        }

        if (set.contains("TomC")) {
            System.out.println("TomC exists in set");
        } else {
            System.out.println("TomC doen't exist in set");
        }

        var treeSet = new TreeSet<String>();
        treeSet.add("Victor");
        treeSet.add("Mikael");
        treeSet.add("Mikael");
        treeSet.add("Tom");
        // treeSet.add(null); TreeSet doen't accept null value
        treeSet.add("Tom");
        treeSet.add("TomA");
        treeSet.add("TomB");
        // treeSet.add(null); TreeSet doen't accept null value
        
        System.out.println(treeSet);

        if (treeSet.contains("TomA")) {
            System.out.println("TomA exists in treeSet");
        } else {
            System.out.println("TomA doen't exist in treeSet");
        }

        if (treeSet.contains("TomC")) {
            System.out.println("TomC exists in treeSet");
        } else {
            System.out.println("TomC doen't exist in treeSet");
        }

        var treeSet2 = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
            
        });
        treeSet2.add("Victor");
        treeSet2.add("Mikael");
        treeSet2.add("Mikael");
        treeSet2.add("Tom");
        treeSet2.add("Tom");
        treeSet2.add("TomA");
        treeSet2.add("TomB");
        
        System.out.println(treeSet2);

        if (treeSet2.contains("TomA")) {
            System.out.println("TomA exists in treeSet");
        } else {
            System.out.println("TomA doen't exist in treeSet");
        }

        if (treeSet2.contains("TomC")) {
            System.out.println("TomC exists in treeSet");
        } else {
            System.out.println("TomC doen't exist in treeSet");
        }




    }

    public static void main(String[] args) {
        System.out.println(">>> Chapter 06: Tables and collections");

        // Playing with array
        // playingWithArray();

        // Playing with list
        // playingWithList();

        // Playing with Set
        playingWithSet();
    }
}
