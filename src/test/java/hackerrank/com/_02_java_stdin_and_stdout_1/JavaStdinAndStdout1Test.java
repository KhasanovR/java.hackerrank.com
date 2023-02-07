package hackerrank.com._02_java_stdin_and_stdout_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class JavaStdinAndStdout1Test {
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
        System.setIn(new ByteArrayInputStream("42\n100\n125\n".getBytes()));
        JavaStdinAndStdout1.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("42\n100\n125", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase1() {
        System.setIn(new ByteArrayInputStream("10\n-100\n20000000\n".getBytes()));
        JavaStdinAndStdout1.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("10\n-100\n20000000", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase2() {
        System.setIn(new ByteArrayInputStream("0\n1222\n12\n".getBytes()));
        JavaStdinAndStdout1.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("0\n1222\n12", outputStreamCaptor.toString().trim());
    }
}