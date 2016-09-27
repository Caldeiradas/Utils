/**
 * M�todos utilit�rios que operam sobre caracteres
 *   - recebem por par�metro caracteres
 *   - transformam em caracter
 * Created by msousa on 5/8/2015.
 */
public class Characters {

    public static boolean isLetter(char c) { return isLowerLetter(c) || isUpperLetter(c);  }

    public static boolean isUpperLetter(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean isLowerLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static char toLowerCase(char c) {
        if ( isUpperLetter(c) )
            c = (char) (c - 'A' + 'a');
        return c;
    }

    public static boolean isDigit( char c ) {
        return c >= '0' && c <= '9';
    }

    // Retorna o valor num�rico do caracter d�gito na base 10
    public static int digit( char c )  {
        return  isDigit( c )? c - '0' : -1;
    }

    // Retorna o caracter que representa o digito na base 10
    public static char  forDigit( int digit )  {
        return (char) (digit + '0');
    }

}
