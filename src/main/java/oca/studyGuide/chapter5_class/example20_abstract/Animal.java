package oca.studyGuide.chapter5_class.example20_abstract;

public abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}
