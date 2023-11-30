public class Prueba {

    //Atributos
    private int[] bolas;
    private int bolasSacadas;

    //Constructor
    public Prueba () {
        this.bolas =new int[99];
        this.bolasSacadas = 0;
    }
    public int nuevaBola () {
        boolean repetido;
        int numeroAleatorio;
        do {
            repetido = false;
            numeroAleatorio = (int)(Math.random()*99+1);
            for(int i = -1; i < this.bolasSacadas; i++){
                if(numeroAleatorio == this.bolas[i+1]){
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                this.bolas[this.bolasSacadas] = numeroAleatorio;
                this.bolasSacadas++;
            }
        }while(repetido);
        return numeroAleatorio;
    }

    public static void main (String[]args){
        Prueba prueba = new Prueba();
        while(prueba.nuevaBola() != 0) {
            System.out.println(prueba.nuevaBola());
        }
    }

}
