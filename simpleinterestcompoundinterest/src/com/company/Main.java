package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double SI,CI,p,r,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal");
        p=sc.nextDouble();
        System.out.println("Enter rate");
        r=sc.nextDouble();
        System.out.println("Enter time");
        t=sc.nextDouble();
        SI=(p*t*r)/100;
        System.out.println("Simple Interest is : "+SI);
        CI=p*Math.pow(1+r/100,t)-p;
        System.out.println("Compound Interest is : "+CI);



    }
}
