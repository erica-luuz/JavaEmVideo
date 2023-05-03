public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private Boolean ligado;
    private Boolean tocando;

    // Metodos Especiais:

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    private int getVolume() {
        return this.volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private Boolean getLigado() {
        return this.ligado;
    }
    private void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }
    private Boolean getTocando() {
        return this.tocando;
    }
    private void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }

    // Metodos Abstratos:

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------------Menu---------------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume()); //tirei o ln do print para dar o efeito do for;
        for (int i = 0; i <= this.getVolume(); i +=10){
            System.out.print("I");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(getVolume() + 5);
        }else {
            System.out.println("Impossivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume()== 0){
           this.setVolume(24);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else {
            System.out.println("Não consegui pausar");
        }
    }
}
