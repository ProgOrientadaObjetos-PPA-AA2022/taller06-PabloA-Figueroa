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
    
    public Hospital(String n, int e) {
        nombre = " "; 
        especialistas = 0; 
        direccion = "24 de Mayo"; 
        
    }
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerCiudad(Ciudad n){
        ciudad = n;
    }
    public void establecerEspecialista(int n){
        especialistas = n;
    }
    public void establecerDoctores(Medicos[] n){
        doctores = n;
    }
    public void CalcularTotal(Medicos[] m, Enfermeros[] e){
        total = 0;
        double suma = 0; 
        for (int i = 0; i < obtenerDocotores().length; i++) {
              suma = suma + obtenerDocotores()[i].obtenerSueldo();
        }
        
        total = suma/obtenerDocotores().length;
    }
    public void establecerEnfermeros(Enfermeros[] n){
        enfermeros = n;
    }
    public void establecerDireccion(String n){
        direccion = n;
    }
    
     public String obtenerNombre(){
        return nombre;
    }
    
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerEspecialista(){
        return especialistas;
    }
     public Medicos[] obtenerDocotores(){
        return doctores;
    }
    
    public double obtenerTotal(){
        return total;
    }
    public Medicos[] obtenerEnfermeros(){
        return doctores;
    }
    
    public String obtenerDireccion(){
        return direccion;
    }
    

    
}
