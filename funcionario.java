public class funcionario{
    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao(){
        return this.salario * 0.1;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
}