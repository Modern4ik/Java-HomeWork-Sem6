package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

public class Model {
    private static Notebook nb1 = new Notebook("4GB", "500GB", "Windows", "Silver");
    private static Notebook nb2 = new Notebook("8GB", "1000GB", "Linux", "Black");
    private static Notebook nb3 = new Notebook("4GB", "256GB", "Windows", "Silver");

    public static HashSet<Notebook> booksSet = new HashSet<Notebook>(Arrays.asList(nb1, nb2, nb3));

    public static void getData(TreeMap<Integer, String> menuText, String filterTypeFlag) {
        int i;

        switch (filterTypeFlag) {
            case "RAM":
                i = 1;

                for (var el : booksSet) {
                    if (!menuText.containsValue(el.getRam())) {
                        menuText.put(i, el.getRam());
                        i++;
                    }
                }
                break;

            case "HDD":
                i = 1;

                for (var el : booksSet) {
                    if (!menuText.containsValue(el.getdiskCap())) {
                        menuText.put(i, el.getdiskCap());
                        i++;
                    }
                }
                break;

            case "OS":
                i = 1;

                for (var el : booksSet) {
                    if (!menuText.containsValue(el.getOperSystem())) {
                        menuText.put(i, el.getOperSystem());
                        i++;
                    }
                }
                break;

            case "Color":
                i = 1;

                for (var el : booksSet) {
                    if (!menuText.containsValue(el.getColor())) {
                        menuText.put(i, el.getColor());
                        i++;
                    }
                }
                break;
        }
    }
}
