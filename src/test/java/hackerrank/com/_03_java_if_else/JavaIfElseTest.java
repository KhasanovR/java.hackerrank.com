package hackerrank.com._03_java_if_else;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class JavaIfElseTest {
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
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("3\n".getBytes()));
        JavaIfElse.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("Weird", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase1() {
        System.setIn(new ByteArrayInputStream("24\n".getBytes()));
        JavaIfElse.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("Not Weird", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase2() {
        System.setIn(new ByteArrayInputStream("4\n".getBytes()));
        JavaIfElse.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("Not Weird", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase3() {
        System.setIn(new ByteArrayInputStream("18\n".getBytes()));
        JavaIfElse.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("Weird", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase4() {
        System.setIn(new ByteArrayInputStream("29\n".getBytes()));
        JavaIfElse.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("Weird", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase5() {
        System.setIn(new ByteArrayInputStream("5\n".getBytes()));
        JavaIfElse.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("Weird", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase6() {
        System.setIn(new ByteArrayInputStream("100\n".getBytes()));
        JavaIfElse.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("Not Weird", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase7() {
        System.setIn(new ByteArrayInputStream("20\n".getBytes()));
        JavaIfElse.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("Weird", outputStreamCaptor.toString().trim());
    }
}