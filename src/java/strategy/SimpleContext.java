package strategy;

import strategy.alogrithm.StrategyImpl1;
import strategy.alogrithm.StrategyImpl2;

/**
 * Created by OGC on 2016/4/12.
 */
public class SimpleContext extends Context {

    public SimpleContext() {
        setStrategy(new StrategyImpl1());
    }

    public void changeAlogrithm() {
        setStrategy(new StrategyImpl2());
    }

    public static void main(String[] args) {
        SimpleContext context = new SimpleContext();
        context.excuteAlogrithm();
        context.changeAlogrithm();
        context.excuteAlogrithm();
    }
}
