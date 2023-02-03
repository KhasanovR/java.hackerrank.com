package hackerrank.com._04_java_stdin_and_stdout_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class JavaStdinAndStdout2Test {
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
        System.setIn(new ByteArrayInputStream("42\n3.1415\nWelcome to HackerRank's Java tutorials!\n".getBytes()));
        JavaStdinAndStdout2.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("String: Welcome to HackerRank's Java tutorials!\nDouble: 3.1415\nInt: 42", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase1() {
        System.setIn(new ByteArrayInputStream("100\n42\n42 is the answer to life, the universe, and everything!\n".getBytes()));
        JavaStdinAndStdout2.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("String: 42 is the answer to life, the universe, and everything!\nDouble: 42.0\nInt: 100", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase2() {
        System.setIn(new ByteArrayInputStream("2147483647\n235345345345.234534\n  fsdfsdf   sdf\n".getBytes()));
        JavaStdinAndStdout2.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("String:   fsdfsdf   sdf\nDouble: 2.3534534534523453E11\nInt: 2147483647", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase3() {
        System.setIn(new ByteArrayInputStream("-23123\n123123232\n  m  \n".getBytes()));
        JavaStdinAndStdout2.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("String:   m  \nDouble: 1.23123232E8\nInt: -23123", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase4() {
        System.setIn(new ByteArrayInputStream("0\n0\nmms\n".getBytes()));
        JavaStdinAndStdout2.main(null);
        System.setIn(stdin);
        Assertions.assertEquals("String: mms\nDouble: 0.0\nInt: 0", outputStreamCaptor.toString().trim());
    }
}