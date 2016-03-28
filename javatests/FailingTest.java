import org.junit.Test;

public class FailingTest {
	@Test
	public void shouldFail() {
		throw new RuntimeException("fail");
	}
}