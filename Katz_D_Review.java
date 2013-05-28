/*
 By: Dani Katz
 Date: 5/27/2013
 Decription: Review Assignment to show that different loops can have the same output
 */

import java.util.Scanner;
import java.io.*;
public class differentloops{
  public static void whileloop(String a){
    int x=0;
    while(a.length()>x){
      System.out.println(a + " From while loop" );
      x++;
    }//end while
      
      
  }//end of whileloop
  
  public static void forloop(String b){
    int i;
    for(i=0;i<b.length();i++){
      System.out.println(b + " From for loop");
    }//end of for
  }//end of forloop
  
  public static void dowhileloop(String c){
    int y=0;
   do{
      y++;
      System.out.println(c + " From Do while loop");
      }while(c.length()>y);
  }//end of dowhileloop
  
public static void main(String args[]){
  Scanner scanner = new Scanner( System.in );
  System.out.println("Please enter a word:");
  String input = scanner.nextLine();
  whileloop(input);
  forloop(input);
  dowhileloop(input);
  
}// end main

}// end differentloops
