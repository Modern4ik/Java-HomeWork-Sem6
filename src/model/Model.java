package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

public class Model {
    private static Notebook nb1 = new Notebook("NB124812", "4GB", "256GB", "Windows", "Silver");
    private static Notebook nb2 = new Notebook("NB853234", "8GB", "500GB", "Linux", "Black");
    private static Notebook nb3 = new Notebook("NB4421323", "4GB", "256GB", "Windows", "Silver");
    private static Notebook nb4 = new Notebook("NB032341", "16GB", "1000GB", "MacOS", "White");

    public static HashSet<Notebook> booksSet = new HashSet<Notebook>(Arrays.asList(nb1, nb2, nb3, nb4));

    public static void getData(TreeMap<Integer, String> menuText, String filterTypeFlag) {
        int i;

        switch (filterTypeFlag) {
            case "RAM":
                i = 1;

                for (var el : booksSet) {
                    if (!menuText.containsValue(el.getRam())) {
                        menuText.put(Integer.parseInt(el.getRam().replace("GB", "")), "GB");
                    }
                }
                break;

            case "HDD":
                i = 1;

                for (var el : booksSet) {
                    if (!menuText.containsValue(el.getdiskCap())) {
                        menuText.put(Integer.parseInt(el.getdiskCap().replace("GB", "")), "GB");
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

    public static HashSet<Notebook> getNotebooks(int userChoice, TreeMap<Integer, String> filter, String filterFlag){
        HashSet<Notebook> result = new HashSet<>();

        switch (filterFlag){
            case "RAM":
                for (var el : booksSet){
                    if (el.getRam().equals(filter.get(userChoice))){
                        result.add(el);
                    }
                }
                break;
            case "HDD":
                for (var el : booksSet){
                    if (el.getdiskCap().equals(filter.get(userChoice))){
                        result.add(el);
                    }
                }
                break;
            case "OS":
                for (var el : booksSet){
                    if (el.getOperSystem() == filter.get(userChoice)){
                        result.add(el);
                    }
                }
                break;
            case "Color":
                for (var el : booksSet){
                    if (el.getColor() == filter.get(userChoice)){
                        result.add(el);
                    }
                }
                break;
        }
        return result;
    }
}