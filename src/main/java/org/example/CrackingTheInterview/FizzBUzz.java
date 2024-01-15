package org.example.CrackingTheInterview;

public class FizzBUzz {

    public static void fizzBuzz(){
        String result;
        int n =20;
        for(int i=1;i<=n;i++){
            result = "";
            if(i%3==0){
                result+="Fizz";
            }
            if(i%5==0){
                result+="Buzz";
            }
            if(result.equals("")){
                result+=i;
            }
            System.out.println(result);
        }
    }
    public static void fizzBuzz3(int n){
        for (int i =1;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            if(i%3==0){
                sb.append("Fizz");
            }
            if(i%5==0){
                sb.append("Buzz");
            }
            if(sb.isEmpty()){
                sb.append(Integer.toString(i));
            }
            System.out.println(sb);
        }
    }
    public static void fizzBuzz2(int n){
       for(int i=1;i<=n;i++){
           if(i%3==0 && i%5==0){
               System.out.println("FizzBuzz");
           } else if (i%3==0) {
               System.out.println("Fizz");
           } else if (i%5==0) {
               System.out.println("Buzz");
           } else {
               System.out.println(i);
           }
       }
    }


    public static void main(String[] args) {

//        fizzBuzz2(20);
        fizzBuzz3(30);
    }
}
