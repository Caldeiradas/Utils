/**
 * Created by Caldera on 13/05/2015.
 * Este c�digo s� pode ser implemntado ap�s a verific�o de o elemento est�s compreendido entre 0 e 9
 */
public class ToInt {
    public static int convertStr (String alpha){
        int beta=0;
        for (int i=0; i<alpha.length();++i) {
            beta = beta*10 + (int)(alpha.charAt(i)-'0');
        }
        return beta;

    }
    public static int convertChar (char alpha) {
        int beta;
            beta = (alpha - '0');
        return beta;
    }

    public static int[] convertArrStr (String[] alpha){
        int [] beta = new int[alpha.length];
        for(int i=0; i<alpha.length; ++i){
            beta[i]=convertStr(alpha[i]);
        }
        return beta;
    }

    public static int[] convetArrChar (char[] alpha){
        int [] beta = new int[alpha.length];
        for(int i=0; i<alpha.length; ++i){
            beta[i]=convertChar(alpha[i]);
        }
        return beta;
    }
/**    public static int[] convertArrayStr (String[] array){
*        int[] beta= new int [array.length];
*        for (int i=0; i<array.length; ++i){
*            for (int k=0; k<array[i].length(); ++k, beta[i]*=10){
*                beta[i]=(int)(array[i].charAt(k)-'0');
*            }
*            beta[i]/=10;
*            return beta[i];
*        }
*
*    }*/

}
