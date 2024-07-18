import java.util.Random;

class DadosRandomicos{
    
    DadosRandomicos(){
        System.out.println(rand());
        System.out.println(rand());
        System.out.println(rand());
        System.out.println(rand());

    }
    
     int  rand(){
        Random numeroAleatorio= new Random();
        int r= numeroAleatorio.nextInt(1,6);
        return r;
    }
}
