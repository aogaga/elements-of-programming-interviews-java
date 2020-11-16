public class Welcome {

  public static void main(String[] args) {

    System.out.println(countBits());

    printMinMaxTypes();
  }

  public static short countBits(){
    int x = 10;
    short numbBits = 0;

    while(x != 0){
      numbBits += (x &  1);
      x >>>= 1;
    }

    return numbBits;
  }

  public static void printMinMaxTypes(){
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);

    System.out.println("---------------------");
    System.out.println(Float.MAX_VALUE);
    System.out.println(Float.MIN_VALUE);

    System.out.println("--------------------------");
    System.out.println(Double.MAX_VALUE);
    System.out.println(Double.MIN_NORMAL);
    System.out.println(Double.SIZE);
  }
}
