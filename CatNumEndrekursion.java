public class CatNumEndrekursion {
    public static long endrecat (int n ) {
        return endrecatHelper (n);
    }
    public static long endrecatHelper ( long n  ) {
        if ( n == 0) return 1 ;
        return (4L * (n - 1) + 2)*endrecatHelper(n -1 )/ (n + 1); // Endrekursion

    }

    public static void main(String[] args) {
        long temp=endrecat(4);
        System.out.println(temp);
    }
}
