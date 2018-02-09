package test;

import main.SetupDemo;
import org.junit.*;

public class SetupDemoTest {
    static SetupDemo sd;

    @BeforeClass
    public static void setUp() {
        sd = new SetupDemo();
        System.out.println("Before!");
    }

    @Test
    public void test1() {
        sd.print("test1");
    }

    @Test
    public void test2() {
        sd.print("test2");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("After!");
    }
}
