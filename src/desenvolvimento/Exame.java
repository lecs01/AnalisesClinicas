package desenvolvimento;

import static desenvolvimento.Programa.contGe;
import static desenvolvimento.Programa.ge;

import java.util.Scanner;

public class Exame {
    private int codigo;
    private String Descricao;
    private double valor;
    private String procedimento;
    private GrupoExame grupoExame = new GrupoExame();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public GrupoExame getGrupoExame() {
        return grupoExame;
    }

    public void setGrupoExame(GrupoExame grupoExame) {
        this.grupoExame = grupoExame;
    }

    public void cadastrar() {
        Scanner cad = new Scanner(System.in);
        int codGrupoExame;
        System.out.println("--------------------------------");
        System.out.println("Relaçãoo dos Grupos");
        System.out.println("Código | Grupos");
        for (int i = 0; i < contGe; i++) {
            System.out.println("       " + i);
            ge[i].listarGrupoExame;
            System.out.println();
        }

        System.out.println("Vincule a um grupo");
        codGrupoExame = cad.nextInt();
        this.setGrupoExame(ge[codGrupoExame]);
        cad.nextLine();

        System.out.println("Código: ");
        this.setCodigo(cad.nextInt);
        cad.nextLine();

        System.out.println("Exame");
        this.setDescricao(cad.nextLine());
        System.out.println("Valor");
        this.setValor(cad.nextDouble);
        cad.nextLine();
        System.out.println("Procedimento");
        this.setProcedimento(cad.nextLine());
    }

    public void imprimirExame() {
        System.out.println("Código: .........: " + this.setCodigo());
        System.out.println("Exame .........: " + this.getDescricao());
        System.out.println("Grupo do Exame.: " + this.getGrupoExame().getDescricao());
        System.out.println("Valor .........:" + this.getValor());
        System.out.println("Procedimentos ..: " + this.getProcediment());
        System.out.println("------------------------------------------------");
    }
}
