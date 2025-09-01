import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<String> listaEmails = new ArrayList<>();

        do {
            System.out.print("Digite o nome completo (ou 'sair'): ");
            String nome = sc.nextLine();

            if (nome.equals("sair"))
                break;

            String[] nomePartes = nome.split("\\s+");

            String baseEmail = nomePartes[0];
            for (int i = 1; i < nomePartes.length; i++) {
                baseEmail += "." + nomePartes[i];
            }

            int cont = 1;
            String emailGerado = baseEmail + "@empresa.com";
            while (listaEmails.contains(emailGerado)) {
                cont++;
                emailGerado = baseEmail + cont + "@empresa.com";
            }
            listaEmails.add(emailGerado);

            System.out.println("Email gerado: " + emailGerado);

        } while (true);

        sc.close();
    }
}
