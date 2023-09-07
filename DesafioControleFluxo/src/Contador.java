import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner newscanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int parametroUm = newscanner.nextInt();
        System.out.println("Insira o segundo número:");
        int parametroDois = newscanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm){
            throw new ParametrosInvalidosException("O primeiro parâmetro tem que ser maior que o segundo");
        }
        else{
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("O número é " + i);
            }
        }
    }
}
