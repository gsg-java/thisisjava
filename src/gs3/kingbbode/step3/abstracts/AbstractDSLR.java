package gs3.kingbbode.step3.abstracts;

/**
 * Created by YG-MAC on 2017. 7. 3..
 */
public abstract class AbstractDSLR extends CameraImpl {

    public AbstractDSLR(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void snapshot() {
        System.out.println("예열..");
        settingSutterSpeed();
        focus();
        System.out.println("찰칵");
    }
    protected abstract void settingSutterSpeed();
    protected abstract void focus();
}
