package view;

import controller.Controller;
import java.util.Scanner;

public class View {
    public static Scanner scanner;

    public static int getUserChoice(String inputMode) {
        scanner = new Scanner(System.in);
        int input = 0;
        boolean flag = true;

        int minValue = 1;
        int maxValue = 0;
        String menu = "";
        String boundError = "";

        switch (inputMode) {
            case "main":
                maxValue = 5;
                menu = Text.mainMenu;
                boundError = Text.mainBoundError;
                break;
            case "RAM":
                maxValue = 3;
                menu = Text.ramMenu;
                boundError = Text.ramBoundError;
                break;
            case "HDD":
                maxValue = 2;
                menu = Text.hddMenu;
                boundError = Text.hddBoundError;
                break;
            case "OS":
                maxValue = 2;
                menu = Text.osMenu;
                boundError = Text.osBoundError;
                break;
            case "Color":
                maxValue = 3;
                menu = Text.colorMenu;
                boundError = Text.colorBoundError;
                break;
        }

        while (flag) {
            Controller.consoleClear();

            System.out.println(Text.inputMess);

            printMenu(menu);

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

    private static void printMenu(String menuText) {
        System.out.println(menuText);
    }
}