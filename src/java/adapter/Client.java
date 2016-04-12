package adapter;

import adapter.support.OldTargetImpl;

/**
 * Created by OGC on 2016/4/12.
 */
public class Client {

    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void use() {
        target.request();
    }

    public static void main(String[] args) {
        Adapter adpter = new Adapter(new OldTargetImpl());
        Client client = new Client(adpter);
        client.use();
    }
}
