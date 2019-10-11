package indi.com.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;


@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

    /**
     * 开启驼峰命名
     */
//    public ConfigurationCustomizer configurationCustomizer(){
//        return new ConfigurationCustomizer(){
//            @Override
//            public void customize(Configuration configuration) {
//                configuration.setMapUnderscoreToCamelCase(true);
//            }
//        };
//    }
}
