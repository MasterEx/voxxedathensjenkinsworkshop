package com.pntanasis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main.
 *
 * @author master
 */
@SpringBootApplication
public class DemoApplication {

    /**
     * Member to supress checsktyle warnings.
     */
    private int a = 1;

    /**
     *
     * @param args the arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
