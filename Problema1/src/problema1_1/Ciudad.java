/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1_1;

/**
 *
 * @author SALA I
 */
public class Ciudad {

    private String nombre;
    private String provincia;

    public Ciudad(String n, String p) {
        nombre = n;
        provincia = p;
    }

    public void establecerNombreC(String n) {
        nombre = n;
    }

    public void establecerProvincia(String n) {
        provincia = n;
    }

    public String obtenerNombreC() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }

}
