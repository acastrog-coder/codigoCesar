package CifradoCesar;

import java.io.*;
import java.util.Scanner;

public class LeerTexto {

    public LeerTexto() {
    }

    // public static void main(String[] args) {
        public static void cargarArchivo() {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingresa el texto a cifrar:");
        String texto = console.nextLine();


        System.out.println("El texto a cifrar es: " + texto);

        System.out.println("Introduce nombre archivo: ");
        String nombreArchivo = console.nextLine();


        File archivo;

        try {
            archivo = new File("C:\\PERSONAL\\CODEGYM\\proyecto\\CifradoCesar\\"+nombreArchivo+".txt");
            FileWriter escritura = new FileWriter(archivo);
            escritura.write(texto);
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
