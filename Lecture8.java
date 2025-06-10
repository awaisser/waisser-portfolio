public class Lecture8 {
    public static int findGCDNR (int n, int m) {
        int comDivisor = Math.min(n,m);
        for (int i = comDivisor; i>0;i--){
            if(n%i ==0 && m%i==0)
                return i;
        }
        return 1;
    }
    public static int findGCDR (int n, int m){
        int i = Math.min(n,m);
        return findGCDR(n,m,i);
    }
    public static int findGCDR (int n, int m, int i){
        if (i ==1) return 1;
        if (n%i ==0 && m%i==0) return i;

        return findGCDR(n,m,i-1);
    }
}
