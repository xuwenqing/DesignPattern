package adapter;

/**
 * Created by OGC on 2016/4/12.
 */
public class Adapter implements Target {
    private OldTarget oldTarget;

    public Adapter(OldTarget oldTarget) {
        this.oldTarget = oldTarget;
    }

    public void request() {
        oldTarget.oldRequest();
    }
}
