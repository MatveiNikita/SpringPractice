package org.example.learnChapter4.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =
        { "org/example/learnChapter4/proxies, org/example/learnChapter4/repository, org/example/learnChapter4/service"})
public class ProjectConfig {
}
