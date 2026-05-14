import java.util.Scanner;
public class triângulo {
    public static void main(String[] args) {
        Scanner symt = new Scanner(System.in);
        
        System.out.println("Qual é o sua base?");
        double b = symt.nextDouble();
        System.out.println("Qual é a sua altura");
        double h = symt.nextDouble();
        

        double area = b*h/2;
        System.out.println("Resultado:" +area);

        symt.close();
    }
    
}
