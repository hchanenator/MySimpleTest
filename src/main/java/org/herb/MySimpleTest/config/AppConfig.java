/**
 * 
 */
package org.herb.MySimpleTest.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author herb
 *
 */
@Configuration
@ComponentScan(basePackages="org.herb.MySipleTest")
@EnableAutoConfiguration(exclude={JpaRepositoriesAutoConfiguration.class})
@EnableJpaRepositories(basePackages={"org.herb.MySimpleTest", "org.herb.MySimpleTest.domain", "org.herb.MySimpleTest.repository"})
public class AppConfig {

}
