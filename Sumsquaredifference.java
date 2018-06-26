public class Sumsquaredif //n = 100 -> 25164150
{
    public int natural(int n){
        int x = 0;
        int y = 0;
        for(int i= 0; i<=n; i++){
            x = x+i;
        }
        x = x*x;
        for(int i= 0; i<=n; i++){
            y += i*i;
        }
        return x-y;
    }
}
