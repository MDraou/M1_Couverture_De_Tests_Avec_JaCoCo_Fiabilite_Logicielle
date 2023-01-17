package stringarray;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStringArray {
  private static String[] slist1 = {
          "a", "b", "ccc", "ccd", "d", "e", "f", "g"
  };
  private static String[] slist2 = {
          "ab", "ccd", "ccc", "g", "f", "e", "d"
  };

  private static String[] slist3 = {
          "ab", "ab"
  };


  private StringArray array1;
  private StringArray array2;

  private  StringArray array3;
  @BeforeAll
  static void setUpBeforeClass() throws Exception {
    System.out.println("debut des tests");
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
    System.out.println("fin des tests");
  }

  @BeforeEach
  void setUp() throws Exception {
    System.out.println("debut du test");
  }

  @AfterEach
  void tearDown() throws Exception {
    System.out.println("fin du test");
  }

  @Test
  void testStringArray1() {
    array1 = new StringArray(slist1);
    assertThat(array1.size()).isEqualTo(8);
  }

  @Test
  void testStringArray2() {
    array2 = new StringArray(slist2);
    assertThat(array2.size()).isEqualTo(7);
  }

  //2.2.5
  @Test
  void testStringArray3() {
    array3 = new StringArray(slist3);
    assertThat(array3.size()).isEqualTo(1);
  }

  @Test
  void test1IndexOf() {
    array2 = new StringArray(slist2);
    assertThat(array2.IndexOf("ee")).isEqualTo(-1);
  }

  @Test
  void test2IndexOf() {
    array2 = new StringArray(slist2);
		assertThat(array2.IndexOf("d")).isEqualTo(3);
  }

  @Test
  void testGetString() {
    array1 = new StringArray(slist1);
    assertThat(array1.getString(3).equals("ccc"));
  }

  @Test
  void testGetMlist() {
    array2 = new StringArray(slist2);
    String[] expected = {"ab", "ccd", "ccc", "g", "f", "e", "d"};
    assertThat(array2.getMlist().equals(expected));
  }

  @Test
  void testSize() {
    array1 = new StringArray(slist1);
    assertThat(array1.size()).isEqualTo(8);
  }

  @Test
  void testiemeElement() {
    array1 = new StringArray(slist1);
    assertThat(array1.getString(4).equals(slist1[4]));
  }

}
