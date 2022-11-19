
package Menu.Java;

import java.util.Scanner;

public class Menu {
 
    String[]    clientes = new String[6];
    String  nomePesquisa = "";
   
    static int  opcaoMenu;  
   
    

    Scanner input = new Scanner(System.in);
  

       public    void    mostrarMenu()
{
         
 
        System.out.println("Digite o número: ");
        System.out.println("1- Cadastrar");
        System.out.println("2- Pesquisar");
        System.out.println("3 - Sair");
        
        opcaoMenu = input.nextInt();
        
        switch(opcaoMenu)
{
        case 1:
        cadastrar();
        break;
        case 2:
        pesquisar();
        break;
        case 3:
            System.out.println("fim");
            break;
        default:
                System.out.println("Opção inválida");
}
        
    }          
            
       public void cadastrar()
            {
               int i = 0;
                for(i = 0; i < clientes.length; i++)
                {
                    System.out.println("Digite o nome para cadastrar: " + i);
                    clientes[i] = input.next();
                    
                }
                
            }
             
            public void pesquisar()
            {
                int i = 0;
               
                int indiceEncontrado = -1;
                
                
                System.out.println("Digite o nome que deseja pesquisar: ");
               
                nomePesquisa = input.next();
                
                
                for( i = 0; i < clientes.length; i++)
                
                {  
                    if(clientes[i].equalsIgnoreCase(nomePesquisa))
                    {
                        indiceEncontrado = 1;
                    }
                }
                
                    if( indiceEncontrado == 1)
                    {
                        System.out.println("Cliente encontrado.");
                    }
                    else
                    {
                        System.out.println("Cliente não encontrado.");
                    }  
                
                             
                
            }
                  
           
}
        


