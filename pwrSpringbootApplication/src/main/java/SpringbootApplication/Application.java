package SpringbootApplication;

import SpringbootExample.Holoman;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    //문제점: 이 Bean은 무시가 된다.
    //Conponent scan으로 먼저 등록을 하고 autoconfiguration으로 등록해서 덮어 씌우게 된다.
    //holoConfiguration에 @ConditionalOnMissBean
//    @Bean
//    public Holoman holoman(){
//        Holoman holoman = new Holoman();
//        holoman.setName("whiteship");
//        holoman.setHowLong(60);
//        return holoman;
//    }
}
