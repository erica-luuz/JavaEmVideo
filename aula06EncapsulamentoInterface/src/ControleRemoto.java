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
    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public Boolean getLigado() {
        return this.ligado;
    }
    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }
    public Boolean getTocando() {
        return this.tocando;
    }
    public void setTocando(Boolean tocando) {
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
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume()); //tirei o ln do print para dar o efeito do for;
        for (int i = 0; i <= this.getVolume(); i +=10){
            System.out.println("I");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);

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
        if(this.getLigado() && this.getTocando())
            this.setTocando();
    }

    @Override
    public void pause() {

    }
}
