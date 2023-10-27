package JavaBean.demo;

import static JavaBean.demo.English.ss;

public class Test {
    public static void main(String[] args) {
        PingPangPlayer p = new PingPangPlayer("马龙", 37);
        System.out.println(p.getName() + p.getAge());
        p.study();
        p.speakEnglish();



        new English(){

            @Override
            public void speakEnglish() {

            }

            @Override
            public void bb() {
                English.super.bb();
            }
        };
    }
}
