public class Contar {
    public static void main(String [] args){
        long inicio = System.nanoTime();
        for(int i = 0; i!= 10; i++){
            System.out.println(i);
        }
        long fin = System.nanoTime();
        long time = fin - inicio;
        System.out.println("Me demore "+time+" ns");
    }
}
