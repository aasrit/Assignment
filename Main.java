package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for( int i=100;i<1000;i++) {
            int sum=0,r,temp;
            temp = i;
            while (temp != 0) {
                r = temp % 10;
                sum = sum + (r * r * r);
                temp = temp / 10;
            }
            if (sum == i)
                System.out.println(" " + i + " ");
        }


    }
}