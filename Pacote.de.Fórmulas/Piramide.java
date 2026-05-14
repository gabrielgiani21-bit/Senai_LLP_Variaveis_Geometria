import java.util.Scanner;
public class Piramide {
    public static void m1ain(String[] args) {
        Scanner symt = new Scanner(System.in);
        
        System.out.println("qual o tipo de piramide?: ");
        System.out.println("1:triangular   ||  2: quadrangular");
        int escolha = symt.nextInt();
        if(escolha == 1){
            System.out.println("Qual é a base do triângulo (lado)?: ");
            double baseTriangulo = symt.nextDouble();
            System.out.println("Qual é a altura da base (triângulo)?: ");
            double alturaBase = symt.nextDouble();
            System.out.println("Qual é a altura da pirâmide?: ");
            double alturaPiramide = symt.nextDouble();

            double areaBase = (baseTriangulo * alturaBase) / 2;
            double volume = (areaBase * alturaPiramide) / 3;
            System.out.println("O volume da pirâmide triangular é: " + volume);

        }else if(escolha == 2){
            System.out.println("Qual o valor do lado da base quadrada?: ");
            double lado = symt.nextDouble();
            System.out.println("Qual é a altura da pirâmide?: ");
            double alturaPiramide = symt.nextDouble();

            double areaBase = lado * lado;
            double volume = (areaBase * alturaPiramide) / 3;

            System.out.println("O volume da pirâmide quadrangular é: " + volume);

        }else{
            System.out.println("escolha invalida");
        }
        
        symt.close();
    }
}