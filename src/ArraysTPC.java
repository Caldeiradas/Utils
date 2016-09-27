

public class ArraysTPC {

    /**
     * Implement the static method unique that, given a *sorted* array, removes the duplicated elements.
     * After execution, the distinct array elements should be in contiguous positions.
     * The number of distinct elements in the array is returned.
     * <p>
     * Linear -- O(n) complexity
     *
     * @param array
     * @param length
     * @return The number of distinct elements in the array is returned.
     */
    public static int unique(int[] array, int length) {
        int write = 1, curr = 1;
        if (length > array.length || length <= 0)
            return 0;
        for (; curr < length; curr++) {
            if (array[curr] != array[curr - 1]) {
                array[write] = array[curr];
                write++;
            }
        }
        return write;

    }

    /**
     * Implement the static method findElementsThatSumTo that, given a *sorted* array, a range [l,r]
     * where to lookup, and an integer element, returns an array of two elements such that their sum
     * is equal to element.
     * <p>
     * Those two elements are returned in an array containing two elements. If such pair of elements don't exist,
     * an empty array is returned.
     * <p>
     * Linear -- O(n) complexity
     *
     * @param array
     * @param l
     * @param r
     * @param element
     * @return returns an array containing two elements that sum to @param element. If such pair of elements don't exist,
     * an empty array is returned.
     */
    public static int[] findElementsThatSumTo(int[] array, int l, int r, int element) {
        int res;
        for (; l < r; ) {
            res = array[l] + array[r];
            if (res == element)
                return new int[]{array[l], array[r]};
            else {
                if (res < element) l++;
                else r--;
            }
        }
        return new int[0];
    }


    /**
     * Implement the static method binarySearch that, given a *sorted* array, a range [l,r]
     * where to lookup, and an integer element, returns the index of that element in the array,
     * or -1 if the element don't exist.
     * <p>
     * Logarithmic -- O(log n) complexity
     *
     * @param array
     * @param l
     * @param r
     * @param element
     * @return returns the index of that element in the array,
     * or -1 if the element don't exist.
     */
    public static int binarySearch(int[] array, int l, int r, int element) { //O(log_2_N) melhor loca
        int mid;
        while (l <= r) {
            mid = l + (r - l) / 2; // or mid = (l+r)/2
            if (element == array[mid])
                return mid;
            else if (element > array[mid])
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }


    /**
     * Implement the static method binarySearchR that, given a *sorted* array, a range [l,r]
     * where to lookup, and an integer element, returns the index of that element in the array,
     * or -1 if the element don't exist.
     * <p>
     * Logarithmic -- O(log n) complexity
     * Space complexity also logarithmic
     *
     * @param array
     * @param l
     * @param r
     * @param element
     * @return returns the index of that element in the array,
     * or -1 if the element don't exist.
     */
    public static int binarySearchR(int[] array, int l, int r, int element) {
        // Base cases
        if (l > r)
            return -1; // Empty range

        int mid = l + (r - l) / 2; // or mid = (l+r)/2
        if (element == array[mid])
            return mid;
        // Recurrence part
        if (element > array[mid])
            return binarySearchR(array, mid + 1, r, element);
        else
            return binarySearchR(array, l, mid - 1, element);
    }


    /**
     * Lower bound is a version of binary search: it attempts to find the element value in an ordered range [l, r].
     * Specifically, it returns the first position where val could be inserted without violating the ordering.
     * Lower bound returns the furthermost index i in [l, r] such that, for every index j in [l, i[, array[j] < value.
     * The triple (array, l, r) represents the subarray of parameter array.
     * Note: If all numbers in the array are less than val, the r+1 index is returned (off-the-end index)
     *
     * @param array
     * @param l
     * @param r
     * @param val
     * @return
     */
    // encontrar o indice onde se poem o valor val (retorna o sítio)
    public static int lowerBound(int[] array, int l, int r, int val) {
        /// TODO
        int mid;
        if (l > r)
            return -1; // Empty
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (val > array[mid])
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }

    /**
     * Assumes that n >= 0 and a > 0
     *
     * @param a the base
     * @param n the exponent
     * @return returns a power to n
     */
    public static int powerLinear(int a, int n) {
        /// TODO
        int res = 1;
        for (int i = 1; i <= n; i++) res *= a;
        return res;
    }


    /**
     * Assumes that n >= 0 and a > 0
     *
     * @param b the base
     * @param n the exponent
     * @return returns a power to n
     */
    public static int powerLogarithmicRec(int b, int n) {
        /// TODO : divide and Conquer
        /*
        2^10 = 2^5 * 2^5 --> 2^5 = 2^2 * 2^2 * 2 --> 2^2 = 2 * 2
         */
        int power;
        if (n == 0) return 1; //
        if (n == 1) return b; //
        power = powerLogarithmicRec(b, n / 2);
        if (n % 2 == 0)
            return power * power;
        return power * power * b;
    }

    public static int powerLogarithmic(int b, int n) {
        int power;
        int caunter = 0;
        for (; n <= 1; n /= 2) {
            if (n == 0) caunter += 1; //
            else if (n == 1) caunter += b; //
        }
        while (caunter>0)
            power =
        return -1;
    }

    //
    // TEST
    //
    public static void main(String[] args) {
        // Testing unique:
        int[] arr = {1, 1, 1, 3, 3, 4, 5, 5, 5, 7, 7};
        System.out.println("Testing unique:");
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        int newLen = unique(arr, arr.length);
        System.out.println("Resulting array: " + java.util.Arrays.toString(arr) + "\t newLen = " + newLen);

        System.out.println(); // New line

        // Testing findElementsThatSumTo:
        System.out.println("Testing findElementsThatSumTo:");
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        int sum = 9;
        int[] pair = findElementsThatSumTo(arr, 0, arr.length - 1, sum);
        if (pair.length == 0)
            System.out.println("Can't find two integers that sum to " + sum);
        else
            System.out.println("Integers that sum to " + sum + ": " + pair[0] + " and " + pair[1]);

        System.out.println(); // New line

        // Testing binarySearch:
        System.out.println("Testing binarySearch:");
        int[] bSearchArr = {1, 5, 8, 10, 13, 14, 15, 20, 32, 34, 50};
        System.out.println("Original array: " + java.util.Arrays.toString(bSearchArr));
        int elem = 34;
//        int elem = 35;
        int idx = binarySearch(bSearchArr, 0, bSearchArr.length - 1, elem);
        if (idx == -1)
            System.out.println("Can't find element " + elem);
        else
            System.out.println("Element " + elem + " was found in index " + idx);

        System.out.println(); // New line

        // Testing lowerBound:
        // Lower bound is a version of binary search: it attempts to find the element value in an ordered range [l, r].
        // Specifically, it returns the first position where val could be inserted without violating the ordering.
        // Lower bound returns the furthermost index i in [l, r] such that, for every index j in [l, i[, array[j] < value.
        System.out.println("Testing lowerBound:");
        int arr1[] = {1, 2, 3, 3, 3, 5, 8};
        System.out.println("Original array: " + java.util.Arrays.toString(arr1));
        final int N = arr1.length;
        for (int i = 1; i <= 10; ++i) {
            idx = lowerBound(arr1, 0, N - 1, i);
            System.out.println("Searching for " + i + ".");
            System.out.print("Result: index = " + idx + ", ");
            if (idx != N)
                System.out.println("a[" + idx + "] == " + arr1[idx]);
            else
                System.out.println("which is off-the-end.");
        }

        System.out.println(); // New line

        // Testing powerLinear:
        System.out.println("Testing powerLinear:");
        int a = 2; // base
        int n = 10; // exp
        int p = powerLinear(a, n);
        System.out.println(a + "^" + n + " = " + p);

        System.out.println(); // New line

        // Testing powerLogarithmic:
        System.out.println("Testing powerLogarithmic:");
        p = powerLogarithmic(a, n);
        System.out.println(a + "^" + n + " = " + p);

    }


}









