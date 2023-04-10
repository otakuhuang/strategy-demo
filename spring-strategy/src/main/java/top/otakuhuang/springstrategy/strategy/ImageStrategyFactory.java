package top.otakuhuang.springstrategy.strategy;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import top.otakuhuang.springstrategy.strategy.impl.AImageStrategyImpl;
import top.otakuhuang.springstrategy.strategy.impl.BImageStrategyImpl;
import top.otakuhuang.springstrategy.strategy.impl.CImageStrategyImpl;

// @Component
// public class ImageStrategyFactory implements InitializingBean {

//     private Map<String, ImageStrategy> map = new ConcurrentHashMap<>();

//     @Autowired
//     private AImageStrategyImpl aImageStrategyImpl;

//     @Autowired
//     private BImageStrategyImpl bImageStrategyImpl;

//     @Autowired
//     private CImageStrategyImpl cImageStrategyImpl;
    
//     @Override
//     public void afterPropertiesSet() throws Exception {
//         map.put("A", aImageStrategyImpl);
//         map.put("B", bImageStrategyImpl);
//         map.put("C", cImageStrategyImpl);
//     }

//     public ImageStrategy getImageStrategy(String option) {
//         return Optional.ofNullable(map.get(option)).orElseThrow(() -> new IllegalArgumentException("未找到策略"));
//     }
// }

@Component
public class ImageStrategyFactory {

    @Autowired
    private Map<String, ImageStrategy> map = new ConcurrentHashMap<>();
    
    public ImageStrategy getImageStrategy(String option) {
        return Optional.ofNullable(map.get(option)).orElseThrow(() -> new IllegalArgumentException("未找到策略"));
    }
}
