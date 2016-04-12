package facade;

import facade.support.FacadeImpl;
import facade.support.SystemAImpl;
import facade.support.SystemBImpl;
import facade.support.SystemCImpl;

/**
 * Created by OGC on 2016/4/12.
 */
public class Client {
    private Facade facade;

    public Client(Facade facade) {
        this.facade = facade;
    }

    public Facade getFacade() {
        return this.facade;
    }

    public static void main(String[] args) {
        Facade facade = new FacadeImpl(new SystemAImpl(),new SystemBImpl(),new SystemCImpl());
        Client client = new Client(facade);
        client.getFacade().system();
    }

}
