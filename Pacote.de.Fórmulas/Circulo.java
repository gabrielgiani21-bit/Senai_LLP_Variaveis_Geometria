import java.util.Scanner;
public class Circulo {
    public static void main(String[] args) {
        Scanner symt = new Scanner(System.in);

        System.out.println("Qual é o valor do Raio?");
        double raio =  symt.nextDouble();
       
        
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Resultado: %.4f\n", area);

         symt.close();

    }
    
}
