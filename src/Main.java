import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        String acao;
        Menu menu = new Menu();
        Scanner s1 = new Scanner(System.in);

        do{
            System.out.println();
            System.out.println("Digite A - Adicionar Elemento. R - Remover Elemento. L - Limpar Matriz. M - Mostrar"
                    + " S - Sair"
            );
            acao = s1.next();
            if(acao == "A") {
                menu.adicionaElemento();
            } else if(acao == "R") {
                menu.removeElemento();
            } else if(acao == "L") {
                menu.limparMatriz();
            } else if(acao == "M") {
                menu.mostrarMatriz();
            } else if(acao == "S") {
                menu.sair();
            }

        }while(acao != "S" );
    }
}
