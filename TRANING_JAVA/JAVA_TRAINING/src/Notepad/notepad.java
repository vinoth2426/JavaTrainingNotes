package Notepad;

class notepad {
  public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
     try {
      rs.exec("notepad");
    }
    catch (Exception e) {
      System.out.println(e);
    }   
  }
}
