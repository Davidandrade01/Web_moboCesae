import java.util.Random;


class AppDados{
    //Definição do construtor
    AppDados(){
        
        
        Random numeroAleatorio= new Random();
        
        int ResultadoDoDado= numeroAleatorio.nextInt()+1;
        System.out.println("O programa vai lançar um dado:"  + ResultadoDoDado);
                    
    }
    

}






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



