package lesson_two;

public class lesson_two {

    public static void main (String[] args){
        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
        // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        System.out.print("Задание №1: ");
        int[] arrTaskOne = {1, 0, 1, 0, 1, 1, 0};
        replacement (arrTaskOne);
        for (int i = 0; i < arrTaskOne.length; i++ ){
            System.out.print(arrTaskOne[i] + " ");
        }
        System.out.println();

        //2 Задать пустой целочисленный массив размером 8.
        // Написать метод, который помощью цикла заполнит
        // его значениями 1 4 7 10 13 16 19 22;
        System.out.print("Задание №2: ");
        int[] arrTaskTwo = new int [8];
        fill(arrTaskTwo);
        for (int i = 0; i < arrTaskTwo.length; i++ ){
            System.out.print(arrTaskTwo[i] + " ");
        }
        System.out.println();

        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        // написать метод, принимающий на вход массив и
        // умножающий числа меньше 6 на 2;
        System.out.print("Задание №3: ");
        int[] arrTaskThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplication(arrTaskThree);
        for (int i = 0; i < arrTaskThree.length; i++ ){
            System.out.print(arrTaskThree[i] + " ");
        }
        System.out.println();

        //4 Задать одномерный массив.
        // Написать методы поиска в нём минимального и максимального элемента;
        System.out.println("Задание №4:");
        int[] arrTaskFour = {10, 11, -12, 4, 2, 15, 0, -1};
        System.out.println("Минимальное значение массива: " + searchMin(arrTaskFour));
        System.out.println("Максимальное значение массива: " + searchMax(arrTaskFour));

        //5 * Создать квадратный целочисленный массив
        // (количество строк и столбцов одинаковое),
        // заполнить его диагональные элементы единицами, используя цикл(ы);
        System.out.println("Задание №5:");
        int[][] arrTaskFive = new int[7][7];
        for (int i = 0; i < arrTaskFive.length; i ++){
            for(int j = 0; j < arrTaskFive.length; j++){
                if ((i == j) || (i + j == arrTaskFive.length -1)){
                    arrTaskFive[i][j] = 1;
                }else arrTaskFive [i][j] = 0;
            }
        }
        for (int i = 0; i < arrTaskFive.length; i ++) {
            for (int j = 0; j < arrTaskFive.length; j++) {
                System.out.print(arrTaskFive[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        //6 ** Написать метод, в который передается не пустой одномерный
        // целочисленный массив, метод должен вернуть true если в массиве есть место,
        // в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
        // checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true.
        // Абстрактная граница показана символами ||, эти символы в массив не входят.
        System.out.print("Задание №6: ");
        int[] arrTaskSex = {1,  0, 0, 0, 2, 0};
        System.out.println(balance(arrTaskSex));


        //7 *** Написать метод, которому на вход подаётся одномерный массив и
        // число n (может быть положительным, или отрицательным),
        // при этом метод должен циклически сместить все элементы массива на n позиций.
        System.out.print("Задание №7: ");
        int[] arrTaskSeven = {1,  5, 3, 4, 2, 11, 13, 20};
        shiftArr ( -1, arrTaskSeven);
        for (int i = 0; i < arrTaskSeven.length; i ++){
            System.out.print(arrTaskSeven[i] + " ");
        }

    }

    //Задание 1.
    private static void replacement ( int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
    }

    //Задание 2.
    private static void fill( int[] arr){
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++){
            arr[i] = arr[i - 1] + 3 ;
        }
    }

    //Задание 3.
    private static void multiplication ( int[] arr){
        for (int i = 0; i < arr.length; i++){
            if ( arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    //Задание 4.
    private static int searchMin(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    private static int searchMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    //Задание 6.
    private static boolean balance(int[] arr) {
        int left, right;
        for (int i = 0; i < arr.length; i++) {
            left = 0;
            right = 0;
            for (int j = 0; j < i; j++) {
                left += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                right += arr[j];
            }
            if (left == right) {
                return true;
            }
        }
        return false;
    }

    //задание 7.
    private static void shiftArr(int n, int[] arr){
        if (n > 0){
            for (int p = 0; p < n; p++){
                int place = arr[0];
                arr[0] = arr[arr.length - 1];
                for (int i = 1; i < arr.length - 1;  i++){
                    arr[arr.length - i] = arr[arr.length - 1 - i];
                }
                arr[1] = place;
            }
        } else if (n < 0){
            for (int p = 0; p > n; p--){
                int place = arr[arr.length - 1];
                arr[arr.length - 1] = arr[0];
                for (int i = 1; i < arr.length - 1;  i++){
                    arr[i - 1] = arr[i];
                }
                arr[arr.length - 2] = place;
            }
        }
    }
}