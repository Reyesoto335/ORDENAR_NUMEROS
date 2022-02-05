
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Arrays;


public class ArregloconNumerosAleatorios {
    static int [] NumerosAleatorios = new int [10];
    static int [] NumerosAleatorios2 = new int [10];
    static int [] NumerosAleatorios3 = new int [10];
    static int min = 1, max = 100;
    static int aux, mayor, menor;
    public static void main(String[] args) {
        llenado_de_arreglos();
        for (int i = 0; i < NumerosAleatorios.length; i++) {
            System.out.println(i + "==>" + NumerosAleatorios[i]);
        }
        //Metodo_borbuja();
        Metodo_quiksort(0,NumerosAleatorios.length-1);
        //first_array();
        second_array();
        third_array();
        muestreo();
        
        /*int [] NumerosAleatorios = new int [10];
        int [] NumerosAleatorios2 = new int [10];
        int [] NumerosAleatorios3 = new int [10];
        int min = 1;
        int max = 100;*/
        /*for (int i = 0; i < NumerosAleatorios.length; i++) {
            NumerosAleatorios [i] = (int)(Math.random()*(max-min))+min;
            NumerosAleatorios2 [i] = (int)(Math.random()*(max-min))+min;
            NumerosAleatorios3 [i] = (int)(Math.random()*(max-min))+min;
        }
        
        Arrays.sort(NumerosAleatorios);
        Arrays.parallelSort(NumerosAleatorios2,0,5);
        NumerosAleatorios3 = Arrays.stream(NumerosAleatorios3).sorted().toArray();
        
        
        
        /*for (int i = 0; i < NumerosAleatorios.length; i++) {
            System.out.println(i + "==>" + NumerosAleatorios[i]);
        }
        
        System.out.println("==============================");
        
        for(int i : NumerosAleatorios2){
            System.out.println(i+" ");
        }
        
        System.out.println("==============================");
        
        for(int i : NumerosAleatorios3){
            System.out.println(i+" ");
        }*/
        
    }
    
    public static void Metodo_quiksort(int bajo, int alto){
        if (bajo >=  alto) {
            return;
        }
        int inicio = bajo;
        int end = alto;
        int base = NumerosAleatorios[bajo];
        
        while(inicio < end){
            while(inicio < end && NumerosAleatorios[end] >= base){
                end--;
            }
        
            if(NumerosAleatorios[end] <= base){
                int temporal = NumerosAleatorios[end];
                NumerosAleatorios[end] = NumerosAleatorios[inicio];
                NumerosAleatorios[inicio] = temporal;
            }
        
            while(inicio < end && NumerosAleatorios[inicio] <= base){
                inicio++;
            }
        
            if (NumerosAleatorios[inicio] >= base){
                int temporal = NumerosAleatorios[end];
                NumerosAleatorios[end] = NumerosAleatorios[inicio];
                NumerosAleatorios[inicio] = temporal;
            }
        }
        
        Metodo_quiksort(bajo, inicio-1);
        Metodo_quiksort(end+1, alto);
        
    }
    
    public static void Metodo_borbuja(){
        mayor = menor = NumerosAleatorios [0];
            for (int i = 0; i < 10; i++){
                if (NumerosAleatorios [i] > mayor){
                    mayor = NumerosAleatorios[i];
                }
                if (NumerosAleatorios [i] < menor){
                    menor = NumerosAleatorios[i];
            } 
        }
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - 1; j++) {
                if (NumerosAleatorios [j] > NumerosAleatorios[j+1]) {
                    aux = NumerosAleatorios[j];
                    NumerosAleatorios[j] = NumerosAleatorios[j+1];
                    NumerosAleatorios [j+1] = aux;
                }
            }
        }
    }
    
    public static void first_array(){
        Arrays.sort(NumerosAleatorios);
    }
    
    public static void second_array(){
        Arrays.parallelSort(NumerosAleatorios2,0,5);
    }
    
    public static void third_array(){
        NumerosAleatorios3 = Arrays.stream(NumerosAleatorios3).sorted().toArray();
    }
    
    public static void llenado_de_arreglos(){
        for (int i = 0; i < NumerosAleatorios.length; i++) {
            NumerosAleatorios [i] = (int)(Math.random()*(max-min))+min;
            NumerosAleatorios2 [i] = (int)(Math.random()*(max-min))+min;
            NumerosAleatorios3 [i] = (int)(Math.random()*(max-min))+min;
        }
    }
    
    public static void muestreo(){
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
