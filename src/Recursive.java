public class Recursive {
    /*
    * recursive method to output every other element in the given array backwards,
    * ending with the element at index k.
    * An example input arrary {1,2,3,4,5,6,7,8,9,10}, called with k=2, should output 9753
    */
    public static void printEveryOther(final int[] ia, final int k) {
        if (k <= ia.length - 1 ) {
            printEveryOther(ia, k + 2);
            if (k >= 0)
                System.out.println(ia[k]);
        }
    }

    /*
    * recursively take in a string and place a * between adjacent letters that are the same
    * An example input String "hello" should return hel*lo.
    */
    public static String printStars(final String s) {

        if (s == null || s.length() <= 1)
        {
            return s;
        }
        else
        {
            if (s.charAt(0) == s.charAt(1))
            {
                return s.charAt(0) + "*" + printStars(s.substring(1));
            }
            else
                return s.charAt(0) + printStars(s.substring(1));
        }
    }

    public static void main(String[] args) {
        printEveryOther(new int[]{1,2,3,4,5,6,7,8,9,10}, 2);
        System.out.println(printStars("Hello"));
    }
}