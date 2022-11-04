public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();

       System.out.println("canal: " + smartTv.canal);
       smartTv.mudarCanal(12);

        System.out.println("Estado da Tv: " + smartTv.ligada);
        System.out.println("canal: " + smartTv.canal);
        System.out.println("volume: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Estado da Tv: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Estado da Tv: " + smartTv.ligada);

    }
}
