public class CatNumDP {
    public static long catnumDP ( int n ) {
        long [] table = new long [ n + 1];
        table [0] = 1;
        for (int i = 1; i <= n ; ++ i ) {
//  table [i -1] wurde zuvor bereits berechnet
// und haben deshalb bereits den richtigen Wert
            table [ i ] = (4L * (i - 1) + 2) * table[i-1] / (i + 1);
        }
        return table [ n ];
    }

    public static void main(String[] args) {
        long temp=catnumDP(10);
        System.out.println(temp);
    }
}
