
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 */
public class Stack implements iStack{
    //Aributos
    Vector<String> pila;
    
    /**
     *
     */
    public Stack(){
        pila = new Vector<String>();
    }
    
    /**
     *
     * @param valor
     */
    @Override
    public void push(String valor) {
        pila.add(valor); //Agrega el dato al final de la pila (de último o hasta arriba).
    }

    /**
     *
     * @return
     */
    @Override
    public String pop() {
        return pila.remove(pila.size()-1); //Toma el dato guardado de último (hasta el final o hasta arriba) en la pila.
    }
    
}
