public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv SmartTv = new SmartTv();

        System.out.println("Televisão ligada? " + SmartTv.ligada);
        System.out.println("Canal atual : " + SmartTv.canal);
        System.out.println("Volume atual : " + SmartTv.volume);

        SmartTv.mudarCanal(13);
        System.out.println("Canal atual : " + SmartTv.canal);

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();

        System.out.println("Novo status do volume: " + SmartTv.volume);

        // SmartTv.ligar();
        // System.out.println("Novo status: Televisão ligada? " + SmartTv.ligada);

        // SmartTv.desligar();
        // System.out.println("Novo status: Televisão ligada? " + SmartTv.ligada);


    }
}
