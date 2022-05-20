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
    
    Enfermeros(){
        nombreE = "Pedrito"; 
        tipo = "contratado"; 
        sueldo = 112; 
        
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

    public String obtenerEspecialidad() {
        return tipo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
}
