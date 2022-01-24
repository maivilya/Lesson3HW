
public class Main {
    public static void main(String[] args) {
        Zamena0Na1();
        ZapolnenueMassiva();
        ZamenaChisel();
        MatrixDiagonalOne();
        AcceptionTwoArg(3,4);
    }
    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
    private static void Zamena0Na1() {
        System.out.print("Первое задание: ");
        int [] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 ){
                arr[i] = 1;
            }else arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
    private static void ZapolnenueMassiva(){
        System.out.print("Второе задание: ");
        int[] arr = new int[100];
        for(int i = 1; i < arr.length; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    private static void ZamenaChisel(){
        System.out.print("Третье задание: ");
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    System.out.println();
}
    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void MatrixDiagonalOne() {
        System.out.println("Четвертое задание: " );
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                if (i == j || i == x - 1) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    private static void AcceptionTwoArg(int len, int initialValue){
        System.out.print("Пятое задание: ");
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            System.out.print(initialValue);
        }
    }
}


