
package Menu.Java;

import static Menu.Java.Menu.opcaoMenu;

public class Main {

   
    public static void main(String[] args) {
      
        Menu menu = new Menu();
        
             do
        {
            menu.mostrarMenu();
        }
             while(opcaoMenu == 1 || opcaoMenu == 2);
                         
    }
}

  
