package org.herb.MySimpleTest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
//@SpringBootApplication
@Configuration
@ComponentScan(basePackages="org.herb.MySipleTest")
@EnableAutoConfiguration(exclude={JpaRepositoriesAutoConfiguration.class})
@EnableJpaRepositories
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
