import java.util.Scanner;

public class Menu {
    /**
     * @var integer
     */
    private int acao;

    /**
     * @var integer
     */
    private int m1[][] = new int [4][4];

    public boolean sair() {
        return false;
    }

    public void mostrarMatriz() {
        int i = 0;
        int j = 0;
        for(i = 0; i < m1.length; i++){
            System.out.println();
            for (j = 0; j < m1.length; j++) {
                System.out.println("["+i+"]"+"["+j+"]"+" = "+m1[i][j]);
            }
        }
    }

    public void limparMatriz() {
        int i = 0;
        int j = 0;

        for(i = 0; i < this.m1.length; i++) {
            for (j = 0; j < this.m1.length; j++) {
               this.m1[i][j] = 0;
            }
        }
    }

    public void removeElemento() {
        Scanner linha = new Scanner(System.in);
        Scanner coluna = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);

        System.out.println("Digite o a linha que você deseja incluir");
        int l = linha.nextInt();
        System.out.println("Digite o a Coluna que você deseja incluir");
        int c = coluna.nextInt();

        this.m1[c][l] = 0;
    }

    public void adicionaElemento() {
        Scanner linha = new Scanner(System.in);
        Scanner coluna = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);

        System.out.println("Digite o a linha que você deseja incluir");
        int l = linha.nextInt();
        System.out.println("Digite o a Coluna que você deseja incluir");
        int c = coluna.nextInt();
        System.out.println("Digite o valor que você deseja incluir");
        int v = valor.nextInt();

        int mValida [][] = new int [4][4];
        mValida[c][l] = v;

        int i, j = 0;

        for(i = 0; i < this.m1.length; i++) {
            for (j = 0; j < this.m1.length; j++) {
                if(this.m1[i][j] == mValida[c][l] && this.m1[i][j] == v) {
                    System.out.println("O valor já existe no array");
                } else {
                    this.m1[c][l] = v;
                }
            }
        }

    }


}
