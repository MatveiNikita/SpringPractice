package org.example.learnChapter4.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =
        { "org/example/proxies, org/example/repositories, org/example/servece"})
public class ProjectConfig {
}