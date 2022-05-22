/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import problema1_1.Ciudad;
import problema1_1.Enfermeros;
import problema1_1.Hospital;
import problema1_1.Medicos;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Medicos medc1 = new Medicos("Leonardo Aguirre", "Caridiologo", 2152);
        Medicos medc2 = new Medicos("Marrk Valencia", "Otorrinolaringolo", 2564);
        Medicos medc3 = new Medicos("Byron Caicedo", "Pediatra", 5412);
        Medicos medc4 = new Medicos("Grey Anatomy", "Estetica", 3256);

        Medicos[] lista1 = {medc1, medc2, medc3, medc4};

        Enfermeros enf1 = new Enfermeros("Alexander Dominguez", "Depedido", 2005);
        Enfermeros enf2 = new Enfermeros("Cristina Ontaneda", "Contratada", 1857);
        Enfermeros enf3 = new Enfermeros("Domenica Guarnizo", "Contratada", 2005);
        Enfermeros enf4 = new Enfermeros("Alexander Dominguez", "Depedido", 2005);

        Enfermeros[] lista2 = {enf1, enf2, enf3, enf4};

        Ciudad ciuda1 = new Ciudad("Loja", "Zamora");

        Hospital hps1 = new Hospital("San Pedro", 20, lista1, lista2);
        hps1.establecerCiudad(ciuda1);
        hps1.establecerDireccion("24 de Mayo");
        hps1.establecerEspecialista(14);
        hps1.CalcularTotal();
        System.out.printf("%s ", hps1);

    }

}
