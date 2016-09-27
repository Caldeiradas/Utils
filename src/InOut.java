import java.util.Scanner;

/**
 * M�todos utilit�rios de leitura e escrita
 * Created by msousa on 5/8/2015.
 */
public class InOut {
    public static String readPhrase(Scanner in, String msg) {
        System.out.print(msg);
        return in.nextLine();
    }

    // Le o n�mero de elementos e os valores
    public static int[] readArray( Scanner in, char id ) {
        System.out.print( "#" + id + '?');
        int[] array= new int[ in.nextInt() ];
        in.nextLine(); // Assegurar que os pr�ximos valores lidos s�o introduzidos na linha seguinte

        System.out.print( id + "?" );
        for (int i= 0; i < array.length; ++i)
            array[i] = in.nextInt();
        in.nextLine();

        return array;
    }

    // Preenche o array com os valores inteiros introduzidos. Termina a leitura quando  for introduzido um valor  que
    // n�o seja inteiro ou o array estiver complemente preenchido. Retorna o n�mero de valores inseridos no array.
    public static int readArray(Scanner in, int[] array) {
        int n;
        for (n = 0; n < array.length && in.hasNextInt(); ++n)
            array[n] = in.nextInt();
        return n;
    }

    // Escreve o caracter n vezes
    public static void print(char c, int n) {
        while (n-- != 0)
            System.out.print(c);
    }

    // Escreve todas as letras do abeced�rio
    public static void printLetters() {
        for( char c= 'a'; c <='z'; ++c ) {
            System.out.print( c );
        }
    }

    // Escreve a mensagem e os n primeiros elementos do array a.
    public static void printArray( String msg, int[] a, int n ) {
        System.out.print( msg );
        for (int i= 0; i < n; ++i )
            System.out.print(" " + a[i]);
    }

}
