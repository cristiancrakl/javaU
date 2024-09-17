public class array_multidimencional {

    public static void main(String[] args) {
        

        int [][] matriz=new int[3][4];//matriz de 3 filas y 4 columnas


        int valor = matriz [2][3];//por la matriz sacar un valor de ella

        System.out.println(valor);



        //recorrer matriz
        for (int i = 0; i < matriz.length; i++) { //recorrer filas}
            System.out.println(i);
            for (int j = 0; j < matriz[i].length; j++) {//recorrer columnas
                
                System.out.print(matriz[i][j]+",");
            }
            System.out.println();
        }






        
        

    }
}
