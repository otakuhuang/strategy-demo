import java.io.File;

public class CImageStrategyImpl implements ImageStrategy {

    @Override
    public void upload(File file) {
        // do something
        System.out.println("调用了 " + this.getClass().getName() 
        + " 的 " + Thread.currentThread().getStackTrace()[1].getMethodName() 
        + " 方法");
    }
}
