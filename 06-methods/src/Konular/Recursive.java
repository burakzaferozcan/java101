package Konular;

public class Recursive {
    //    metotların kendilerini kendi içlerinde çağrılmasına recursive metot denir
//    asıl kullanım alanı geriye değer dönen metotlardır
//    static void print(){
//        System.out.println("hello world");
//        print();
//    }
    static int f(int x) {
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }

    // recursive metoda parametreli örnek
    static int r(int n) {
        System.out.println("n = " + n);
        if (n == 1) {
            return 1;
        }
        int result = r(n - 1) + n;
        System.out.println("result = " + result);
        return result;
    }

    // recursive metoda parametreli örnek
    static int basamaklarToplami(int sayi) {
        if (sayi == 0) {
            return 0;
        } else
            return sayi % 10 + basamaklarToplami(sayi / 10);

    }

    static int as(int i) {
        if (i < 2) return 1;
        else return (i * as(i - 1));
    }

    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }

    public static void main(String[] args) {
//        print();
        System.out.println(f(3));
        System.out.println(r(3));
        System.out.println("Basamak toplami: " + basamaklarToplami(45612));
        System.out.println(as(3));
        recursiveMethod(4);
    }
}
