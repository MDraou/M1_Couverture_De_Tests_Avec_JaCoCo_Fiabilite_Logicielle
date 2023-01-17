package complex;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.fail;
import org.assertj.core.api.DurationAssert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.Duration;


/**
 * Test class for the complex class.
 */

class ComplexTest {
  private static final float EPSILON = 0.000001F;
  private Complex z;
  private Complex z1;
  private Complex z2;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
    System.out.println("beforeAll");
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
    System.out.println("afterAll");
  }

  @BeforeEach
  void setUp() throws Exception {
    // TODO: add message
    System.out.println("beforeEach");
    z = new Complex();
    z1 = new Complex(1.0F, 2.0F);
    z2 = new Complex(3.0F, 4.0F);
  }

  @AfterEach
  void tearDown() throws Exception {
    // TODO: add message
    System.out.println("afterEach");
  }


  @Test
  void testGetterImaginary() {

    float expected = 2.0F;
    z = new Complex(1.0F, 2.0f);
    assertThat(z.getImaginaryPart()).as("problem on getter imaginary")
            .isCloseTo(expected, within(EPSILON));

  }

  @Test
  void testGetterReal() {

    float expected = 1.0F;
    z = new Complex(1.0F, 2.0f);

    assertThat(z.getRealPart()).as("problem on getter real")
            .isCloseTo(expected, within(EPSILON));

  }

  @Test
  void testSetterImaginary() {

    float expected = 3.0F;
    z.setImaginaryPart(expected);
    assertThat(z.getImaginaryPart()).as("problem on setter imaginary")
            .isCloseTo(expected, within(EPSILON));

  }

  @Test
  void testSetterReal() {

    float expected = 3.0F;
    z.setRealPart(expected);
    assertThat(z.getRealPart()).as("problem on setter real")
            .isCloseTo(expected, within(EPSILON));
  }

  @Test
  void testZeroTrue() {
    Complex z = new Complex(0.0F, 0.0F);
    assertThat(z.isZero()).as("problem with isZero on Zero Complex number")
            .isTrue();
  }

  @Test
  void testZeroFalse() {
    z = new Complex(1.0F, 1.0F);
    assertThat(z.isZero()).as("problem with isZero on non Zero Complex number")
            .isFalse();
  }

  // Ajout pour la question 2.1  :
  @Test
  void testZeroTrueAndFalse() {
    Complex z = new Complex(0.0F, 1.0F);
    assertThat(z.isZero()).as("problem with isZero on Zero Complex number")
            .isFalse();
  }

  @Test
  void testSumReal() {
    float expected = 1.0F + 3.0F;

    z = z1.sum(z2);
    assertThat(z.getRealPart()).as("problem with real part of Sum")
            .isCloseTo(expected, within(EPSILON));
  }

  @Test
  void testSumImaginary() {
    float expected = 2.0F + 4.0F;

    z = z1.sum(z2);
    assertThat(z.getImaginaryPart()).as("problem with imaginary part of Sum")
            .isCloseTo(expected, within(EPSILON));
  }

  // Mise en commentaire nécessaire du @Disabled ici
  @Test
  void testProductReal() {

    float expected = 1.0F * 3.0F - 2.0F * 4.0F;

    z = z1.product(z2);
    assertThat(z.getRealPart()).as("problem with real part of Product")
            .isCloseTo(expected, within(EPSILON));

  }

  // Mise en commentaire nécessaire du @Disabled ici
  @Test
  void testProductImaginary() {
    float expected = 1.0F * 4.0F + 2.0F * 3.0F;

    z = z1.product(z2);
    assertThat(z.getImaginaryPart()).as("problem with imaginary part of Product")
            .isCloseTo(expected, within(EPSILON));
  }

  @Test
  void testInverseReal() {
    z = z1.inverse();
    float expected = 1.0F / 5.0F;
    assertThat(z.getRealPart()).as("problem with real part of inverse")
            .isCloseTo(expected, within(EPSILON));
  }

  @Test
  void testInverseImaginary() {
    z = z1.inverse();
    float expected = -2.0F/5.0F;
    assertThat(z.getImaginaryPart()).as("problem with imaginary part of inverse")
            .isCloseTo(expected, within(EPSILON));
  }

  @Test
  void testInverseZero() {
    assertThatThrownBy(() -> {
      z.inverse();
    }).isInstanceOf(IllegalArgumentException.class).hasMessage(null);
  }

  @Test
  void testToString() {
    z = new Complex(3.0F, -5.0F);
    assertThat(z.toString()).as("problem with string part of toString").isEqualTo("3.0 + (-5.0i)");
  }

}
