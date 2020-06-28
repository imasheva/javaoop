package com.java.courses.maven;

public class Conditions {


    public static void main(String[] args) {

        writeName("Anna");  //1

        int[] arr = {1, 2, 3, 4, 5}; //2
        sumOfFirstAndLastElementOfArray(arr);

        printJavaFiveTimes("Java", 5);  //3

        int[] array = {5, 2, 3, 4, 5};  //4
        checkArraysElements(array);

        methodToCompareSumOfArguments(2, 4, 5, 7);  //5

        printField(3); //6.

        int[] arrays = {55, 2, 3, 4, 15}; //7
        sumOfArray(arrays);

        int[] arrEl = {11, 15, 19, 23, 27, 31, 35}; //8
        printElementsOfArray(arrEl);


        printMaxAndMinNumbers(10, 2); //9
        //

    }

    //   1. Напишите метод, которому передается имя, метод должен напечатать в консоль сообщение «Привет, имя, как твои дела?»;
    public static void writeName(String name) {
        String n = name;
        System.out.println("Privet, " + name + ", kak tvoi dela?");
    }

    /*    2. Напишите метод, которому в качестве аргумента передается целочисленный массив,
             метод должен вернуть сумму первого и последнего элемента массива;*/

    public static void sumOfFirstAndLastElementOfArray(int[] inArray) {
        int sum = inArray[0] + inArray[4];
        System.out.println(sum);

    }

        /*3.   Напишите метод, который печатает указанное слово, указанное количество раз,
       в одну строку через пробел. Например, print(«Java», 5), должен напечатать «Java Java Java Java Java »;*/

    public static void printJavaFiveTimes(String str, int numTimes) {

        for (int counter = 0; counter < numTimes; counter++) {
            System.out.print(str + " ");
        }
        System.out.println(numTimes);
    }

    //4. Напишите метод, проверяющий, что последний элемент массива больше или равен первому;

    public static void checkArraysElements(int[] num) {

        if (num[0] == num[4] || num[0] < num[4]) {
            System.out.println("Poslednii element bolshe ili raven pervomu");
        } else {
            System.out.println("Ne raven");
        }
    }

    /*5. Напишите метод, принимающий в качестве аргументов четыре числа a, b, c, d, метод должен
     проверить что сумма a и b равна сумме аргументов c и d; */

    public static void methodToCompareSumOfArguments(int a, int b, int c, int d) {

        int sum1 = a + b;
        int sum2 = c + d;

        if (sum1 == sum2) {
            System.out.println("Summa of A & B ravno summe of C & D");
        } else {
            System.out.println("Ne ravny summy");
        }

    }

    /*6. Напишите метод, на вход которого подается число n, метод должен распечатать таблицу из * соответствующего размера.
    Например, printField(3) должен вывести;
    * * *
    * * *
    * * *
    */

    public static void printField(int numTimes) {
        for (int counter = 0; counter < numTimes; counter++) {
            System.out.println("* * *" + " ");
        }
    }

    //7. Напишите метод, которому в качества аргумента передается массив, метод должен посчитать и вернуть сумму элементов этого массива;

    public static void sumOfArray(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i]; //sum = sum + myArray[i]
        }
        System.out.println("Summa elementov massiva: " + sum);
    }

//8. Напишите метод, который с помощью цикла выводит в консоль числа 11 15 19 23 27 31 35;

    public static void printElementsOfArray(int[] arrEl) {

        for (int i = 0; i < arrEl.length; i++) {
            System.out.print(arrEl[i] + " ");
        }

        //2i metod - ?
        for (int i = 11; i<=35; i+=4){

            System.out.print(i +" ");
        }

    }

    /*9. Напишите метод, которому в качестве аргументов передается два числа max и min,
    метод должен отпечатать в консоль эти числа от max до min с шагом 1. (считаем что max всегда больше min)*/

    private static void printMaxAndMinNumbers(int max, int min) {

        for (int i = min; i <= max; i++){
           if (i<max){
               System.out.println(max + " ");
           }else{
               System.out.println(min);
           }
            max-=1;
        }

    }



}
