package com.package2;

public class OtherPackageClass {
    //function without para and with return type
   static void  add(){
       System.out.println("I am a function without para and without return type ");

    }
    static void  add2(int a){
        System.out.println("I am a function with single para and without return type ");
    }
    static void  add2(int a,int b){
        System.out.println("I am a function with double para and without return type ");
    }
    static int   add3( ){
        System.out.println("I am a function without para and with return type ");
        return 10;
    }
    static String  add4(){
        System.out.println("I am a function without para and without return type ");
        return "YourName";
    }
    public static void main(String args[]){

   int a=add3();
        System.out.println("a value is "+a);


    }
}
