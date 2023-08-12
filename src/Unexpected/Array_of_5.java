package Unexpected;


public class Array_of_5 {
    public static void main(String[] args) {
       int[] joy = new int [10];
       for (int praise = 1; praise < joy.length; praise++){
           if(praise % 2 == 0){
               int even = joy[praise] + praise;
               System.out.print(even+" ");
           }
       }







    }
}