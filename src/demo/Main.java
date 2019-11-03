package demo;

public class Main{
    public static void main(String[] args) {
        Person liyang=new Person();
        Animals lucky=new Dog();
        liyang.feed(lucky);
        liyang.take(lucky);
        liyang.get();
        liyang.gohome(lucky);

    }
}
