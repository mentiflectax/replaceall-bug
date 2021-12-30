import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceAllTtest {
    @Test
    public void test1() {
        // Given
        final String text = "#+begin_quote\nSome text\n#+end_quote";
        final String searchItem = "#\\+begin_quote";

        // When
        final String actualResult = text.replaceAll(searchItem, "");

        // Then
        assertEquals("\nSome text\n#+end_quote", actualResult);
    }

    @Test
    public void test2() {
        // Given
        final String text = "#+begin_quote\nSome text\n#+end_quote";
        final String searchItem = "#";

        // When
        final String actualResult = text.replaceAll(searchItem, "");

        // Then
        assertEquals("+begin_quote\nSome text\n+end_quote", actualResult);
    }

}
