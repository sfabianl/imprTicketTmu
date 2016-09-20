/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impticket;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 *
 * @author sergio
 */
public class ImpTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
     recursosPrint m  = new recursosPrint();
    
    
    String Texto="/dev/usb/lp0";
    String TextoConcat="Mi texto concatenado";
    
    FileWriter file = new FileWriter(Texto);
                BufferedWriter buffer = new BufferedWriter(file);
                PrintWriter ps = new PrintWriter(buffer);

               
                m.setFormato(1, ps);
                ps.println("Primera linea a imprimir");
                ps.println("Concatenando: " + TextoConcat);
                m.Dibuja_Linea(ps);
                m.setRojo(ps);
                
                                
                m.correr(5, ps);
                m.cortar(ps);
                ps.close();

    
 
    }
}
