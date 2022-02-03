
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Arrays;


public class ArregloconNumerosAleatorios {
    public static void main(String[] args) {
        int [] NumerosAleatorios = new int [10];
        int [] NumerosAleatorios2 = new int [10];
        int [] NumerosAleatorios3 = new int [10];
        int min = 1;
        int max = 100;

        for (int i = 0; i < NumerosAleatorios.length; i++) {
            NumerosAleatorios [i] = (int)(Math.random()*(max-min))+min;
            NumerosAleatorios2 [i] = (int)(Math.random()*(max-min))+min;
            NumerosAleatorios3 [i] = (int)(Math.random()*(max-min))+min;
        }
        
        Arrays.sort(NumerosAleatorios);
        Arrays.parallelSort(NumerosAleatorios2,0,5);
        NumerosAleatorios3 = Arrays.stream(NumerosAleatorios3).sorted().toArray();
        
        for (int i = 0; i < NumerosAleatorios.length; i++) {
            System.out.println(i + "==>" + NumerosAleatorios[i]);
        }
        
        System.out.println("==============================");
        
        for(int i : NumerosAleatorios2){
            System.out.println(i+" ");
        }
        
        System.out.println("==============================");
        
        for(int i : NumerosAleatorios3){
            System.out.println(i+" ");
        }
        
    }
    
}
