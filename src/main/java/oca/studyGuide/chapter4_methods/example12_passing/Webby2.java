package oca.studyGuide.chapter4_methods.example12_passing;

public class Webby2 {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name); // Webby
    }
    public static void speak(StringBuilder s) {
        s.append("Webby");
    }

}
