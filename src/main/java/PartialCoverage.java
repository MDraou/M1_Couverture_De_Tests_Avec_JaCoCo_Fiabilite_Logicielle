
public class PartialCoverage {

  public int returnZeroOrOne(int x, int y) {
    int res = 0;
    int z = 2;
    x = z * z - z - 1;
    /* on va voir si intellij s'en sort!*/
    y = x > 0 ? -1 : 0;
    for (int i = x; i < y; i++) {
      res = x == 0 ? 1 : 0;
    }
    return res;
  }

}
