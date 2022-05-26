/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1_1;

/**
 *
 * @author SALA I
 */
public class Hospital {

    private String nombre;
    private Ciudad ciudad;
    private int especialistas;
    private Medicos[] doctores;
    private Enfermeros[] enfermeros;
    private double total;
    private String direccion;

    public Hospital(String n, int e, Medicos[] l1, Enfermeros[] l2, String dir) {
        nombre = n;
        especialistas = e;
        doctores = l1;
        enfermeros = l2;
        direccion = dir;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public void establecerEspecialista(int n) {
        especialistas = n;
    }

    public void establecerDoctores(Medicos[] n) {
        doctores = n;
    }

    public void CalcularTotal() {
        total = 0;
        double suma = 0;
        for (int i = 0; i < obtenerDocotores().length; i++) {
            suma = suma + obtenerDocotores()[i].obtenerSueldo();
        }
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            suma = suma + obtenerEnfermeros()[i].obtenerSueldo();
        }

        total = suma;
    }

    public void establecerEnfermeros(Enfermeros[] n) {
        enfermeros = n;
    }

    public void establecerDireccion(String n) {
        direccion = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerEspecialista() {
        return especialistas;
    }

    public Medicos[] obtenerDocotores() {
        return doctores;
    }

    public double obtenerTotal() {
        return total;
    }

    public Enfermeros[] obtenerEnfermeros() {
        return enfermeros;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        String cadena = "\nHospital: " + obtenerNombre() + "\n";
        cadena = String.format("""
                               %sDireccion: %s
                               Ciudad: %s
                               Provincia: %s
                               Numero de Especialistas %d
                               """, cadena,
                obtenerDireccion(), obtenerCiudad().obtenerNombreC(),
                obtenerCiudad().obtenerProvincia(), obtenerEspecialista());

        cadena = String.format("%s\nLista de Medicos (as): \n", cadena);

        for (int i = 0; i < obtenerDocotores().length; i++) {
            cadena = String.format("%s -%s - Sueldo: %.2f - %s\n", cadena,
                    obtenerDocotores()[i].obtenerNombreD(),
                    obtenerDocotores()[i].obtenerSueldo(),
                    obtenerDocotores()[i].obtenerEspecialidad());
        }
        cadena = String.format("%s\nLista de Enfermeros (as): \n", cadena);

        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s -%s - Sueldo: %.2f - %s\n", cadena,
                    obtenerEnfermeros()[i].obtenerNombreEnfermero(),
                    obtenerEnfermeros()[i].obtenerSueldo(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }
        cadena = String.format("%s\nTotal de Sueldos a pagar por mes: %.2f\n",
                cadena, obtenerTotal());
        return cadena;
    }
}
