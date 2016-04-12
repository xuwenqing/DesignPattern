package decorator;

/**
 * Created by OGC on 2016/4/12.
 */
public class ConcreateComponent extends Component {
    @Override
    public void operation() {
        System.out.println("ConcreateComponent operation");
    }
}
