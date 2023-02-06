package hackerrank.com._15_java_substring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class JavaSubstringTest {
    private final InputStream stdin = System.in;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void testCase0() {
        System.setIn(new ByteArrayInputStream("".getBytes()));
        JavaSubstring.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("", outputStreamCaptor.toString().trim());
    }
}