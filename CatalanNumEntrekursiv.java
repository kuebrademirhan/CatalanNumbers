public class CatalanNumEntrekursiv {

    public static long CatalanIterativ ( long n ) { // entrekursivierte Version von endrecatHelper ()
        long acc = 1; // ehemals Akkumulator - Parameter
        // return (4L * (n - 1) + 2)*endrecatHelper(n -1 )/ (n + 1);
        int i=1;
        while ( i < n+1) {
            acc=acc* (4L * (i - 1) + 2)/ (i + 1);
            i++;
        }
        return acc ;
    }

    public static void main(String[] args) {
        long temp=CatalanIterativ(6);
        System.out.println(temp);
    }

}
