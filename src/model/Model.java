package model;

import java.util.Arrays;
import java.util.HashSet;

public class Model {
    private static Notebook nb1 = new Notebook("4GB", "500GB", "Windows", "Silver");
    private static Notebook nb2 = new Notebook("8GB", "1000GB", "Linux", "Black");
    private static Notebook nb3 = new Notebook("2GB", "256GB", "Windows", "White");

    public static HashSet<Notebook> booksSet = new HashSet<Notebook>(Arrays.asList(nb1, nb2, nb3));
    
}
