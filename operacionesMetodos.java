

import java.util.Scanner;


public class operacionesMetodos {

    Scanner scanner=new Scanner(System.in);



    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;



    //metodos
    

    //metodo para pedirle 2 numeros a el usuario
    public void leerNumeros(){

        System.out.print("Digite el primer numero: ");
        numero1=scanner.nextInt();
        
        System.out.println(" "); 

        System.out.print("Digite el segundo numero: ");
        numero2=scanner.nextInt();
    }



    public void sumar(){

        suma=numero1+numero2;
    }
    public void restar(){
        resta=numero1-numero2;
    }
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    public void dividir(){
        division=numero1/numero2;
    }
    public void MostrarResultado(){
     System.out.println(suma+resta+multiplicacion+division);   
    }



    
    public static void main(String[] args) {
        operacionesMetodos op =new operacionesMetodos();


        op.leerNumeros();
        op.multiplicar();
        op.MostrarResultado();
        
        
   
   
   
   
   
    }





}




