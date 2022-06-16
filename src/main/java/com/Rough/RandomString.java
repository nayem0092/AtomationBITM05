package com.Rough;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        generate_Random_String();
        //System.out.println(generate_Random_String());
        String UniqueEmail= generate_Random_String()+ "@gamil.com";
        System.out.println(UniqueEmail);
    }

  public static String generate_Random_String(){
      String SALTCHAR ="abcefghABCDE12345";
      StringBuilder rstr= new StringBuilder();
      Random rnd= new Random();

      while (rstr.length()<10){
          int index=(int) (rnd.nextFloat()*SALTCHAR.length());
          rstr.append(SALTCHAR.charAt(index));
      }
      String newString= rstr.toString();
      return newString;
  }
}
