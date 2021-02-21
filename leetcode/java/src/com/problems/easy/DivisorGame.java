package com.problems.easy;

public class DivisorGame {
    private boolean divisorGame(int N) {
        boolean alice = false;
        while(N > 1){
            for(int i = 1; i < N ; i++){
                if(N%i == 0){
                    N = N - i;
                    if(alice)
                        alice = false;
                    else
                        alice = true;
                    break;
                }
            }
        }
        System.out.println(5%4);
        return alice;
    }

    public static void main(String[] args) {
        DivisorGame obj = new DivisorGame();
        System.out.println(obj.divisorGame(3)); //  true
    }

}
