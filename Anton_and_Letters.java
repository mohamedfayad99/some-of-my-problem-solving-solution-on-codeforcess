//problem, link:http://codeforces.com/contest/443/problem/A
// Name        : Anton_and_Letters.java
// Author      : mohamed fayad
// Version     :
// Copyright   : use it under your responsibility
// Description :solve by java
//language: chosse java language in submit code
//status:Accepted
//***************************code:
package main1; //dont put this line in your submition
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
      String []arr=new String[1000];
      int x=0;
      for(int i=0;i<1000;i++){
          arr[i]=in.next();
          x++;
          if(arr[i].contains("}")){
              break;}
      }
boolean t=true;
for(int i=0;i<x;i++){
    for(int j=0; j< arr[i].length() ;j++){
        if(arr[i].charAt(j)=='{' ||arr[i].charAt(j)=='}' ||arr[i].charAt(j)==',' ||arr[i].charAt(j)==' '){
            continue;
        }
        else{
              c.add(arr[i].charAt(j));
               if(arr[i].charAt(j)=='}'){
                  t=false;
               } 
    }
  }
if(t==false)
        break;}
        System.out.println(c.size());


    }    }
