package ru;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.Properties;

/**
 * @author Dmitry Tkachenko
 *         18.07.17
 */
@Configuration
public class MyConf extends PropertySourcesPlaceholderConfigurer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyConf.class);

    public MyConf() {
        MutablePropertySources propertySources = new MutablePropertySources();
        setIgnoreResourceNotFound(true);
        setIgnoreUnresolvablePlaceholders(true);

        Properties props = new Properties();
        props.setProperty("data.from.db", "0 0/5 * * * *");
        propertySources.addLast(new PropertiesPropertySource("mylocation", props));

        setPropertySources(propertySources);
    }
}
