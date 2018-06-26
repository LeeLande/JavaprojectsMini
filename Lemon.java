public class Lemon
{
    char[] translated;
    char[] now;
    public String rose(String remb){
        int length = remb.length();
        char[] now = remb.toCharArray();
        char[] translated = new char[length];
        int y = length-1;
        int x = 0;
        if(length%2==0){
            for(int i = 0; i<length; i++){
                if(i%2==0){
                    translated[i] = now[y];
                    y--;
                }
                else{
                    translated[i] = now[x];
                    x++;
                }
            }
        }
        else{
            x++;
            for(int i = 0; i<length; i++){ 
                if(i==0){
                    translated[i] = now[i];
                }
                else{
                    if(i%2==0){
                        if(i == length-1){
                            int ze = remb.length();
                            ze = length-1;
                            ze=ze/2;
                            translated[i] = now[ze];
                        }
                        else{
                            translated[i] = now[x];
                            x++;
                        }
                    }
                    else{
                            translated[i] = now[y];
                            y--;
                        }
                }
            }
        }
        String rot = new String(translated);
        return rot;
    }
}
