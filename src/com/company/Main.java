package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        firstMethod(17, -22);
        firstMethod(21, -19);
        firstMethod(7, 1);
        firstMethod(60, -6);
        firstMethod(44, 29);
        firstMethod(generateRandomAge(), 12);


    }
    public static int firstMethod(int age, int temperature){
        if ((20<age && age<45) && (-20<temperature && temperature<30)){
            System.out.println("Можно идти гулять");
        }
        else if ((age<20) && (0<temperature && temperature<28)){
            System.out.println("Можно идти гулять");
        }
        else if ((age>45) && (-10<temperature && temperature<25)){
            System.out.println("Можно идти гулять");
        }else {
            System.out.println("Оставайтесь дома");
        }
        return age;
    }

    // 2 task
    public static int generateRandomAge(){
        Random random =new Random();
        int x= random.nextInt(100)+1;
        System.out.println("random integer is "+x);
        return x;
    }
}
