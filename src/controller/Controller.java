package controller;

import view.*;

public class Controller {
   public static void startApp() {

      System.out.print(Text.greeting);
      pause();

      boolean isRunning = true;
      int mainInput = 0;
      int secondInput = 0;

      while (isRunning) {
         consoleClear();

         mainInput = View.getUserChoice("main");

         switch (mainInput) {
            case 1:
               secondInput = View.getUserChoice("RAM");
               break;
            case 2:
               secondInput = View.getUserChoice("HDD");
               break;
            case 3:
               secondInput = View.getUserChoice("OS");
               break;
            case 4:
               secondInput = View.getUserChoice("Color");
               break;
            case 5:
               consoleClear();

               System.out.print(Text.goodbye);
               pause();

               View.scanner.close();
               System.exit(0);
         }
      }
   }

   public static void consoleClear() {
      System.out.println("\033[H\033[J");
   }

   public static void pause() {
      try {

         Thread.sleep(2500);

      } catch (InterruptedException ex) {
      }
   }
}
