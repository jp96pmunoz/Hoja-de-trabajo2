/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 */
public class Calculadora {
    private String operacion;
    private Stack pila;
    
    /**
     *
     */
    public Calculadora() {
        operacion = "";
        pila = new Stack();
    }
    
    /**
     *
     * @param op
     */
    public Calculadora(String op){
        operacion = op;
        pila = new Stack();
    }
    
    /**
     *
     * @return
     */
    public int operar(){
        int respuesta = 0;
        String[] elementos = operacion.split(" ");
        for (int i = 0; i < elementos.length; i++){
            if (esNumero(elementos[i]))
                pila.push(elementos[i]);
            else{
                if (elementos[i].equals("+"))
                    respuesta = suma();
                else if (elementos[i].equals("-"))
                    respuesta = resta();
                else if (elementos[i].equals("*"))
                    respuesta = multiplicacion();
                else
                    respuesta = division();
                pila.push(Integer.toString(respuesta));
            }
        }
        return respuesta;
    }
    
    /**
     *
     * @return
     */
    public int suma(){
        int num1 = Integer.parseInt(pila.pop());
        int num2 = Integer.parseInt(pila.pop());
        return (num1+num2);
    }

    /**
     *
     * @return
     */
    public int resta(){
        int num1 = Integer.parseInt(pila.pop());
        int num2 = Integer.parseInt(pila.pop());
        return (num2-num1);
    }
    
    /**
     *
     * @return
     */
    public int multiplicacion(){
        int num1 = Integer.parseInt(pila.pop());
        int num2 = Integer.parseInt(pila.pop());
        return (num1*num2);
    }
    
    /**
     *
     * @return
     */
    public int division(){
        int num1 = Integer.parseInt(pila.pop());
        int num2 = Integer.parseInt(pila.pop());
        return (num2/num1);
    }
    
    /**
     *
     * @param dato
     * @return
     */
    public boolean esNumero(String dato){
        try{
            int num = Integer.parseInt(dato);
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}  
 

    
