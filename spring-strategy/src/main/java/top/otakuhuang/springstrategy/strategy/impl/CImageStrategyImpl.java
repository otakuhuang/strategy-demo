package top.otakuhuang.springstrategy.strategy.impl;

import java.io.File;

import org.springframework.stereotype.Component;

import top.otakuhuang.springstrategy.strategy.ImageStrategy;

@Component
public class CImageStrategyImpl implements ImageStrategy {

    @Override
    public void upload(File file) {
        // do something
        System.out.println("调用 " + this.getClass().getName() 
        + " 的 " 
        + Thread.currentThread().getStackTrace()[1].getMethodName()
        + " 方法");
    }
    
}
