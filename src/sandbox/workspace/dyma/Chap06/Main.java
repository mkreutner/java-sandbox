package sandbox.workspace.dyma.Chap06;

import java.util.ArrayList;

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

    public static void main(String[] args) {
        System.out.println(">>> Chapter 06: Tables and collections");

        // Playing with array
        // playingWithArray();

        // Playing with list
        playingWithList();
    }
}
