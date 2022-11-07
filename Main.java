import java.util.Random;

public class Main {
  
  public static void main(String[] args) {
    
    int[] vetor = new int[6];
    Random ds = new Random();

    ds.setSeed(65596);
    
    for(int i=0;i<=5;i++){
     vetor[i] = ds.nextInt(999);
     }
    ordena.impressao(vetor);

    System.out.println();

    long inicio = System.nanoTime();
 // Método Ordenação (apenas mudar o nome do método)
    ordena.Buble(vetor);
    long fim = System.nanoTime();
    long intervalo = fim - inicio;
    ordena.impressao(vetor);
    ordena.status(intervalo);

  }
}
