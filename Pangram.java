//problem, link:http:https://codeforces.com/problemset/problem/520/A
// Name        : Anton_and_Letters.java
// Author      : mohamed fayad
// Version     : java 8
// Copyright   : use it under your responsibility
// Description : Hello World in java
//status:Accepted

import static java.lang.Math.*;
import java.util.Arrays;
import static java.util.Arrays.sort;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main1 {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      Set<Character> c = new HashSet<Character>();
int n=in.nextInt();
long arr[]=new long[n];
//int frq []=new int[n];
String x=in.next().toLowerCase();
for(int i=0;i<x.length();i++){
    c.add(x.charAt(i));
}
        if (c.size()==26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }    }
