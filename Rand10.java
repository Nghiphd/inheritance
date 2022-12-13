public class Rand10
{
  public int value;

  public void roll() {
    this.value = (int)(Math.random() * 9) + 1;
  }
}