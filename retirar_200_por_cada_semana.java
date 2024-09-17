public class retirar_200_por_cada_semana {

    public static void main(String[] args) {
        

        byte contador=0;
        int dinero=1000;

        do {
            
            System.out.print(dinero+",");

            dinero-=200;


            contador+=1;



        } while (contador!=4);
   
   
        System.out.println(" usted retiro "+contador+" veces en mes");
        System.out.println(" le quedan $"+dinero+" en su cuenta");
   
   
   
    }
}
