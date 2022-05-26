import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleTest {
    //this is a sample test. Remember to rename your test class.
    //This is JUnit 5 - for a setup method use the @BeforeEach annotation.

    @Test
    void firstTest() {
       assertThat(true).isTrue();
    }
}
