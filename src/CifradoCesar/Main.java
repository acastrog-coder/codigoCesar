package CifradoCesar;


public class Main {


    public static void main(String[] args) {
      LeerTexto archivo = new LeerTexto();
       archivo.cargarArchivo();
       Desplazamiento espacios = new Desplazamiento();
       espacios.desplazar();

      /* Encriptar c=new Encriptar();
        c.leerDatos();
        System.out.println(c.encriptar());
      /* Desencriptar des=new Desencriptar();
        des.leerDatos();
        System.out.println(des.desencriptar());*/
    }
}