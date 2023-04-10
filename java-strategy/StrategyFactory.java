import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StrategyFactory {
    
    private static Map<String, ImageStrategy> map = new HashMap<>();

    static {
        map.put("A", new AImageStrategyImpl());
        map.put("B", new BImageStrategyImpl());
        map.put("C", new CImageStrategyImpl());
    }

    public static ImageStrategy getImageStrategy(String option) {
        return Optional.ofNullable(map.get(option)).orElseThrow(() -> new IllegalArgumentException("未找到对应的策略"));
    }
}
