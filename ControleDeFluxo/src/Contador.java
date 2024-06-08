import java.util.Scanner;

import classe.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");

        int primeiroParametro = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");

        int segundoParametro = terminal.nextInt();

        try{
            contar(primeiroParametro, segundoParametro);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }


        terminal.close();
    }
    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        if(primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }
        
        for(int contagem = primeiroParametro ; contagem <= segundoParametro ; contagem++){
            System.out.println("Imprimindo " + contagem);
        }
    }
}
