import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void test() {
        System.out.println("Main тест запущен!");
    }

    @Test
    @Tag("smoke")
    public void testUISmoke() {
        System.out.println("Smoke Main тест запущен!");
    }
}
