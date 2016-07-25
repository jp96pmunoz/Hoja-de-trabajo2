/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAX AOKLAND
 */
import java.io.*;
import java.util.Scanner;
public class Lector {
    private Scanner txt;
    
    public void abrir(){
            
    try{
    txt= new Scanner(new File("prueba.txt"));
}
    catch(Exception e){
        System.out.println("Ingrese el nombre del archivo correctamente");
}
}
    public void leer (){
        while(txt.hasNext()){
            String texto= txt.next();
            System.out.println(texto);
        }
    }
    public void cerrar (){
        txt.close();
    }
}
