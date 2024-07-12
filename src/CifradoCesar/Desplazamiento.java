package CifradoCesar;

import java.io.*;
import java.util.Scanner;

public class Desplazamiento {

    public static void desplazar() {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingresa espacios a Desplazar: ");
        String texto = console.nextLine();
        String texto1 = "Desplazamiento="+texto;

        System.out.println("El desplazamiento es de: " + texto1);

        System.out.println("Introduce nombre archivo: ");
        String nombreArchivo = console.nextLine();


        File archivo;

        try {
            archivo = new File("C:\\PERSONAL\\CODEGYM\\proyecto\\CifradoCesar\\"+nombreArchivo+".txt");
            FileWriter escritura = new FileWriter(archivo);
            escritura.write(texto1);
            escritura.close();
            if(archivo.createNewFile()){
                System.out.println("Creado con Exito");
            }

        }catch(IOException e) {
            System.err.println("no se ha podido crear el archivo" + e);
        }
        System.out.println("Se creo el archivo con EXITO ");
    }
}

