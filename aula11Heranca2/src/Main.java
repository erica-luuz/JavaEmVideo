public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        v1.setNome("Gordo");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("Nicollas");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(12);
        a1.setSexo("M");
        a1.pagarMensalidade();
        //System.out.println(a1.toString());
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setValorBolsa(12.5);
        b1.setSexo("M");
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Heberton");
        p1.setSalario(1000.0);
        p1.receberAumento(100.0);
        System.out.println("O funcionario " + p1.getNome() + " ,passou a receber o salário de R$ " + p1.getSalario());


    }
}