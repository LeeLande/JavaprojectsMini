public class Aufgebe3undfürschnelle
{
    public boolean istPerfect(double n){
        int x = 0;
        for(int i = 0; i<n;i++){
            if(n % i == 0){
                x+=i;
            }
            else{
                
            }
        }
        if(x == n){
            return true;
        }
        else{
            return false;
        }
    }
}
