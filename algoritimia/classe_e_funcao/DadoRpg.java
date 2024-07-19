
import java.util.Random;
import java.util.Scanner;

// class DadoRpg {
    
   
    
//      DadoRpg(){
        
//         lancamento();
        
       
//     }
    
    
//    void  lancamento(){
//         Random sort=new Random();
//         Scanner scn= new Scanner(System.in);
        
//         int option= scn.nextInt();
        
//         if (option == 4){
//             int s= sort.nextInt(1,4);
//         System.out.println("O número sorteado foi :" + s);
//         }
        
//         if(option == 6){
//             int s2= sort.nextInt(1,6);
//             System.out.println("O número sorteado foi :" + s2);
//         }
        

//     };
// }

class DesafioFuncParam{
    
    DesafioFuncParam(){
        
        roll();
        userInput();
}

    void roll(){

        System.out.println("Bem vindo ao simulador de lançamentos");
        System.out.println("Este Programa permite apenas lançamento de dados 4,6");
        
        
        

}

    int userInput(){
       
        Scanner scn= new Scanner(System.in);
        int lancamento= scn.nextInt();
        
        if (lancamento==4 || lancamento==6) {
        
        int s=scn.nextInt(lancamento);
        
        
    }
}
}


 