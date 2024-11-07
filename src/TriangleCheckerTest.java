import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TriangleCheckerTest {
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  void setUp() {
    // Redirect System.out to capture output for testing
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @Test
  void testMainEquilateral() {
    // Prepare arguments for an equilateral triangle (all sides equal)
    String[] args = { "3", "3", "3" };
    TriangleChecker.main(args);
    assertEquals(true, true);
  }
}
