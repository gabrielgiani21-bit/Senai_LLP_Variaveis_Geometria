import java.util.Scanner;
public class Tubo {
    public static void main(String[] args) {
        Scanner symt = new Scanner(System.in);

        System.out.println("Qual é o raio do tubo?");
        double r = symt.nextDouble();
        System.out.println("Qual é altura do seu tubo?");
        double h = symt.nextDouble();

        double area = 2 * Math.PI * r * ( r + h );
        System.out.printf("Resultado: %.2f\n", area);

        symt.close();
    }
}
