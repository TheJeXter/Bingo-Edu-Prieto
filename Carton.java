import static java.lang.Integer.parseInt;

public class Carton {

    //Atributos
    private int[] numeros;

    //Constructor
    public Carton() {
        this.numeros = new int[10];
        int lleno = 0;
        boolean repetido;
        while(lleno != 10){
             repetido = false;
            do {
                int numeroAleatorio = (int)(Math.random()*99+1);
                for(int i = 0; i < numeros.length; i++){
                    if(numeroAleatorio == numeros[i]){
                        repetido = true;
                        break;
                    }
                }
                if(repetido == false){
                    numeros[lleno] = numeroAleatorio;
                    lleno++;
                }
            }while(repetido == true);
        }
    }

    //Getter
    public int[] getNumeros(){
        return numeros;
    }

    /*
    public static void main(String[]args){
        Carton cart1 = new Carton();
        int[] numCarton = cart1.getNumeros();
        for(int i = 0; i < numCarton.length; i++){
            System.out.println(numCarton[i]);
        }
    }
    */

}
