import java.util.Scanner;
public class Caixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //definir variáveis 
        System.out.println("Qual é o comprimento?");
        double comprimento = sc.nextDouble();
        System.out.println("Qual é o largura?");
        double largura = sc.nextDouble();
        System.out.println("Qual é o altura?");
        double altura = sc.nextDouble();

        double caixa = 2*(comprimento * largura + comprimento * altura + largura * altura); //área da caixa
        System.out.printf("Resultado: %.2f\n", caixa);

        sc.close();

        
    }
    
}
