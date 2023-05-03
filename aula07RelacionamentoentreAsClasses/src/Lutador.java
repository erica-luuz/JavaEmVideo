public class Lutador implements LutaTatame {
    private String nome;
    private String nacionalidade;
    private int idade;
    private Double altura;
    private Double peso;
    private  String categoria;
    private int vitorias;
    private  int derrotas;
    private int empates;

    public Lutador() {}

    public Lutador(String nome, String nacionalidade, int idade, Double altura, Double peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    @Override
    public void apresentar(){
        System.out.println("-------------------------------");
        System.out.println("Apresentamos o Lutador: " +this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + "anos e " + this.getAltura() + " metros");
        System.out.println("Pesando: " + this.getPeso() + " Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());

    }
    @Override
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias() + " vezes");
        System.out.println("Perdeu: " + this.getDerrotas() + " vezes");
        System.out.println("Empatou: " + this.getEmpates() + " vezes");
    }
    @Override
    public  void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    @Override
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    @Override
    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

        public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
