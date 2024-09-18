public class arrayMultidimencionalYoutube {

    public static void main(String[] args) {
        //declaracion matriz
        int matriz [][]=new int[3][3];

        //asignacion manual
        matriz[0][0]=5;
        matriz[0][1]=2;
        matriz[0][2]=6;
        matriz[1][1]=34;
        matriz[1][2]=65;
        matriz[2][0]=23;
        matriz[2][1]=22;
        matriz[2][2]=56;
        
        //recorrido
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
              System.out.println("el valor de la posicion fila: "+f+" columna: "+c);
              System.out.println("es de:"+matriz[f][c]);  
            }
        }









    }
}
