/*
* File: App.java
* Author: Takács Dániel
* Copyright: 2023, Takács Dániel
* Date: 2023-12-05
* Licenc: MIT
*
*/

import controllers.MainController;
import views.MainWindow;


    public class App { 
        public static void main(String[] args)throws Exception {
            MainWindow mainWindow = new MainWindow();
            new MainController(mainWindow); mainWindow.setVisible(true);
        }
    }
