import java.util.Scanner;
public class Retangulo{
    public static void main(String[] args) {
       
        Scanner symt = new Scanner(System.in);

        double b = symt.nextDouble();
        System.out.print("Qual é a sua base?");
        double h = symt.nextDouble();
        System.out.println("Qual é a sua altura?");

        double area = b*h;

        System.out.println("resultado: "+area);

        symt.close();

    }

}
