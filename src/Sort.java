/**
 * Created by Caldeira on 25/09/2016.
 */

public class Sort {
    public static int[] putInOrder(int[] array, final boolean up) {
        int dim = array.length;
        if (up) {
        for (int u = 1; u < dim; u++) {
            if ((array[u] < array[u - 1]))
                /*
                * do {
                * */
            for (int i = u; (i > 0) ; i--) {// ToDo trocar para do{}while()
                if ((array[i] < array[i - 1]))  Arrays.swap(array, i, i - 1);
                else break;
            }
        }}
        else{
            for (int d = 1; d < dim; d++) {
                for (int i = d; i > 0; i--) {
                    if ((array[i] > array[i - 1]))  Arrays.swap(array, i, i - 1);
                }

            }
        }
        return array;
    }
    // ====================================       TESTE       ==============================================
    public static void main(String[] args) {
        int[] out = new int[10];
        for (int i = 0; i < out.length; i++) {
            out[i] = (int)(Math.random()*6);
        }
        System.out.println("início");
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i]);
        }
        putInOrder(out,false);
        System.out.println('\n'+"fim");
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i]);
        }
    }


}