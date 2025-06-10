public class DoublingTime {
    public static void main(String[] args) throws InterruptedException {
        double thisTime = 0; //C(2n)/C(n)
        double lastTime = 0;
        for (int n = 1; n < 33; n = 2 * n) {
            Stopwatch stopwatch = new Stopwatch();
            ///TO BE TIMED
            for (int i=0; i<n;i++)
                for(int j=i;j<i*i;j++)
                    Thread.sleep(1);
            ////
            double time = stopwatch.elapsedTime();
            lastTime=thisTime;
            thisTime=time;
            if(lastTime>0)
                System.out.println(thisTime/lastTime);
        }
    }
}
