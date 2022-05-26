/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Scanner;
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

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Hospital ");
        String nonmbreH = entrada.nextLine();
        System.out.println("Ingrese el numero de Especialistas");
        int numeroE = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la Direccion del Hospital");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el nombre de la Ciudad ");
        String nombreC = entrada.nextLine();
        System.out.println("Ingres el Nombre de la Provincia");
        String provincia = entrada.nextLine();

        Ciudad ciuda1 = new Ciudad(nombreC, provincia);

        System.out.println("Ingrese la Cantidad de Doctores a Ingresar");
        int nD = entrada.nextInt();
        entrada.nextLine();
        Medicos[] lista1 = new Medicos[nD];
        for (int i = 0; i < nD; i++) {
            System.out.println("Ingrese el nombre del Doctor");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la especialidad del Doctor");
            String especialidad = entrada.nextLine();
            System.out.println("Ingrese el sueldo Mensual");
            double sueldo = entrada.nextDouble();
            entrada.nextLine();
            Medicos medc1 = new Medicos(nombre, especialidad, sueldo);
            lista1[i] = medc1;
        }
        System.out.println("Ingrese la Cantidad de Enfermeros a Ingresar");
        int nE = entrada.nextInt();
        entrada.nextLine();
        Enfermeros[] listaE1 = new Enfermeros[nE];
        for (int j = 0; j < nE; j++) {
            System.out.println("Ingrese el nombre del Enfermero");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la Tipo del Enfermero");
            String Tipo = entrada.nextLine();
            System.out.println("Ingrese el sueldo Mensual");
            double sueldo = entrada.nextDouble();
            entrada.nextLine();
            Enfermeros enfer1 = new Enfermeros(nombre, Tipo, sueldo);
            listaE1[j] = enfer1;
        }

        Hospital hps1 = new Hospital(nonmbreH, numeroE, lista1, listaE1, direccion);
        hps1.establecerCiudad(ciuda1);
        hps1.CalcularTotal();
        System.out.printf("%s ", hps1);
    }

}
