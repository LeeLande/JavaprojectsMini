public class gTmalkTvonNistN
{
    public void Hey(int d){ //gibt für die Zahlen von eins bis n wieder ob gt mal kt n ist
        int z = 0;
        for(float n = d; n>1; n--){
            int x = 0; 
            int y = 0; 
            for(int i = 2; i<n-1;i++){
                if (n%i==0){
                    if (y == 0){
                        y = i;
                    }
                    else {
                        if (x<i){
                            x = i;
                        }
                    }
                }
            }
            if (x * y == n){
                System.out.println(n);
                z += 1;
            }
        }
        System.out.println(z+" von "+d+" sind Hey");
    } 
    
    public boolean Hefect(int n){ //prüft ob gt mal kt n ist
        int x = 0; 
        int y = 0; 
        for(int i = 2; i<n-1;i++){
                if (n%i==0){
                    if (y == 0){
                        y = i;
                    }
                    else {
                        if (x<i){
                            x = i;
                        }
                    }
                }
        }
        if (x * y== n){
                return true;
        }
        else{
            return false;
        }
    }
}
