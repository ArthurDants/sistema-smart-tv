public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        System.out.println("mudando de canal: " + canal);
        canal++;
    }
    public void diminuirCanal(){
        System.out.println("mudando de canal: " + canal);
        canal--;
    }

    public void aumentarVolume(){
        System.out.println("Aumentando volume: " + volume);
        volume++;
    }
    public void diminuirVolume(){
        System.out.println("diminuindo volume: " + volume);

        volume--;
    }
    public void desligar(){
        ligada=false;
    }
    public void ligar(){
        ligada=true;
    }

}
