public class Aufgebe3undfürschnelle
{     public boolean istPrimzahl2(int n){
        double y = Math.sqrt(n);
        double x = 0;
        int h = n/2;
        for(double i = y; i>1; i-=1){
            if(n%i==0){
                x = i;
            }
        }
        if(x>0){
            return false;
        }
        else{
            return true;
        } 
    }
