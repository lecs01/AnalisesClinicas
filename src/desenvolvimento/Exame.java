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
        System.out.println("Código do Grupo: ");
        this.setCodigo(cad.nextInt());
        cad.nextLine();
        System.out.println("Grupo do Exame: ");
    }
}
