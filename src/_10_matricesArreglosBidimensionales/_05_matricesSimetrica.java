package _10_matricesArreglosBidimensionales;

public class _05_matricesSimetrica {
    public static void main(String[] args) {

        boolean simetrica = true;
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 8},
                {3, 0, 1, 12},
                {4, 8, 12, 0}
        };

        int i, j;
        i = 0;
        while (i < matriz.length) {
            j = 0;
            while (j < matriz[i].length && simetrica) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
                j++;
            }
            i++;
        }

    }
}
