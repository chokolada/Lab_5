import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab5.TextFilter;

import java.util.Scanner;

class TextFilterTest {
  TextFilter someText;
  Scanner scanner;
  @BeforeEach
  public void setUp() {
    someText = new TextFilter();
    scanner = new Scanner(System.in);
  }
  @Test
    public void isSentenceEmphasized() {
    String text = "Nice to meet you!";
    Assertions.assertTrue(someText.isSentenceEmphasized(text));
  }
  @Test
  public void sentenceIsEmpty() {
    String text = "Nice to meet you!";
    Assertions.assertFalse(text.isEmpty());
  }
  @Test
  public void allConsonantsCounterNotZero() {
    String text = "Nice to meet you!";
    Assertions.assertTrue(someText.allConsonantsCounter(text) > 0);
  }
}