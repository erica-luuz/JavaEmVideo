public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private Boolean aprovada;
    //Metodos Publicos
    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2){
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        // 9 min video 8b
    }
    // Metodos Especiais:

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
}
