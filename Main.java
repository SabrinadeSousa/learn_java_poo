
/*
Aprendendo Orientação a objetos com Java.
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        
        int numFuncionarios; 
        float salario, media; 
        float totalSalario = 0;
        int cont = 0;

        System.out.println("Digite o numero de Funcionarios: ");
        numFuncionarios = new Scanner(System.in).nextInt();
        
        while (numFuncionarios > cont) {
            System.out.println("Digite o salario: ");
            salario = new Scanner(System.in).nextFloat();
            totalSalario = totalSalario + salario;
            cont++;
        }
        
        System.out.println("-------------------------------------------");
        media = totalSalario / numFuncionarios;
            System.out.println("A media de salario da empresa é: " + media);
    }
}
