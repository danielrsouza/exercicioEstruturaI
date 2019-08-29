import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        String acao;
        Menu menu = new Menu();
        Scanner s1 = new Scanner(System.in);

        do{
            System.out.println();
            System.out.println("Digite A - Adicionar Carro. R - Remover Carro. L - Limpar . M - Mostrar"
                    + " S - Sair"
            );
            acao = s1.next();
            if(acao == "A") {
                menu.adicionaCarro();
            } else if(acao == "R") {
                menu.removeCarro();
            } else if(acao == "L") {
                menu.limparEstacionamento();
            } else if(acao == "M") {
                menu.mostrarEstacionamento();
            } else if(acao == "S") {
                menu.sair();
            }

        }while(acao != "S" );
    }
}
