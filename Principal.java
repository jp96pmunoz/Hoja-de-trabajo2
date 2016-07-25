
import java.io.IOException;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 */
public class Principal {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a la calculadora de archivos con información en postfix.");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la dirección del archivo con la operación a realizar.");
        System.out.println("Por ejemplo: C:\\Users\\User\\Documents\\doc.txt");
        String doc = teclado.nextLine();
        Lector operacion = new Lector(doc);
        try{
            String[] lines = operacion.openFile();
        }
        catch (IOException e){
            System.out.println("El archivo no existe o no se puede leer.");
        }
        
        if (operacion.getLineas() != 0){
            Calculadora calc = new Calculadora(operacion.getOperacion());
            System.out.println("La respuesta es: "+Integer.toString(calc.operar()));
        }
    }
    
}
