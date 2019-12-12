public class Pair<T extends Comparable>{
  private T first, second;

  public void orderPair() {
    if(this.first.compareTo(this.second) > 0) {
      T temp = this.first;
      this.second = this.first;
      this.first = temp;
    }
  }
}
