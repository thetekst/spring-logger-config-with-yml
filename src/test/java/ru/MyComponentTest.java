package ru;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author Dmitry Tkachenko
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@ActiveProfiles("production")
public class MyComponentTest {

    @Value("${qrsystem.mainurl}")
    private String mainURL;

    @Test
    public void testLoadingOfProperties() {
        System.out.println("mainurl = " + mainURL);
    }
}