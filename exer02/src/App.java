import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        sc.close();
        System.out.println("O númro informado é " + num);
    }
}
