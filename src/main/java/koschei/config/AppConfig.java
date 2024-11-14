package koschei.config;

import koschei.models.Deth8;
import koschei.models.Duck5;
import koschei.models.Egg6;
import koschei.models.Island2;
import koschei.models.Needle7;
import koschei.models.Rabbit4;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
//
//    @Bean
//    public static Wood3 getWood(Rabbit4 rabbit4) {
//        return new Wood3(rabbit4);
//    }
//
//    @Bean
//    public static Rabbit4 getRabbit4(Duck5 duck5) {
//        return new Rabbit4(duck5);
//    }
//
//    @Bean
//    public static Duck5 getDuck5(Egg6 egg6) {
//        return new Duck5(egg6);
//    }
//
//    @Bean
//    public static Egg6 getEgg6(Needle7 needle7) {
//        return new Egg6(needle7);
//    }
//    @Bean
//    public static Needle7 getNeedle7(Deth8 deth8) {
//        return new Needle7(deth8);
//    }
}
