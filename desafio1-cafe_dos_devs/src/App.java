import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de devs: ");
        int qtdDev = Integer.parseInt(sc.nextLine());
        System.out.print("Quantas xícaras por dia cada um toma (separado por espaço): ");
        String[] entrada = sc.nextLine().split("\\s+");

        int[] xicarasDia = new int[qtdDev];
        for (int i = 0; i < qtdDev; i++) {
            xicarasDia[i] = Integer.parseInt(entrada[i]);
        }

        int totalSemana = 0;
        for (int x : xicarasDia) {
            totalSemana += x * 5;
        }

        System.out.println("Total da semanha: " + totalSemana);
        if (totalSemana <= 100) {
            System.out.println("Estoque suficiente");
        } else {
            System.out.println("Estoque insuficiente");
        }

        sc.close();
    }
}
