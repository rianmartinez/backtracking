public class Principal {

    public static int numMinMutaciones(String cadena1, String cadena2) {
        return numMinMutacionesAux(cadena1, cadena2, Integer.MAX_VALUE, 0, false);
    }

    public static int numMinMutacionesAux(String cadena1, String cadena2,int numMinMutaciones, int numMinMutacionesAct, boolean exito){
        int j = 0; //operaciones en las que se encuentra
        int solucion;
        solucion = numMinMutaciones(cadena1, cadena2);

        do{
            if(cadena1.charAt(0) == cadena2.charAt(0)){
                numMinMutacionesAux(cadena1.substring(1), cadena2.substring(1), numMinMutaciones, numMinMutacionesAct, exito);
            }
            else{ //caracteres distintos

                //SUSTITUIR

                if(j==0) numMinMutacionesAux(cadena1.substring(1), cadena2.substring(1), numMinMutaciones, numMinMutacionesAct+1, exito);

                //ELIMINAR

                else if(j==1)numMinMutacionesAux(cadena1.substring(1), cadena2.substring(0), numMinMutaciones, numMinMutacionesAct+1, exito);

                //AÑADIR

               else numMinMutacionesAux(cadena1.substring(0), cadena2.substring(1), numMinMutaciones, numMinMutacionesAct, exito);


                numMinMutacionesAct--; //desanotar
            }
            j++;
        }while(j <= 3);

        return numMinMutaciones;
    }

    public static boolean esAceptable(String cadena1, String cadena2){
        if(cadena1.isEmpty() || cadena2.isEmpty())
            return false;
        return true;
    }
    public static boolean esSolucion(String cadena1, String cadena2){
        if(cadena1.length() == 0 || cadena2.length() == 0)
            return true;
        else
            return false;
    }


}
 class BestSolution {
    int valor;
    public BestSolution(){
        valor=Integer.MAX_VALUE;
    }
    public int getValor(){
        return valor;
    }
    public void setValor(int v){
        valor=v;
    }
}

