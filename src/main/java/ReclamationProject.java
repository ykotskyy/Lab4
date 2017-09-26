/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */


/**
    *  this is a java doc about the code below.
    */

public class ReclamationProject {

    /**
     *
     * @param a string
     * @param b string
     * @return returns a string
     */
        static String doit(final String a,  final String b) {
        if (a.length() > b.length()) {
            String c = "";
            String wordone = a; // set c to a
            String wordtwo = b;
            wordtwo = c;
            }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {

                            if (a.regionMatches(i, b, k, j) && j > r.length()) {
                                 r = a.substring(i, i + j);
                            }
                        }
                    }
        } return r; }
}
