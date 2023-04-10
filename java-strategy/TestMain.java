import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TestMain {

    public static void main(String[] args) {
        // 要调用的策略
        String option = "A";
        // 调用方法
        StrategyFactory.getImageStrategy(option).upload(new File(""));
    }
}
