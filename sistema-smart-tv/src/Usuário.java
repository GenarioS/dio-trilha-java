public class Usuário {
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv =new SmartTv();

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
       
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();


        smartTv.passarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();

        smartTv.mudarDeCanal(13);
        System.out.println("Canal: " + smartTv.canal);


    }
}
