package view;

import java.util.TreeMap;

public class Text {
    public static String greeting = "Добро пожаловать!";
    public static String goodbye = "Возвращайтесь скорее!";

    // public static String mainMenu = "1. Объем ОЗУ\n" +
    // "2. Объем HDD\n" +
    // "3. ОС\n" +
    // "4. Цвет\n" +
    // "5. Выход\n";

    // public static String ramMenu = "1. 2 GB - 4 GB\n" +
    // "2. 4 GB - 8 GB\n" +
    // "3. 8 GB +\n";

    // public static String hddMenu = "1. 256 GB - 500 GB\n" +
    // "2. 500 GB - 1000 GB\n";

    // public static String osMenu = "1. Windows\n" +
    // "2. Linux\n";

    // public static String colorMenu = "1. Black\n" +
    // "2. White\n" +
    // "3. Silver\n";

    public static String inputMess = "Пожалуйста, выберите фильтр: ";

    public static String inputTypeError = "Вы должны ввести номер фильтра!";

    public static String menuBoundError = "Номер должен быть от 1 до";

    public static TreeMap<Integer, String> mainMenu = new TreeMap<>();
    public static TreeMap<Integer, String> ramMenu = new TreeMap<>();
    public static TreeMap<Integer, String> hddMenu = new TreeMap<>();
    public static TreeMap<Integer, String> osMenu = new TreeMap<>();
    public static TreeMap<Integer, String> colorMenu = new TreeMap<>();

    public static TreeMap<Integer, String> fillMainMenu(TreeMap<Integer, String> mainMenu){
         mainMenu.put(1, "Объем ОЗУ");
         mainMenu.put(2, "Объем HDD");
         mainMenu.put(3, "ОС");
         mainMenu.put(4, "Цвет");
         mainMenu.put(5, "Выйти из приложения");

         return mainMenu;
     }
}
