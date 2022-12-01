public class CatNumsGlobalArr {
    private static final int MAX_VALUE = 1000;
    private static long [] table = null ;
    static { // wird ausgef ührt , bevor die Klasse das erste Mal " betreten " wird
        table = new long [ MAX_VALUE +1];
         }

    public static long cnmem ( int n ) {
// Alternative : if ( table == null ) { /* Code des static - Blocks */ }
        if ( n > MAX_VALUE ) { return -1; }
        return cnmemHelper (n);
    }
    private static long cnmemHelper (int n ) {
        if ( table [ n ] != 0) { return table [ n ]; } // Lookup
        long result ;
        if ( n == 0 ) { result = 1; }
        else{
            result = ( (4L * (n - 1) + 2) * cnmemHelper(n - 1) / (n + 1));
        }
        table [ n] = result ; // Memoization
        return result ;
    }



}
