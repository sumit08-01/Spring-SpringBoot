import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Spring3AnnoEg {

	@Bean
	public Hello helloCreator() {
		return new Hello();
	}
}
