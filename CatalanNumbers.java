public class CatalanNumbers {

    static long cn(int n) {
        return n == 0 ? 1 : (4L * (n - 1) + 2) * cn(n - 1) / (n + 1);
    }


}
