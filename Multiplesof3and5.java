public class Multiplesof3and5
{
    public int Multi35(int n){
        int x = 0;
        for(int i = n-1; i>0; i--){
            if(i%3 == 0 || i%5 == 0){
             x += i;
            }
        }
        return x;
    }
}
