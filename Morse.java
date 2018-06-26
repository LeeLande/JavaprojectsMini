public class Morse
{   char[] translated;
    char[] now;
    public String balk(String hi){
        char[] now = hi.toCharArray();
        int length = hi.length();
        char[] translated = new char[length];
        for(int i= 0;i<length; i++){
            if(now[i] == ' '){
                translated[i] = ' ';
            }
            else{
                if(Character.isLowerCase(now[i])==true){
                    translated[i] = '.';
                }
                else{
                    if(Character.isUpperCase(now[i])==true){
                        translated[i] = '-';
                    }
                    else{
                        translated[i] = now[i];
                    }
                }
            }
         }
        String rot = new String(translated);
        return rot;
    }
}
