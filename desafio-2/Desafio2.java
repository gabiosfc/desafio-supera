import java.util.Scanner;
import java.text.DecimalFormat;

class Desafio2 {

    public static int processaTroco(int valor, int cedula){
        DecimalFormat format = new DecimalFormat("#,##0.00");
        if(cedula > 100) {
            System.out.println(valor / cedula + " nota(s) de R$ " + (format.format(cedula / 100.0)));
        } else {
            System.out.println(valor / cedula + " moeda(s) de R$ " + (format.format(cedula / 100.0)));
        }

        return (valor % cedula);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        int valor = (int) (n * 100);

        System.out.println("NOTAS:");
        valor = processaTroco(valor, 100 * 100);
        valor = processaTroco(valor, 50 * 100);
        valor = processaTroco(valor, 20 * 100);
        valor = processaTroco(valor, 10 * 100);
        valor = processaTroco(valor, 5 * 100);
        valor = processaTroco(valor, 2 * 100);
        System.out.println("MOEDAS:");
        valor = processaTroco(valor, 100);
        valor = processaTroco(valor, 50);
        valor = processaTroco(valor, 25);
        valor = processaTroco(valor, 10);
        valor = processaTroco(valor, 5);
        valor = processaTroco(valor, 1);

    }
}