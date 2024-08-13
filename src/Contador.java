import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("digite o primeiro parametro");
        int parametroUm = terminal.nextInt();
        System.out.println("digite o segundo parametro");
        int parametroDois = terminal.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametroInvalidoException e) {
            e.printStackTrace();
        }
    }

        static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if(parametroDois <= parametroUm){
            throw new ParametroInvalidoException("O segundo número deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        System.out.println("iniciando contagem do número " + parametroUm + " até " + parametroDois);
        for(int i = 0; i <= contagem; i++){
            int resultado = parametroUm + i;
            System.out.println("número atual: " + resultado);
        }
    }
}
