/**
 * M�todos utilit�rios que operam sobre inteiros
 *   - recebem por par�metro inteiros
 *   - transformam em inteiros
 * 
 * Created by msousa on 5/13/2015.
 */
public class Integers {

     public static int parseUnsignedInt(String s) {
        int result= 0;
        for ( int i = 0; i < s.length() ; ++i) {
            if ( !Characters.isDigit(s.charAt(i))) return -1;
            result = result*10 + Characters.digit( s.charAt(i) );
        }

        return result;
    }

}
