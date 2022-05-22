/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1_1;

/**
 *
 * @author SALA I
 */
public class Medicos {

    String nombreD;
    String especialidad;
    double sueldo;

    public Medicos(String n, String e, double s) {
        nombreD = n;
        especialidad = e;
        sueldo = s;
    }

    public void establecerNombreDoctor(String n) {
        nombreD = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldo(int n) {
        sueldo = n;
    }

    public String obtenerNombreD() {
        return nombreD;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
}
