/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registromaraton;

import javax.swing.JOptionPane;

/**
 *
 * @author hande
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegistroMaraton maraton1 = new RegistroMaraton();
        
        maraton1.ingresarReserva();
        maraton1.listarReservas();
        maraton1.BuscarCorredor();
        

    }
    
}
