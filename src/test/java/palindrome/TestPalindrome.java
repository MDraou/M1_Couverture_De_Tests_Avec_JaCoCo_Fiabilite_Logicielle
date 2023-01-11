package palindrome;

import org.junit.jupiter.api.*;
import palindrome.Palindrome;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPalindrome {

  @Test
  void testEmptyString() {
    assertThat(Palindrome.isPalindrome("")).isTrue();
  }

  @Test
  void testEvenLengthFalse() {
    assertThat(Palindrome.isPalindrome("abcd")).isFalse();
  }

  @Test
  void testEvenLengthTrue() {
    assertThat(Palindrome.isPalindrome("abba")).isTrue();
  }

  //@Disabled
  @Test
  void testOddLengthTrue() {
    assertThat(Palindrome.isPalindrome("aba")).isTrue();
  }
}
