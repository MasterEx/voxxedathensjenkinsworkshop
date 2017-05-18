package com.pntanasis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main.
 *
 * @author master
 */
@SpringBootApplication
public final class DemoApplication {

    /**
     * Demo app.
     */
    private DemoApplication() {
    }

    /**
     *
     * @param args the arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
