public class Bombo {

    //Atributos
    private int numeroAleatorio;
    private int[] bolasSacadas;

    //Constructor
    public Bombo () {
        this.numeroAleatorio=0;
        this.bolasSacadas =new int[99];

    }

    public void setNumeroAleatorio (int nuevoAleatorio) {
      this.numeroAleatorio=nuevoAleatorio;
    }

    public int getNumeroAleatorio () {
        return this.numeroAleatorio;
    }

    //Metodos
    public void nuevoAleatorio () {
        int lleno = 0;
        boolean repetido;
        while(lleno != 99){
            repetido = false;
            do {
                int numeroAleatorio = (int)(Math.random()*99+1);
                for(int i = 0; i < bolasSacadas.length; i++){
                    if(numeroAleatorio == bolasSacadas[i]){
                        repetido = true;
                        break;
                    }
                }
                if(repetido == false){
                    bolasSacadas[lleno] = numeroAleatorio;
                    lleno++;
                }
            }while(repetido == true);
        }
    }
}
