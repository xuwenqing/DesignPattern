package singleton;

/**
 * Created by OGC on 2016/4/12.
 */
public class PersonSingleton {
    private Person person;

    private  PersonSingleton() {

    }

    public Person getInstance() {
        if(person == null)
            person = new Person();
        return person;
    }
}
