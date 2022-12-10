package studyGuide.chapter5.example9;

public class Eagle extends Bird {

    // OVERLOADED - the argument must be
    public int fly(int height) {
        System.out.println("Bird is flying at "+height+" meters");
        return height;
    }
    // OVERRIDING
    public void eat(int food) {
        System.out.println("Bird is eating "+food+" units of food");
    }
}
