public class ordena {

  // Método para imprimir o vetor
  public static void impressao(int[] f) {
    for (int i = 0; i < f.length; i++) {
      System.out.print(f[i] + " ");
    }
  }

  // buble sort
  public static void Buble(int[] h) {
    for (int i = 0; i < h.length; i++) {
      for (int j = i + 1; j < h.length; j++) {

        if (h[i] > h[j]) {
          int d = h[i];
          h[i] = h[j];
          h[j] = d;
        }
      }
    }
  }

  // selection
  public static void Selection(int[] d) {
    for (int i = 0; i < d.length; i++) {
      int min = i;
      for (int j = i + 1; j < d.length; j++) {
        if (d[j] < d[min]) {
          min = j;
          int x = d[min];
          d[min] = d[i];
          d[i] = x;
        }
      }
    }
  }

  // insertion
  public static void Insertion(int array[]) {  
    int n = array.length;  
      for (int j = 1; j < n; j++) {
       int key = array[j];  
       int i = j-1;  
        while ( (i > -1) && ( array [i] > key ) ) {  
         array [i+1] = array [i];  
         i--;  
   }  
      array[i+1] = key;  
  }  
}  

  // Shell
  public static void Shell(int[] vet){
    int i, j, temp, size = vet.length;
    int incremento = 1;
     while(incremento < size) {
      incremento = 3 * incremento + 1;
    }
       while (incremento > 1) {
        incremento /= 3;
	  for(i = incremento; i < size; i++) {
	   temp = vet[i];
	   j = i - incremento;
	    while (j >= 0 && temp < vet[j]) {
	     vet[j + incremento] = vet[j];
	      j -= incremento;
    }
	   vet [j + incremento] = temp;
	        }
	    }	    
	}

  public static void status(long intervalo){
    System.out.println("\n O tempo total da ordenação foi de: " + intervalo + " nanosegundos.");
  }

}
