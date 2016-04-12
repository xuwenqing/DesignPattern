package template;

/**
 * Created by OGC on 2016/4/12.
 */
public abstract class Template {

    public void excute() {
        step1();
        step2();
        step3();
    }

    protected void step1() {
        System.out.println("step1");
    }

    protected void step2() {
        System.out.println("step2");
    }

    protected abstract void step3();



}
