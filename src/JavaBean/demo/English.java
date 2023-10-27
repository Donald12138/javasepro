package JavaBean.demo;

public interface English {
    void speakEnglish();

    //只能接口名调用
    static void ss(){
        System.out.println("接口静态方法");
    }

    //默认方法不是抽象方法，不强制被重写。如果重写，去掉default关键字
    default void bb(){

    }

    private void log(){

    }

    private static void bin(){

    }
}
