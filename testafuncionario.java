public class testafuncionario {
    public static void main(String[] args) {
        funcionario Leonardo = new Funcionario();
        Leonardo.setCpf("888.123.534-78");
        Leonardo.setNome("Leonardo");
        Leonardo.setSalario(5000);

        System.out.println(Leonardo.getNome());
        System.out.println(Leonardo.getCpf());
        System.out.println(Leonardo.getSalario());
        System.out.println(Leonardo.getBonificacao());;
    }
    
}
