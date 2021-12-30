import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceAllTtest {
    @Test
    public void replaceAllTest() {
        // Given
        final String text = "#+begin_quote\nSome text\n#+end_quote";
        final String searchItem = "#+begin_quote";

        // When
        final String actualResult = text.replaceAll(text, searchItem);

        // Then
        assertEquals("\\nSome text\\n#+end_quote", actualResult);
    }
}
