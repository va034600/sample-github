package sample.junit4;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class MessageUtilityTest {
	@Test
	public void testGetMessage_01() throws IOException {
		assertEquals("abc", MessageUtility.getMessage());
	}
	@Test
	public void testGetMessage_02() throws IOException {
		assertEquals("abcd", MessageUtility.getMessage());
	}
}