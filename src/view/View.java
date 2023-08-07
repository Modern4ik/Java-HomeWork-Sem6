package view;

import java.util.Scanner;

public class View{
    public static Scanner scanner;

    public static int getUserChoice(String inputMode){
        scanner = new Scanner(System.in);
        int input = 0;
        boolean flag = true;

        int minValue = 0;
        int maxValue = 0;
        String menu = "";
        String boundError = "";

        switch (inputMode){
            case "main":
                minValue = 1;
                maxValue = 5;
                menu = Text.mainMenu;
                boundError = Text.mainBoundError;
            case "RAM":
                minValue = 1;
                maxValue = 3;
                menu = Text.ramMenu;
                boundError = Text.ramBoundError;
            case "HDD":
                minValue = 1;
                maxValue = 2;
                menu = Text.hddMenu;
                boundError = Text.hddBoundError;
            case "OS":
                minValue = 1;
                maxValue = 2;
                menu = Text.osMenu;
                boundError = Text.osBoundError;
            case "Color":
                minValue = 1;
                maxValue = 3;
                menu = Text.colorMenu;
                boundError = Text.colorBoundError;
        }
    }
}