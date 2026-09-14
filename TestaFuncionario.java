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
    }
}