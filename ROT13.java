public class Rot13
{ //funktioniert nur ohne Satzzeichen, groß und kleinschreibung geht,wird aber nur zu kleinschreibung gemacht
    char[] translated; //Leerzeichen funktionieren auch
    String ab = "abcdefghijklmnopjrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    String abc = String.format("%0" + 1000 + "d", 0).replace("0",ab);
    public String ROT13(String input){ // Beispiel: Jul qvq gur puvpxra pebff gur ebnq 
        input = input.toLowerCase();       // Beispiel2: Gb trg gb gur bgure fvqr
        char[] sentence = input.toCharArray();
        char[] ABC = abc.toCharArray();
        int length = input.length();
        char[] translated = new char[length];
        for(int i = 0; i<length;i++){
            int y = 0;
            int h = 0;
            if(sentence[i] == ' '){
                translated[i] = ' ';
            }
            else {
                while(y==0){
                    if (sentence[i] == ABC[h]){
                        y +=1;
                    }
                    else{
                        h += 1;
                    }
                }
                translated[i] = ABC[h+13];
            }
        }
        String rot13string = new String(translated);
        return rot13string;
    }
}
