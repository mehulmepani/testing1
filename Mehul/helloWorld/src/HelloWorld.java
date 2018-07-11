public class HelloWorld {

    public static void main(String[] args) {


        //String hello = "hello world";
        //  System.out.println(hello);
        method1();
        System.out.println(method2(4, 0, true));
        method3();
        method4();
        method5();
        blackjack(18,1);
        unique_sum(5,5,5);
        too_hot(75,true);
    }

    //print hello world
    static void method1() {
        String abc = "hello world";
        System.out.println(abc);
    }

    //returns value to method
    static int method2(int num1, int num2, boolean a) {

        if (a)
            return num1 + num2;
        else if (num1 == 0) {
            return num2;
        } else if (num2 == 0) {
            return num1;
        } else
            return num1 * num2;
    }
    // print 2 10 times

    static void method3() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
// print array

    static void method4() {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : number) {
            System.out.println("number: " + i);
        }
    }
//print array *10

    static void method5() {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : number) {


            System.out.println("number: " + i * 10);
        }
    }
//given 2 numbers, which value is closest to 21, if over print 0

    static int blackjack(int card1, int card2) {
        if (card1 <= 21 & card2 <= 21) {
            if (card1 > card2) {
                System.out.println(card1);
            } else if (card2 > card1) {
                System.out.println(card2);
            }
        } else if (card1 >= 22) {
            System.out.println(0);
        } else if (card2 >= 22) {
            System.out.println(0);
        }
        return card1 & card2;
    }
//given 3 values, if 3 are same, print 0 , if 2 are same, print different, if all different,add all up//

    static int unique_sum(int num1, int num2, int num3 ){
        if (num1 != num2 & num2!=num3 & num3!= num1){
            System.out.println(num1+num2+num3);
        }
        if(num1 == num2 & num2 !=num3){
            System.out.println(num3);
        }if(num2 == num3 & num3 !=num1){
            System.out.println(num1);
        }
        if(num1 == num3 &num3 != num2){
            System.out.println(num2);
        }
        if(num1==num2 & num2==num3 & num3==num1){
            System.out.println(0);
        }
        return num1 & num2 & num3;
    }

    //too hot
    static void too_hot(int temperature,boolean isSummer){
        if (temperature >=60 & temperature <=90 & !isSummer){
            System.out.println("true");
        }
        if (temperature >=60 & temperature <=100 & isSummer){
            System.out.println("false");}


    }
}









