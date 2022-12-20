import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Desafio1 {
    static ArrayList<Integer> listaPar = new ArrayList<>();
    static ArrayList<Integer> listaImpar = new ArrayList<>();

    public static void processaValor(int valor){
        if(valor % 2 == 0){
            listaPar.add(valor);
        } else {
            listaImpar.add(valor);
        }
    }

    public static void ordenaVetores(){
        Collections.sort(listaPar);
        Collections.sort(listaImpar, Collections.reverseOrder());
    }

    public static void exibeSaida(){
        for(Integer i: listaPar){
            System.out.println(i);
        }
        for(Integer i: listaImpar){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int valor = scanner.nextInt();
            processaValor(valor);
        }
        ordenaVetores();
        exibeSaida();
    }
}