package view;

import java.util.TreeMap;

public class Text {
    public static String greeting = "Добро пожаловать!";
    public static String goodbye = "Возвращайтесь скорее!";

    public static String inputMess = "Пожалуйста, выберите фильтр: ";

    public static String inputTypeError = "Вы должны ввести номер фильтра!";

    public static String menuBoundError = "Номер должен быть от 1 до";

    public static String resultMessage = "По вашему запросу получены следующие модели: ";

    public static TreeMap<Integer, String> mainMenu = new TreeMap<>();
    public static TreeMap<Integer, String> ramMenu = new TreeMap<>();
    public static TreeMap<Integer, String> hddMenu = new TreeMap<>();
    public static TreeMap<Integer, String> osMenu = new TreeMap<>();
    public static TreeMap<Integer, String> colorMenu = new TreeMap<>();

    public static TreeMap<Integer, String> ramFilter = new TreeMap<>();
    public static TreeMap<Integer, String> hddFilter = new TreeMap<>();

    public static TreeMap<Integer, String> fillMainMenu(TreeMap<Integer, String> mainMenu){
         mainMenu.put(1, "Объем ОЗУ");
         mainMenu.put(2, "Объем HDD");
         mainMenu.put(3, "ОС");
         mainMenu.put(4, "Цвет");
         mainMenu.put(5, "Выйти из приложения");

         return mainMenu;
     }

    public static TreeMap<Integer, String> getFilter(TreeMap<Integer, String> baseForFilter){
        TreeMap<Integer, String> res = new TreeMap<>();
        int i = 1;

        for (var el : baseForFilter.entrySet()){
            res.put(i, Integer.toString(el.getKey()) + "GB");
            i++;
        }

        return res;
    }
}
