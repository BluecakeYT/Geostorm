public class Driver {
  public static void main(String[] args) {
    SuperArray superx = new SuperArray ();
    superx.Array[0] = "lala";
    System.out.println (superx.Array[0]);
    superx.Clear();
    System.out.println (superx.Array[0]);
    superx.Array[0] = "sese";
    superx.Array[1] = "lele";
    superx.Array[2] = "lelo";
    superx.Array[3] = "lela";
    System.out.println (superx.Size());
    System.out.println (superx.isEmpty());
    System.out.println (superx.get(1));
    System.out.println (superx.toString());
    System.out.println (superx.contains("lelo"));
    superx.add("rere");
    System.out.println (superx.toString());
    superx.set(3, "lelama");
    System.out.println (superx.toString());
    System.out.println (superx.indexOf("lelo"));
    superx.add("lelama");
    superx.add("lelama");
    System.out.println (superx.lastIndexOf("lelama"));
    System.out.println (superx.toString());
    superx.remove("lelama");
    System.out.println (superx.toString());
    System.out.println (superx.remove(2));
    System.out.println (superx.toString());
    superx.add (2, "lelamaX");
    superx.add (3, "lelemiste");
    superx.remove (5);
    System.out.println (superx.toString());
  }
}
