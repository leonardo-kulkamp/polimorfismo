public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario leonardo = new Funcionario();
        leonardo.setCpf("888.123.534-78");
        leonardo.setNome("Leonardo");
        leonardo.setSalario(5000.0);
        leonardo.setTipo(0); 
        
        System.out.println("Nome: " + leonardo.getNome());
        System.out.println("CPF: " + leonardo.getCpf());
        System.out.println("Salário: R$ " + leonardo.getSalario());
        System.out.println("Bonificação: R$ " + leonardo.getBonificacao());

        Gerente theo = new Gerente();
        theo.setCpf("895.123.564-51");
        theo.setNome("Theo Borges Oliveira");
        theo.setSalario(9410);
        theo.setTipo(1);
        theo.setSenha(1241515);

        System.out.println("\n O nome é: " + theo.getNome());
        System.out.println("O CPF é: " + theo.getCpf());
        System.out.println("O salário é: " +theo.getSalario());
        System.out.println("A bonificação é: " + theo.getBonificacao());
        System.out.println(theo.autentica(1241515));
    }
}