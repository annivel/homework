package com.company;

public class Main {


    public static void main(String[] args) {
        // 1 task Приветствовать любого пользователя при вводе его имени через командную строку.

        // /*System.out.println("Hello, "+ args[0]  );}*/


        // 2 task Отобразить в окне консоли аргументы командной строки в обратном порядке.
            /* for (int i = args.length - 1; i >= 0; i--) { // c переходом вариант 1
            System.out.println(args[i]+" ");
            }*/

         /* //  3 task Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
            for (String s : args[0].split("")) {
            System.out.println(s);
           }*/

        //
        /*for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]); // переход на следующую строку
        }*/

        /*for (int i = 0; i < args.length ; i++) { // Без перехода
            System.out.print(args[i] + " ");
            }*/

        // 4 task Ввести пароль из командной строки и сравнить его со строкой-образцом.

     /*  String pass = "qwerty";
        System.out.println(pass.equals(args[0]));
        }*/

        // 6 task
       /* int a = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) { // Вывод чётных чисел
            if (i % 2 == 0)
               System.out.println(i);
        }
    }*/

        /*int a = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            if (i % 2 != 0)                       // Вывод нечётных чисел
                System.out.println(args[i]);
        }
}*/
// 7 task
     /*   int max = Integer.parseInt(args[0]);      // наибольшее число
        for (int i = 0; i < args.length; i++) {
            if (max < Integer.parseInt(args[i])) {
                max = Integer.parseInt(args[i]);
            }
        }
        System.out.println(max);
        }
*/
        // наименьшее число
       /* int min = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            if (min > Integer.parseInt(args[i])) {
                min = Integer.parseInt(args[i]);
            }
        }
        System.out.println(min);
    }
*/

// 8 task Числа, которые делятся на 3 или на 9.
        /*int a = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) % 3 == 0 || Integer.parseInt(args[i])% 9 == 0) {
                System.out.println(args[i] + " ");
            }
        }*/

//Числа, которые делятся на 5 и на 7.

       /* int b = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) % 5 == 0 && Integer.parseInt(args[i]) % 7 == 0) {
                System.out.println(args[i] + " ");
            }
        }*/
/*  Трёхзначные числа в десятичной записи

        for (int i = 0; i < args.length; i++) {
            String number = args[i];
            if (number.charAt(0) != number.charAt(1)&& number.charAt(0) != number.charAt(2)&& number.charAt(2) != number.charAt(1)) {
                System.out.println(args[i]);
            }
        }
*/
// Cчастливые числа
       /* for (int i = 0; i < args.length; i++) {
            String num = args[i];
            if (num.length() == 6 && num.charAt(0) + num.charAt(1) + num.charAt(2) == num.charAt(3) + num.charAt(4) + num.charAt(5))
                System.out.println(args[i]);

        }

*/
       /* {
            for (int i = 0; i < 1; i++) {
                int s = 0;
                int a = 1;
                {
                    int sum = Integer.parseInt(args[i]);
                    s = s + (Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2]) + Integer.parseInt(args[3]));
                    a = a * (Integer.parseInt(args[0]) * Integer.parseInt(args[1]) * Integer.parseInt(args[2]) * Integer.parseInt(args[3]));
                    System.out.println("Sum =" + s);
                    System.out.println("Mulipl =" + a);
                }
            }
        }
    }
}
*/
    }
}





