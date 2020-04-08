import unac.edu.co.GrandeInteger;
import unac.edu.co.ListaCD;

import java.io.File;
import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class Archivo {

    static Scanner input;

    int arregloCadena;

    private static String leerImprimirLinea() {
        ListaCD listadb;
        listadb = new ListaCD();


        String line = input.nextLine();
        System.out.print("\n" + line);
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            int a = Integer.parseInt(Character.toString(c));

            listadb.Insertar(a);

            // System.out.print(c + " ");

        }
        System.out.println("\nLista: ");

        listadb.visualizar();
        return line;
    }

    public static void main(String[] a) {

        ListaCD listadb;
        listadb = new ListaCD();
        GrandeInteger listgi;
        listgi = new GrandeInteger();

        String cadena1;
        String cadena2;
        GrandeInteger intGrande1;
        GrandeInteger intGrande2;
        GrandeInteger intGrande3;

        try {
            input = new Scanner(new File("entrada.txt"));

            cadena1 = leerImprimirLinea(listgi.Insertar(int e));

            cadena2 = leerImprimirLinea();

            intGrande1 = new GrandeInteger(cadena1);
            //
            intGrande2 = new GrandeInteger(cadena2);
            //
            intGrande3 = intGrande2.add(intGrande1);


            System.out.println(" ");

            System.out.println("El valor de la suma es: " + intGrande3);



        } catch (

                Exception ex) {
            ex.printStackTrace();
        }


    }
}