import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        int x;
        System.out.println("Digite um numero");
        x = escreva.nextInt();

        if (x >= 0){
            System.out.println("numero não negativo");
        }
        else {
            System.out.println("numero negativo");
        }

        escreva.close();
        }
    }