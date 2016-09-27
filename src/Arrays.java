/**
 * M�todos utilit�rios que operam sobre arrays
 *   - recebem por par�metro arrays
 *   - retornam arrays
 * Created by msousa on 5/8/2015.
 */
public class Arrays {
    // Retorna um array com a frequ�ncia de cada letra n�o distinguindo mai�scula de min�scula.
    //   �ndice 0  - frequ�ncia da letra 'a', �ndice 1  - frequ�ncia da letra 'b', e assim sucessivamente.
    public static int[] countFrequence( String phrase ) {
        int[] counts = new int['z' - 'a' + 1];
        for (int i = 0; i < phrase.length(); ++i) {
            char c = phrase.charAt(i);
            if (Characters.isLetter(c)) {
                c = Characters.toLowerCase(c);
                ++counts[c - 'a'];
            }
        }
        return counts;
    }

    // Retorna o maior valor contido no array .
    public static int maximum( int [] array ) {
        int max = array[0];
        for ( int i=1; i < array.length; ++i ) {
            if ( array[i] > max ) max = array[i];
        }
        return max;
    }

    // Preenche result com o  resultado  da interse��o.  Retorna o n�mero  de elementos
    // da interse��o. Assume que result.length >= ao n�mero de elementos da interse��o.
    public static int intersection( int[] a, int[] b, int[] result ) {
        int ia = 0, ib = 0, ir = 0;
        while( ia <  a.length && ib < b.length ) {
            if ( a[ia] < b[ib] ) ++ia;
            else if ( b[ib] < a[ia] ) ++ib;
            else {
                result[ir]= a[ia];
                ++ia; ++ib; ++ir;
            }
        }
        return ir;
    }

    // Retorna o array que resulta interse��o.
    public static int[] intersection(int[] a, int[] b ) {
        int[] result = new int[a.length];
        return copy( result, intersection(a, b, result) );
    }

    // Produz um array com os primeiros numberOfElements valores do array recebido por par�metro.
    public static int[] copy( int[] array, int numberOfElements ) {
        int[] result = new int[ numberOfElements];
        for(int i = 0; i < result.length ; ++i ) {
            result[i]= array[i];
        }
        return result;
    }

    // Preenche result com o resultado da subtra��o.  Retorna  o  n�mero de elementos
    // da subtra��o.  Assume que result.length � maior ou igual ao n�mero de elementos
    // da subtra��o
    public static int subtraction( int[] a, int[] b, int[] result) {
        int ia, ib, ir;
        ia= ib = ir = 0; // Iniciar os indices dos tr�s arrays: a, arrayB e arrayR.
        // Obter o array resultado da subtra��o
        while( ia <  a.length && ib < b.length )
            if ( a[ia] < b[ib] ) {
                result[ir] = a[ia];
                ++ia; ++ir;
            }
            else if ( b[ib] < a[ia] ) ++ib;
            else { ++ia; ++ib; }

        for ( ; ia < a.length; ++ia, ++ir )
            result[ir] = a[ia];

        return ir;
    }


    // Inser��o ordenada de forma decrescente.
    // Assume que o array tem espa�o para n+1 valores
    public static void insertSortDecrease( int[] array, int n, int value ) {
        // Inser��o ordenada de forma decrescente
        int indexInsertion = n; // O indice onde vai ser colocado o value.
        // � partida � no fim de todos os inseridos.
        // Enquanto n�o chegar ao inicio do array e o valor na posi��o anterior
        // for menor (ordem DECRESCENTE), deslocar o valor anterior de uma posi��o
        // para a direita.
        for ( ; indexInsertion > 0 &&
                array[ indexInsertion-1 ] < value; --indexInsertion ) {
            array[indexInsertion] = array[indexInsertion-1]; // Deslocar para a direita
        }
        // Colocar o valor na posi��o.
        array[indexInsertion] = value;
    }

    // Retorna o �ndice do menor valor dos valores de index1 a index2 do array
    public static int indexOfLess( int[] array, int i, int n ) {
        int indexLess = i;
        for (int j = i+1; j < n; ++j )
            if ( array[j] < array[indexLess] )
                indexLess = j;
        return indexLess;
    }

    // Retorna o �ndice do menor valor dos n primeiros valores do array
    public static int indexOfLess( int[] array, int n ) {
       return indexOfLess( array, 0, n );
    }

    // Retorna o �ndice do menor valor no  array
    public static int indexOfLess( int[] array ) {
        return indexOfLess( array, 0, array.length );
    }

    // Troca os valores no array
    public static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    // Ordena os n primeiros valores do array passado por par�metro de forma decrescente
    // - Algoritmo SELECTION SORT
    public static void sortDecrease(int[] array, int n) {
        for (int i = 0; i < n; ++i) {
            //Colocar na posicao i o menor a partir de i inclusive
            int indexLess = indexOfLess(array, i, n );
            // Trocar o valor do indice i com o valor do indice indexLess
            swap(array, i, indexLess);
        }
    }
}
