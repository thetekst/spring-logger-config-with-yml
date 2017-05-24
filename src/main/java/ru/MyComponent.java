package ru;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Dmitry Tkachenko
 */
@ConfigurationProperties(prefix = "prefix")
@Component
@Getter
@Setter
public class MyComponent {

    private String stringProp1;
    private String stringProp2;
}
