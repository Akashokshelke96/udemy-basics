package udemy2.java;

public class Udemy2Learning {
    public static void main(String[] args) {
        System.out.println("hello");
        int[][] value = new int[][]{{12, 23, 45}, {234, 34, 45}, {23, 45, 76}};
        for (int i = 0 ; i<value.length; i++ ){
            for (int j= 0; j<value[i].length; j++){
                System.out.print(value[i][j] + " ");

            }
            System.out.println();
            System.out.println("i am now learning java");


        }
    }
}


