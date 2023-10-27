package cn.tsy.demo;

public class Test {
    public static void main(String[] args) {
        //创建对象

        Person person = new Person("老王", 30);
        Animal animal = new Dog(2, "黑");
        person.keepPet(animal, "骨头");
    }
}
