public class Problema4 {

    public void ordenarPorNombre(String[] nombres, int[] notas) {
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = i + 1; j < nombres.length; j++) {
                if (nombres[i].compareTo(nombres[j]) > 0) {
                    String tempNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = tempNombre;
                    int tempNota = notas[i];
                    notas[i] = notas[j];
                    notas[j] = tempNota;
                }
            }
        }
    }

    public void ordenarPorNota(String[] nombres, int[] notas) {
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    int tempNota = notas[i];
                    notas[i] = notas[j];
                    notas[j] = tempNota;
                    String tempNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = tempNombre;
                }
            }
        }
    }
}
