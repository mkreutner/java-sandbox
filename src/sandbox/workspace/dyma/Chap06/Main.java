package sandbox.workspace.dyma.Chap06;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    //#region arrays
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
    //#endregion array

    //#region list
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
    //#endregion

    //#region set
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
    //#endregion

    //#region map
    private static String printUTF8(String inputString) {
        inputString = inputString.isEmpty() ? "Unknown" : inputString;
        ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(inputString);
        return new String(byteBuffer.array(), StandardCharsets.UTF_8);
    }
    
    public static void playingWithMap() {

        var frenchDepartments = new TreeMap<String, String>();

        frenchDepartments.put("01","Ain");
        frenchDepartments.put("02", "Aisne");
        frenchDepartments.put("03", "Allier");
        frenchDepartments.put("04", "Alpes de Haute-Provence");
        frenchDepartments.put("05", "Hautes-Alpes");
        frenchDepartments.put("06", "Alpes-Maritimes");
        frenchDepartments.put("07", "Ardeche");
        frenchDepartments.put("08", "Ardêche");
        frenchDepartments.put("09", "Ariège");
        
        frenchDepartments.put("10", "Aube");
        frenchDepartments.put("11", "Aude");
        frenchDepartments.put("12", "Aveyron");
        frenchDepartments.put("13", "Bouches-du-Rhône");
        frenchDepartments.put("14", "Calvados");
        frenchDepartments.put("15", "Cantal");
        frenchDepartments.put("16", "Charente");
        frenchDepartments.put("17", "Charente-Maritime");
        frenchDepartments.put("18", "Cher");
        frenchDepartments.put("19", "Corrèze");
        
        frenchDepartments.put("2A", "Corse-du-Sud");
        frenchDepartments.put("2B", "Haute-Corse");
        frenchDepartments.put("21", "Côte-d'Or");
        frenchDepartments.put("22", "Côtes d'Armor");
        frenchDepartments.put("23", "Creuse");
        frenchDepartments.put("24", "Dordogne");
        frenchDepartments.put("25", "Doubs");
        frenchDepartments.put("26", "Drôme");
        frenchDepartments.put("27", "Eure");
        frenchDepartments.put("28", "Eure-et-Loir");
        frenchDepartments.put("29", "Finistère");
        
        frenchDepartments.put("30", "Gard");
        frenchDepartments.put("31", "Haute-Garonne");
        frenchDepartments.put("32", "Gers");
        frenchDepartments.put("33", "Gironde");
        frenchDepartments.put("34", "Hérault");
        frenchDepartments.put("35", "Îlle-et-Vilaine");
        frenchDepartments.put("36", "Indre");
        frenchDepartments.put("37", "Indre-et-Loire");
        frenchDepartments.put("38", "Isère");
        frenchDepartments.put("39", "Jura");
        
        frenchDepartments.put("40", "Landes");
        frenchDepartments.put("41", "Loir-et-Cher");
        frenchDepartments.put("42", "Loire");
        frenchDepartments.put("43", "Haute-Loire");
        frenchDepartments.put("44", "Loire-Atlantique");
        frenchDepartments.put("45", "Loiret");
        frenchDepartments.put("46", "Lot");
        frenchDepartments.put("47", "Lot-et-Garonne");
        frenchDepartments.put("48", "Lozère");
        frenchDepartments.put("49", "Maine-et-Loire");

        frenchDepartments.put("50", "Manche");
        frenchDepartments.put("51", "Marne");
        frenchDepartments.put("52", "Haute-Marne");
        frenchDepartments.put("53", "Mayenne");
        frenchDepartments.put("54", "Meurthe-et-Moselle");
        frenchDepartments.put("55", "Meuse");
        frenchDepartments.put("56", "Morbihan");
        frenchDepartments.put("57", "Moselle");
        frenchDepartments.put("58", "Nièvre");
        frenchDepartments.put("59", "Nord");

        frenchDepartments.put("60", "Oise");
        frenchDepartments.put("61", "Orne");
        frenchDepartments.put("62", "Pas-de-Calais");
        frenchDepartments.put("63", "Puy-de-Dôme");
        frenchDepartments.put("64", "Pyrénées-Atlantiques");
        frenchDepartments.put("65", "Hautes-Pyrénées");
        frenchDepartments.put("66", "Pyrénées-Orientales");
        frenchDepartments.put("67", "Bas-Rhin");
        frenchDepartments.put("68", "Haut-Rhin");
        frenchDepartments.put("69", "Rhône");
        
        frenchDepartments.put("70", "Haute-Saône");
        frenchDepartments.put("71", "Saône-et-Loire");
        frenchDepartments.put("72", "Sarthe");
        frenchDepartments.put("73", "Savoie");
        frenchDepartments.put("74", "Haute-Savoie");
        frenchDepartments.put("75", "Paris");
        frenchDepartments.put("76", "Seine-Maritime");
        frenchDepartments.put("77", "Seine-et-Marne");
        frenchDepartments.put("78", "Yvelines");
        frenchDepartments.put("79", "Deux-Sèvres");
        
        frenchDepartments.put("80", "Somme");
        frenchDepartments.put("81", "Tarn");
        frenchDepartments.put("82", "Tarn-et-Garonne");
        frenchDepartments.put("83", "Var");
        frenchDepartments.put("84", "Vaucluse");
        frenchDepartments.put("85", "Vendée");
        frenchDepartments.put("86", "Vienne");
        frenchDepartments.put("87", "Haute-Vienne");
        frenchDepartments.put("88", "Voges");
        frenchDepartments.put("89", "Yonne");
        
        frenchDepartments.put("90", "Territoire-de-Belfort");
        frenchDepartments.put("91", "Essonne");
        frenchDepartments.put("92", "Hauts-de-Seine");
        frenchDepartments.put("93", "Seine-Saint-Denis");
        frenchDepartments.put("94", "Val-de-Marne");
        frenchDepartments.put("95", "Val-d'Oise");

        for (Map.Entry<String, String> eDep : frenchDepartments.entrySet()) {
            System.out.println(String.format(
                "[%s] - %s", eDep.getKey(), printUTF8(eDep.getValue())));
        }

    }
    //#endregion

    public static void main(String[] args) {
        System.out.println(">>> Chapter 06: Tables and collections");

        // Playing with array
        // playingWithArray();

        // Playing with list
        // playingWithList();

        // Playing with Set
        // playingWithSet();

        // Playing with Map
        playingWithMap();
    }
}
