package _10_matricesArreglosBidimensionales;

public class _04_buscarElementos {
    public static void main(String[] args) {

        int[][] matrizEnteros = {
                {35,90,3,1978},
                {4,20,30,12},
                {33,22,443,10}
        };

        int elementoBuscar = 30;
        boolean encontrado = false;

        buscar:
        for (int[] matrizEntero : matrizEnteros) {
            for (int i : matrizEntero) {
                if (i == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if(encontrado){
            System.out.println("Encontrado: " + elementoBuscar);
        }
    }
}
