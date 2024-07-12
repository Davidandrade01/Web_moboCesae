// 1º Definição da classe AppTestes

class Apptestes{
    // 2º Definição de função construtora
    Apptestes(){
        
        //Declaração da variável do tipo inteiro
        int preco=12+5 ;

        //Declaração de variáveis   
        float numeroReal=3.45f;
        
        double numeroDouble=23.565665656;
        
        boolean boleano=true;
        
        char caracter='D';
        // Declaração e instanciação de uma  
        // string com a invocação do seu construtor
        String texto = new String("nova classse string criada");
        
    System.out.println("inicio do construtor");
      
      
      System.out.println(texto);
      System.out.println(caracter);
      
      
      System.out.println(texto+ caracter) ;
      
      feriasAgosto();
      System.out.println(funcaoQueRetornaValor());
      
      
    }
    
    void  feriasAgosto(){
    System.out.println("Animado para agosto")   ;
    
}

    int funcaoQueRetornaValor(){
        int v1=7;
        int v2=3;
        int valorTotal=v1+v2;
        
        return valorTotal;
    }
}