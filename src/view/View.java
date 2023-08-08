package view;

import controller.Controller;
import java.util.Scanner;
import java.util.TreeMap;

public class View {
    public static Scanner scanner;

    public static int getUserChoice(String inputMode) {
        scanner = new Scanner(System.in);
        int input = 0;
        boolean flag = true;

        int minValue = 1;
        int maxValue = 0;
        TreeMap<Integer, String> menu = Text.fillMainMenu(Text.mainMenu);
        String boundError = "";

        switch (inputMode) {
            case "main":
                maxValue = menu.size();
                boundError = String.format("%s %d!", Text.menuBoundError, maxValue);
                break;
            case "RAM":
                menu = Text.ramMenu;

                maxValue = menu.size();
                boundError = String.format("%s %d!", Text.menuBoundError, maxValue);
                break;
            case "HDD":
                menu = Text.hddMenu;
                maxValue = menu.size();
                boundError = String.format("%s %d!", Text.menuBoundError, maxValue);
                break;
            case "OS":
                menu = Text.osMenu;

                maxValue = menu.size();
                boundError = String.format("%s %d!", Text.menuBoundError, maxValue);
                break;
            case "Color":
                menu = Text.colorMenu;

                maxValue = menu.size();
                boundError = String.format("%s %d!", Text.menuBoundError, maxValue);
                break;
        }

        while (flag) {
            Controller.consoleClear();

            System.out.println(Text.inputMess);

            printMenu(menu);
            System.out.println();

            if (scanner.hasNextInt()) {

                input = scanner.nextInt();

            } else {

                System.out.println(Text.inputTypeError);
                Controller.pause();

                scanner.nextLine();
                continue;

            }

            if (input >= minValue && input <= maxValue) {

                flag = false;

            } else {

                System.out.println(boundError);
                Controller.pause();

                scanner.nextLine();

            }
        }
        scanner.reset();
        return input;
    }
    

    private static void printMenu(TreeMap<Integer, String> menuText) {
        for (var el : menuText.entrySet()){
            System.out.println(String.format("%d. %s", el.getKey(), el.getValue()));
        }
    }
}