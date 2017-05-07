package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by koyo on 2017/05/08.
 */
@Configuration
public class AppContext {

    @Bean
    public MessagePrinter messagePrinter() {
        return new MessagePrinter(messageService());
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public MessageService messageService() {
        return new MessageServiceImpl();
    }
}
