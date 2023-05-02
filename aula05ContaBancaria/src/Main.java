public class Main {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco(01,"Erica");
        pessoa1.abrirConta("CC");
        pessoa1.pagarMensal();
        pessoa1.depositar(20.0);

        System.out.println("Nome: " + pessoa1.getTitular());
        pessoa1.extrato();

        ContaBanco pessoa2 = new ContaBanco(02,"Heberton");
        pessoa2.abrirConta("CP");
        pessoa2.depositar(100.0);


        ContaBanco pessoa3 = new ContaBanco();
        pessoa3.setNumConta(03);
        pessoa3.setTitular("Felomena");
        pessoa3.abrirConta("CP");
        pessoa3.depositar(500.0);
        pessoa3.sacar(1000.0);

        pessoa2.estadoAtual();
        pessoa3.estadoAtual();

    }
}