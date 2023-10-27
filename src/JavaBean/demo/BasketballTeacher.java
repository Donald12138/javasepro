package JavaBean.demo;

public class BasketballTeacher extends Teacher{
    public BasketballTeacher() {
    }

    public BasketballTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教打篮球");
    }
}
