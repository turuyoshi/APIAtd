import com.google.gson.Gson;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Gson gson = new Gson();
        ConsomeApi api = new ConsomeApi();
        String endereco; //= api.buscarDados(11443400);
        //Endereco end = gson.fromJson(endereco, Endereco.class);
        //System.out.println(end);

        int controle = 1;
        int controle2 = 1;
        int cep;
        Endereco[] enderecos = new Endereco[3];

        while (controle <= 3) {
            System.out.print("Digite o "+controle+"º cep do endereço que deseja consultar: ");
            cep = sc.nextInt();
            endereco = api.buscarDados(cep);
            enderecos[controle-1] = gson.fromJson(endereco, Endereco.class);
            controle++;
        } 

        System.out.println("Os endereços consultados foram:");
        for (Endereco endereco1 : enderecos) {
            System.out.println(controle2 + "º endereço consultado: ");
            System.out.println(endereco1);
            System.out.println("\n");
            controle2++;
        }       
        sc.close();
    }
}
