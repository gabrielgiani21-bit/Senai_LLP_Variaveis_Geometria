import java.util.Scanner;
public class Bola {
    public static void main(String[] args){
    Scanner symt = new Scanner(System.in);
    
    System.out.println("Qual é o valor do seu raio?");
    double r = symt.nextDouble();

    double area = 4 * Math.PI * Math.pow(r, 2);
    System.out.printf("Resultado: %.2f\n", area);

    symt.close();
    

    }
}
