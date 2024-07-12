package CifradoCesar;

import java.util.Scanner;

public class Encriptar {

    private String mensaje;
    private int llave;
    private static char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F','G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ','O','P','Q', 'R', 'S', 'T', 'U', 'V', 'W','X', 'Y','Z',
            'a', 'b', 'c', 'd','e', 'f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};

        public Encriptar(String mensaje) {
        this.mensaje = mensaje;
        this.llave = llave;
           }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }

    public static char[] getAlfabeto() {
        return alfabeto;
    }

    public static void setAlfabeto(char[] alfabeto) {
        Encriptar.alfabeto = alfabeto;
    }

    public void leerDatos(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el mensaje");
        setMensaje(sc.nextLine());

        System.out.println("Dame la llave");
        setLlave(sc.nextInt());

        sc.close();

    }

    public char[] encriptar(){
        char[] nuevoMensaje = new char[getMensaje().length()];

        for (int i=0; i<getMensaje().length(); i++){

            if(getMensaje().charAt(i) == ' '){
                nuevoMensaje[i] = getMensaje().charAt(i);
            }else {
                for(int j=0; j<getAlfabeto().length; j++){
                    if(getMensaje().charAt(i) == getAlfabeto()[j]) {

                        if (getLlave()<0) {
                            nuevoMensaje[i] =getAlfabeto()[(j+getLlave()+getAlfabeto().length)%getAlfabeto().length];
                            j=getAlfabeto().length;
                        }else{
                            nuevoMensaje[i]=getAlfabeto()[(j+getLlave())%getAlfabeto().length];
                            j=getAlfabeto().length;
                        }

                    }else {
                        nuevoMensaje[i]=getMensaje().charAt(i);
                    }
                }
            }
        }
        return nuevoMensaje;
    }
}