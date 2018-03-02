/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacalculadora;

/**
 *
 * @author conve
 */
public class Calculadora {
    public double suma(double numero1, double numero2){
        return numero1+numero2;
    }
    public double resta(double numero1, double numero2){
        return numero1-numero2;
    }
    
    public double multiplicacion(double numero1, double numero2){
        return numero1*numero2;
    }
    
    public double division(double numero1, double numero2){
        return numero1/numero2;
    }
    
    public double potencia(double numero1,double numero2){
        double resultado = Math.pow(numero1, numero2);
        return resultado;
    }
    
}
