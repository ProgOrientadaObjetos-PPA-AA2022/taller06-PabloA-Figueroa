/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1_1;

/**
 *
 * @author SALA I
 */
public class Enfermeros {
    String nombreE; 
    String tipo; 
    double sueldo; 
    
    public Enfermeros(String n, String t, double s){
        nombreE = n; 
        tipo = t; 
        sueldo = s; 
        
    }
    public void establecerNombreEnfermero(String n) {
        nombreE = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerSueldo(int n) {
        sueldo = n;
    }

    public String obtenerNombreEnfermero() {
        return nombreE;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
}
