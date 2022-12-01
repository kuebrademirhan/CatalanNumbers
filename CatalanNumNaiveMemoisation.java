public class CatalanNumNaiveMemoisation {
    public static long cnNaiveMem(int n) {
        long[] temp=new long[n+1];
        return cnNaiveMemHelper(n,temp);
    }
    public static long cnNaiveMemHelper(int n, long[] table){
        if(table[n]!=0){
            return table[n];
        }

        long result;
        if(n==0){
            result=1;
        }else{
            result=(4L * (n - 1) + 2) * cnNaiveMemHelper(n - 1,table) / (n + 1);
        }
        table[n]=result;

        return result;

    }

    public static void main(String[] args) {
        long res=cnNaiveMem(4);
        System.out.println(res);
    }
}
