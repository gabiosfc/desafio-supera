import java.util.Scanner;
import java.util.ArrayList;

class Desafio4 {

    public static String processaFrase(String frase){

        String frase1 = frase.substring(0, (frase.length()/2));
        frase1 = reverseString(frase1);

        String frase2 = frase.substring(frase.length()/2);
        frase2 = reverseString(frase2);

        return (frase1 + frase2);
    }

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine();
        int n = Integer.parseInt(buffer);


        for(int i = 0; i < n; i++){
            String frase = scanner.nextLine();
            System.out.println(processaFrase(frase));
        }
    }
}