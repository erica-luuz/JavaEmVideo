public class Funcionario extends Pessoa{
    // Atributos
    private  String setor;
    private Boolean trabalhando;
    // Metodos
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }
    // Metodos Especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
