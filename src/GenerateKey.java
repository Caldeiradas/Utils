import java.util.Scanner;

/**
 * Created by Goncalo on 12/06/2015.
 */
public class GenerateKey {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dim? ");

        int[] question = new int[in.nextInt()];
        System.out.print("Valor m�nimo? ");
        int val=in.nextInt();


        System.out.print("Rip? ");

        for (int rip = in.nextInt(); rip >= 0; --rip) { /* Repetir o c�digo rip e uma vezes de modo a verifica o c�digo melhor
                                                    se realmente est� a repetir valores ou n�o*/
            question[0] = (int) (val+(Math.random() * 10 +0.5));

            for (int i = 1; i < question.length; ++i) {
                boolean same = true;
                do {
                    int aux = (int) (val+(Math.random() * 10+0.9));
                    for (int k = i; k > 0; --k) {
                        if (question[k - 1] == aux) {
                            same = true;
                            break;
                        } else same = false;
                    }
                    question[i] = aux;
                } while (same);
            }

            // ***************************************** print ******************************************* //
            for (int i = 0; i < question.length; ++i)
                System.out.print(question[i] + " ");
            System.out.println(" ");
        }
    }
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void randomNoRepeat (int dim, int[] key) {
        key[0] = (int) (Math.random() * dim);

        for (int i = 1; i < key.length; ++i) {
            boolean same = true;
            do {
                int aux = (int) (Math.random() * dim);
                for (int k = i; k > 0; --k) {
                    if (key[k - 1] == aux) {
                        same = true;
                        break;
                    } else same = false;
                }
                key[i] = aux;
            } while (same);
        }
    }
}


