package com.test.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public static <U> void print(U[] list) {
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i]);
        }
        System.out.println();
    }
}
