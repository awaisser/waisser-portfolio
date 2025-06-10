public class TimeExperiment {
    public static void main (String[] args) throws InterruptedException{
        for (int n=1; n<13;n++){
            Stopwatch stopwatch = new Stopwatch();
            // TO BE TIMED/
            for (int i=0;i<n;i++)
                for (int j=1;j<i*i;j++)
                    if(j%i==0){
                        for (int k=0;k<j;k++)
                            Thread.sleep(1);
                    }
            ///
            System.out.println(stopwatch.elapsedTime());
        }
    }
}
