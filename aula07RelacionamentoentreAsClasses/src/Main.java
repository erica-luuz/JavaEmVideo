public class Main {
    public static void main(String[] args) {
        /*Lutador lutador01 = new Lutador("Pretty Boy","França",31,1.75,68.9,4,6,2);
        System.out.println(lutador01.getNome());

        Lutador lutador02 = new Lutador("Putscript","Brasil",29,1.68,57.8,8,1,0);
        System.out.println(lutador02.getNome());

        Lutador lutador03 = new Lutador("Snapshadow","EUA",35,1.65,80.9,3,4,1);
        System.out.println( lutador03.getNome());
        Lutador lutador04 = new Lutador("Dead Code","Austrália",28,1.93,81.6,6,4,3);
        System.out.println(lutador04.getNome());*/

        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("Dead Code","Australia",28,1.93,81.6,13,0,2);
        lutador[1] = new Lutador("Pretty Boy","França",31,1.75,68.9,4,6,2);
        lutador[2] = new Lutador("Putscript","Brasil",29,1.68,57.8,8,1,0);
        lutador[3] = new Lutador("Snapshadow","EUA",35,1.65,68.9,11,2,1);
        lutador[4] = new Lutador("UFOCobol","Brasil",37,1.7,119.3,5,4,3);
        lutador[5] = new Lutador("Nerdaart","EUA",30,1.81,105.7,12,2,4);

        lutador[3].setPeso(85.0);
        lutador[3].perderLuta();
        lutador[3].status();


    }
}