public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Aluno pessoa2 = new Aluno();
        Professor pessoa3 = new Professor();
        Funcionario pessoa4 = new Funcionario();

        pessoa1.setNome("Erica");
        pessoa2.setNome("Benjamim");
        pessoa3.setNome("Nicollas");
        pessoa4.setNome("Luccas");

        pessoa1.setSexo("F");
        pessoa2.setSexo("M");
        pessoa3.setIdade(18);
        pessoa2.setCurso("Informática");
        pessoa3.setSalario(2500.00);
        pessoa3.receberAumento(200.0);
        pessoa4.setSetor("Estoque");

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println(pessoa4.toString());

       // System.out.println(" Meu nome é " + pessoa3.getNome() + " e meu salario é R$ " + pessoa3.getSalario());

    }
}