/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author tomym
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int a=20,b=10,c=0,d=20,e=40,f=30;
    boolean condition=true;
    
    //operador pre incremento
    
    //a=a+1 entonces c=a
    
    c=++a;
    
        System.out.println("Valor de c(++a)= "+c);
    
    //Operador de post incremento (b toma valor
    //c=b entonces b=b+1
    c=++b;
        System.out.println("Valor de c: (b++)= " +c);
        
    
    //Operador de predecrementro
    //d=d-1 entonces c=d
    
  c=d-1;
        System.out.println("Valor de c(-d)="+c);
    
    //Operador de postdecremento
    //c=e entonces e=e-1 (e toma el valor de 39)
    
    c=-e;
        System.out.println("Valor de c(e-)= "+c);
    
    //operador logico not
        System.out.println("Valor de !condition="+!condition);
    
    
    
    }
    
}
