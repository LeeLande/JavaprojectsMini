Fibonacci
{
public int fibonacci(int n){
        int s;
        int a = 0;
        int b = 1;
        if(n<3){
            return 1;
        }
        else{
            for(int i = 2; i<=n; i++){
                s = a+b;
                a = b;
                b = s;
            }
            return b;
        }
    }
