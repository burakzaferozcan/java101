package Konular;

public class ForeachKullanimi {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        // foreach kullanımı :
        for (int i : list) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);

        String[] cars = {"BMW", "Mercedes", "Audi"};
        for (String car : cars) {
            System.out.println(car);
        }

        // çok boyutlu dizilerde iç içe foreach
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        for (int[] sutun : matris) {
            System.out.println();
            for (int satir : sutun) {
                System.out.print(satir + " ");
            }
        }
        System.out.println("\n------------------------------");
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};
        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
}
