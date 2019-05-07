public class SuperArray {
int Size = 0;
String[] Array = new String[4];
  private void resize() {
    String[] tempArray = new String[Array.length];
    tempArray = Array;
    Array = new String[tempArray.length];
  }
  public SuperArray () {

  }
  public void Clear () {
    Array = new String[10];
  }
  public int Size() {
   int Sizer = 0;
    for (int i = 0; i < Array.length; i++) {
      if (Array[i] != null) {
        Sizer++;
      }
    }
    return Sizer;
  }
  public String get (int Index) {
    if (Index <= 9) {
    return Array[Index];
  } else {
    return "Out of bounds ;)";
  }
  }
  public String set (int Index, String Element) {
    if (Index <= 9) {
    Array[Index] = Element;
    return Array[Index];
  } else {
    return "Out of bounds ;)";
  }
  }
  public boolean isEmpty() {
    int indexCheck = 0;
    for (int i = 0; i < Array.length; i++) {
      if (Array[i] != null) {
        indexCheck++;
      }
    }
  if (indexCheck == 0) {
    return true;
  } else {
    return false;
  }
 }
 public String toString() {
   StringBuilder sb = new StringBuilder();
   sb.append('[');
   for (int i=0; i<Array.length; i++) {
      if (Array[i] != null) {
         if (sb.length() > 1) {
          sb.append(',');
         }
          sb.append(Array[i]);
      }
   }
   sb.append(']');
   return sb.toString();
   /*
   String two = "";
   for (int i = 0; i < Array.length; i++) {
       if (Array [i] != null) {
       if (Array [i + 1] != null && i != 0 && i != Array.length - 1 && Array[0] != null) {
          two += Array[i] + ", ";
       } else
       if (Array [i + 1] == null || i == Array.length - 1) {
         two += Array[i] + "]";
       } else
       if (i == 0 && Array[i] != null) {
         two += "[" + Array[i] + ", ";
       } else
       if (i == 0 && Array[i] == null) {
         two += "[Null 1st, ";
       }
     }
   }
   return two;
   */
 }
 public boolean contains(String element) {
   boolean bool = false;
   for (int i = 0; i < Array.length; i++) {
     if (Array [i] == element) {
       bool = true;
     }
   }
   return bool;
 }
 public boolean add(String element) {

   for (int i = 0; i < Array.length; i++) {
     if (Array [i] == null) {
       Array[i] = element;
       break;

     }
   }
   if (Array [Array.length - 1] != null) {
     resize();
   }
   return true;
 }
 public int indexOf (String element) {
   int index = -1;
   for (int i = 0; i < Array.length; i++) {
     if (Array[i] == null && element == null) {
        index = i;
        break;
     }
     if (Array[i] != null && Array[i].equals(element)) {
        index = i;
        break;
     }
   }
   return index;
 }

 public int lastIndexOf (String element) {
   int index = -1;
   for (int i = Array.length - 1; i >= 0; i--) {
       if (Array[i] == null && element == null) {
          index = i;
          break;
       }
       if (Array[i] != null && Array[i].equals(element)) {
          index = i;
          break;
       }
   }
   return index;
  }
  public String remove (int index) {
    String tempString = Array [index];
    for (int i = index; i < Array.length - 1; i++) {
      Array[i] = Array [i + 1];
    }
    return tempString;
  }
  public boolean remove (String element) {
    boolean bool = false;
    for (int i = 0; i < Array.length; i++) {
      if (Array[i] != null && Array[i].equals(element)) {

         for (int j = i; j < Array.length - 1; j++) {
           Array [j] = Array [j + 1];
         }
         bool = true;
         break;
      }
    }
   return bool;
  }
  public void add (int index, String element) {
    int newd = index;
    int leed = index;
    String delos = Array [leed];
    String newdex = Array[newd];
    for (int i = index; i < Array.length - 1; i++) {
      if (Array [Array.length - 1] != null) {
        resize();
      }
      if (Array[i] != null) {
      newd += 1;
      newdex = Array [newd];
      Array [i + 1] = delos;
      delos = newdex;
     }
    }
    Array [index] = element;
  }

}
