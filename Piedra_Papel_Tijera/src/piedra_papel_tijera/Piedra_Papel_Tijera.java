/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedra_papel_tijera;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class Piedra_Papel_Tijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entrada = "";
        Scanner sc = new Scanner(System.in);
            //menu inicial
            System.out.println(
                 "1.Iniciar El Juego\n"
                +"2.Puntuacion\n"
                +"3.Salir");
        entrada = sc.nextLine();
        
        //Inicio Del Juego
        if ("1".equals(entrada)) {
            
            String select = "";
            String computer = "";
            String stone = "Piedra";
            String paper = "Papel";
            String scissors = "Tijera";
            
            System.out.println("Seleccione Uno");
            System.out.println("**************");
            System.out.println("1.Piedra\n"
                    + "2.Papel\n"
                    + "3.Tijera");
            computer = maquina();
            select = sc.nextLine();
            //si el jugador selecciona piedra
            if ("1".equals(select)) {
                select = stone;
                answer(select,computer);
                winner(select, computer);
            }
            //si el jugador selecciona papel
            else if ("2".equals(select)){
                select = paper;
                answer(select, computer);
                winner(select, computer);
            }
            if ("3".equals(select)) {
                select = scissors;
                answer(select, computer);
                winner(select, computer);
            }
        } 
        //Sistema de puntuacion
        if("2".equals(entrada)){
            System.out.println("Estas en el sistema de puntuacion aun estamos trabajando en el para darte la mejor experiencia");
        }
        // salir
        else{
            System.out.println("Gracias por jugar mi juego vuelva pronto");
        }
            
    }
    //inteligencia artificial de la maquina
    public static String maquina(){
        int identificador = (int)Math.floor(Math.random()*3+1);
        String s = null;

        if (identificador==1) {
            s = "Piedra"; 
        }
        if (identificador==2)
        {
            s = "Papel";
        }
        if (identificador==3) {
            s = "Tijera";
        }
        return s ;
    }
    //para generar las respuestas mas facilmente
    public static void answer(String select, String computer){
        System.out.println("Tu Has Seleccionado "+select+" La Maquina Ha Seleccionado "+computer);
    }
    
    //condiciones de victoria
    public static void winner(String select, String computer){
        switch (select) {
            case "Piedra":
                
                if(computer.equals("Tijeras")){
                    System.out.println("Ganaste");
                }
                
                if(computer.equals("Piedra")){
                    System.out.println("Empate");
                }
                if(computer.equals("Papel")){
                    System.out.println("Perdiste");
                }

                break;
            case "Papel":
                
                if(computer.equals("Tijeras")){
                    System.out.println("Perdiste");
                }
                
                if(computer.equals("Piedra")){
                    System.out.println("Ganaste");
                }
                if(computer.equals("Papel")){
                    System.out.println("Empate");
                }
                break;
            case "Tijera":
                
                if(computer.equals("Tijeras")){
                    System.out.println("Empate");
                }
                
                if(computer.equals("Piedra")){
                    System.out.println("Perdiste");
                }
                if(computer.equals("Papel")){
                    System.out.println("Ganaste");
                }
                
                    
            default:
                throw new AssertionError();
        }
        
    
        
    }    
        
}
        
        
    
   




