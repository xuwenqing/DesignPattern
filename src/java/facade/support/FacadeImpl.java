package facade.support;

import facade.Facade;
import facade.SystemA;
import facade.SystemB;
import facade.SystemC;

/**
 * Created by OGC on 2016/4/12.
 */
public class FacadeImpl implements Facade {
    private SystemA systema;
    private SystemB systemb;
    private SystemC systemc;
    public FacadeImpl(SystemA systema, SystemB systemb, SystemC systemc) {
        this.systema = systema;
        this.systemb = systemb;
        this.systemc = systemc;
    }

    public void system() {
        systema.systema();
        systemb.systemb();
        systemc.systemc();
    }
}
