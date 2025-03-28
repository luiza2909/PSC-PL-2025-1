import java.util.Scanner;

public interface Entrada {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        
        System.err.println("Digite sua idade");
        int idade = sc.nextInt();
        sc.nextLine();

        System.err.println("Ditei seu nome");
       String nome = sc.nextLine();

       System.err.println("Olá " + nome + " sua idade é " + idade);
       sc.close();


        


    }

}