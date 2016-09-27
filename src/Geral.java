/**
 * Created by Caldeira on 25/09/2016.
 */
public class Geral {
    public static void main(String[] args) {
        int[] out = new int[10];
        for (int i = 0; i < out.length; i++) {
            out[i] = (int)(Math.random()*6);
        }
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i]);
        }
    }
}
