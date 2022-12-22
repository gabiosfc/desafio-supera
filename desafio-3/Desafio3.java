import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class Desafio3 {

    public static int[] leEntrada(int n){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> setValores = new HashSet<Integer>();

        for(int i = 0; i < n; i++){
            //Para não permitir entrada de valores repetidos
            setValores.add(scanner.nextInt());
        }

        int vetor[] = conveteSetParaVetor(setValores);

        return vetor;
    }

    private static int[] conveteSetParaVetor(Set<Integer> setValores) {

        int n = setValores.size();
        int vetor[] = new int[n];

        int i = 0;
        for(int x : setValores)
            vetor[i++] = x;

        return vetor;
    }

    public static void processaVetor(int n, int k, int[] vetor){
        int cont = 0;

        for(int i = 0; i < (n - 1); i++){
            for(int j = (i + 1); j < n; j++){
                if(Math.abs(vetor[i] - vetor[j]) == k){
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int vetor[] = leEntrada(n);
        n = vetor.length;
        processaVetor(n, k, vetor);

    }
}