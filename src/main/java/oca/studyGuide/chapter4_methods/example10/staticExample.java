package oca.studyGuide.chapter4_methods.example10;

public class staticExample {

    private static int one;
    private static final int two;
    private static final int three = 3;
//    private static final int four; // DOES NOT COMPILE

    static {
        one = 1;
        two = 2;
//        three = 3; // DOES NOT COMPILE
//        two = 4; // DOES NOT COMPILE
    }
}
