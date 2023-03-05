public class SmartTv {
    boolean ligada=false;
    int canal=0;
    int volume=0;
    final int VOLUME_MAXIMO = 100;
    final int VOLUME_MINIMO = 0;

    public void ligar(){
        ligada = true;
        canal = 1;
        volume = 15;
    }

    public void desligar(){
        ligada = false;
        volume = 0;
        canal = 0;
    }

    public void aumentarVolume(){
        if(volume<VOLUME_MAXIMO){
            volume++;
            System.out.println("Volume aumentado para: "+volume);
            
        }
    }

    public void diminuirVolume(){
        if(volume>VOLUME_MINIMO){
            volume--;
            System.out.println("Volume reduzido para: "+volume);
            
        }
    }

    public void mudarDeCanal(int novoCanal){
        canal=novoCanal;

    }

    public void passarCanal(){
        if (canal==100){
            canal=1;
        }else{
            canal++;
        }
        System.out.println("canal: "+canal);
    }

    public void voltarCanal(){
        if (canal<=1){
            canal=100;
        }else{
            canal--;
        }
        System.out.println("canal: "+canal);
    }



}
