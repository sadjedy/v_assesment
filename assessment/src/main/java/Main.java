package main.java;

public class Main {
    public static int multipliesBy321(int n){
        if(n==0) {
            return 0;
        }
        else {
            return multipliesBy321(n-1) + 321;
        }
    }

    public static void main(String[] args) {
        int mult = multipliesBy321(4);
        System.out.println("mult = " + mult);
    }
}
