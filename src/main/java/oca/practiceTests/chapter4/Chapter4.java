package oca.practiceTests.chapter4;

public class Chapter4 {

    public static void main(String[] args) {
        int k = 0;
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
            while (i > 3) i -= 3;
            k += 1;
        }
        System.out.println(k);
    }
}
