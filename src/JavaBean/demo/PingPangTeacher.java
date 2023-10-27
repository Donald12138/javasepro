package JavaBean.demo;

public class PingPangTeacher extends Teacher implements English{

    public PingPangTeacher() {
    }

    public PingPangTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");
    }
}
