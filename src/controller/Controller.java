package controller;

import model.Model;
import view.*;

public class Controller {
   public static void syncDataBase(){
      Model.getData(Text.ramMenu, "RAM");
      Model.getData(Text.hddMenu, "HDD");
      Model.getData(Text.osMenu, "OS");
      Model.getData(Text.colorMenu, "Color");
   }

   public static void startApp() {
      consoleClear();

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

               consoleClear();
               View.printSearchResult(Model.getNotebooks(secondInput, Text.getFilter(Text.ramMenu), "RAM"));

               break;
            case 2:
               secondInput = View.getUserChoice("HDD");

               consoleClear();
               View.printSearchResult(Model.getNotebooks(secondInput, Text.getFilter(Text.hddMenu), "HDD"));

               break;
            case 3:
               secondInput = View.getUserChoice("OS");

               consoleClear();
               View.printSearchResult(Model.getNotebooks(secondInput, Text.osMenu, "OS"));

               break;
            case 4:
               secondInput = View.getUserChoice("Color");

               consoleClear();
               View.printSearchResult(Model.getNotebooks(secondInput, Text.colorMenu, "Color"));
               
               break;
            case 5:
               consoleClear();

               System.out.print(Text.goodbye);
               pause();

               View.scanner.close();
               View.continueScanner.close();
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
