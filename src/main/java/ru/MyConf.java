package ru;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;

import javax.annotation.PostConstruct;
import java.util.Properties;

/**
 * @author Dmitry Tkachenko
 *         18.07.17
 */
@Configuration
public class MyConf {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyConf.class);

    @Autowired
    private ConfigurableEnvironment env;

    @PostConstruct
    public void init() {
        MutablePropertySources sources = env.getPropertySources();
        Properties props = new Properties();
        props.setProperty("data.from.db", "0 0/5 * * * *");
        sources.addLast(new PropertiesPropertySource("*", props));
    }

}
