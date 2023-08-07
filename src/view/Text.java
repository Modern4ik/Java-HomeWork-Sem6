package view;

import java.util.Arrays;
import java.util.HashSet;

public class Text {
    public static String greeting = "Добро пожаловать!";
    public static String goodbye = "Возвращайтесь скорее!";

    public static String mainMenu = "1. Объем ОЗУ\n" +
                                    "2. Объем HDD\n" +
                                    "3. ОС\n" +
                                    "4. Цвет\n" +
                                    "5. Выход\n";
    
    public static String ramMenu = "1. 2 GB - 4 GB\n" +
                                   "2. 4 GB - 8 GB\n" +
                                   "3. 8 GB +\n";

    public static String hddMenu = "1. 256 GB - 500 GB\n" +
                                   "2. 500 GB - 1000 GB\n";

    public static String osMenu = "1. Windows\n" +
                                  "2. Linux\n";
    
    public static String colorMenu = "1. Black\n" +
                                     "2. White\n" +
                                     "3. Silver\n";

    public static String inputMess = "Пожалуйста, выберите фильтр: ";

    public static String inputTypeError = "Вы должны ввести номер фильтра!";

    public static String mainBoundError = "Номер должен быть от 1 до 5!";
    public static String ramBoundError = "Номер должен быть от 1 до 3!";
    public static String hddBoundError = "Номер должен быть от 1 до 2!";
    public static String osBoundError = "Номер должен быть от 1 до 2!";
    public static String colorBoundError = "Номер должен быть от 1 до 3!";


    public static String[] mainSet = new String[]{"Объем ОЗУ", "Объем HDD", "ОС", "Цвет", "Выход"};
    public static String[] set = new String[]{"White", "Black", "Silver"};
}
