package CifradoCesar;

import java.util.Scanner;

public class Desencriptar {

        private String mensaje;
        private int llave;
        private static char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F','G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ','O','P','Q', 'R', 'S', 'T', 'U', 'V', 'W','X', 'Y','Z',
                'a', 'b', 'c', 'd','e', 'f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};


        public Desencriptar(String mensaje, int llave) {
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
            Desencriptar.alfabeto = alfabeto;
        }

        public void leerDatos(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Dame el texto a desencriptar: ");
            setMensaje(sc.nextLine());

            System.out.println("Dame el desplazamiento: ");
            setLlave(sc.nextInt());

            sc.close();
        }
      public char[] desencriptar() {
            char[] nuevoMensaje = new char[getMensaje().length()];

            for (int i=0; i<getMensaje().length(); i++){

                if(getMensaje().charAt(i) == ' '){
                    nuevoMensaje[i] = getMensaje().charAt(i);
                }else {
                    for(int j=0; j<getAlfabeto().length; j++){
                        if(getMensaje().charAt(i) == getAlfabeto()[j]) {

                            if (j<getLlave()) {
                                nuevoMensaje[i] =getAlfabeto()[(j-getLlave()+getAlfabeto().length)%getAlfabeto().length];
                                j=getAlfabeto().length;
                            }else{
                                nuevoMensaje[i]=getAlfabeto()[(j-getLlave())%getAlfabeto().length];
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

