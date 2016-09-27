import java.util.Scanner;

/**
 * Created by Ant�nio Amorim on 13/06/2015.
 * Este c�digo � apenas para testar. Precisa de ser paramtrizado antes de se poder usar.
 */
public class Random_II {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dim? ");
        int[] question = new int [in.nextInt()];

        System.out.print("Rip? ");
        for(int rip= in.nextInt(); rip>=0; --rip) { /* Repetir o c�digo rip vezes de modo a verifica o c�digo melhor
                                                    se realmente est� a repetir valores ou n�o*/
            int [] key = {7,5,0,1,2,4,6,3}; // funciona com qualquer ordena��o
            int maxKey = 8;
            for(int i=0; i<question.length; ++i){
                int aux = (int)(Math.random()*maxKey);
                question[i]=key[aux];
                key[aux]=key[maxKey-1];
                -- maxKey;
            }

            // ***************************************** print ******************************************* //
            for (int i = 0; i < question.length; ++i)
                System.out.print(question[i] + " ");
            System.out.println(" ");
        }

    }

    // #################################################################################################################

/*    public static int[] randomNoRepeat_II (int vMin, int vMax, int dim, int[] key){

        if (vMax-vMin < dim){
            System.out.print("erro");
            return null;
        }
        else{
            
        }

    }
    */
}
