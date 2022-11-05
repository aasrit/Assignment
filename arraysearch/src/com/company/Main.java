package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int key=19;
        boolean find=false;
        for(int n:a)
        {
            if(n==key) {
                find=true;
                break;
            }
        }
        if(find) {
            System.out.println(key+ "is present");
        }
        else {
            System.out.println(key+ "is not present");
        }
    }
}
