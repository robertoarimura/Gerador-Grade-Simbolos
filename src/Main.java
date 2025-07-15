import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int linha;
        int coluna;
        char simbolo;

        System.out.print("Quantas linhas deseja?: ");
        linha = sc.nextInt();

        System.out.print("Quantas colunas deseja?: ");
        coluna = sc.nextInt();

        System.out.print("Qual símbolo deseja usar?: ");
        simbolo = sc.next().charAt(0);

        for(int l = 0; l < linha; l++){
            for(int c = 0; c < coluna; c++){
                System.out.print(simbolo);
            }
            System.out.println();
        }
        sc.close();
    }
}
