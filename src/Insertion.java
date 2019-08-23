import java.util.Random;

public class Insertion {

public static void main(String args[]){
    Random r = new Random();
    // Gera Numeros Randomicos entre 1 e 15

        int numeros[] = new int[15];
        System.out.println("Numeros Randomicos: ");

    // Gera e mostra os numeros Randomicos
    for (int i = 1; i < 15; ++i){
        numeros[i] = r.nextInt(100) + 1;
        System.out.println(numeros[i]);
    }

        Insertion insertion = new Insertion();
        insertion.ordenar(numeros);
        System.out.println("Numeros Ordenados: ");
        amostraResultado(numeros);
}

public void ordenar(int numeros[]){

    int tamanho = numeros.length;

    for (int i = 1; i < tamanho; ++i){
        int pivo = numeros[i];
        int j = i-1;

        // joga os bagulho maior pra frente
        while (j >= 0 && numeros[j] > pivo){
            numeros[j + 1] = numeros[j];
            j = j - 1;
        }
        numeros[j + 1] = pivo;
    }

}

static void amostraResultado (int numeros[]){

    int tamanho = numeros.length;
    for (int i = 0; i < tamanho; i++){
        System.out.printf(numeros[i] + "\n");
    }

}

}
