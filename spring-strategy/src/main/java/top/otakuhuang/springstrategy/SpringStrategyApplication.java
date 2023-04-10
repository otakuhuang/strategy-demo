package top.otakuhuang.springstrategy;

import java.io.File;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import top.otakuhuang.springstrategy.strategy.ImageStrategy;
import top.otakuhuang.springstrategy.strategy.ImageStrategyFactory;

@SpringBootApplication
public class SpringStrategyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringStrategyApplication.class, args);
	}

	@Value("${option}")
	private String option;

	@Autowired
	private ImageStrategyFactory imageStrategyFactory;

	@Override
	public void run(String... args) throws Exception {
		String strategyName = String.format("%sImageStrategyImpl", option);
		imageStrategyFactory.getImageStrategy(strategyName).upload(new File(""));
	}
}
