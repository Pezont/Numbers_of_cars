package com.company;

//import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        int n;
//        String d = "1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
//        //char c = d.charAt( n = (int) (Math.random()+35));
//
//        for (int p =0; p<10; p++){for(int i =0; i<12; i++){
//                char c = d.charAt( n = (int) (1+Math.random()*35));
//                System.out.print(c);
//                //
//            }System.out.println();}


        

        int XXxx;
        int xxXX;
        int sum=0;
       for (int i = 1000; i < 9999; i++) {
            XXxx = i / 100;
            xxXX = i % 100;
            if (XXxx+xxXX==100) {
                sum++;
                System.out.println(i);
            }
        }
// функция возвращает количество счастливых номеров в одной буквенной серии


//        System.out.println(sum);
//       for(int n =0; n<45;n++){
//           if(n%2==0)
//       }
    }
}
