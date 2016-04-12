package strategy;

import strategy.alogrithm.Strategy;

/**
 * Created by OGC on 2016/4/12.
 */
public abstract class Context {
    protected Strategy strategy;

    public void excuteAlogrithm() {
        strategy.alogrithm();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
