package Notepad;

import java.io.IOException;


 class notepad {
  public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
     try {
      rs.exec("SnippingTool");
    }
    catch (IOException e) {
      System.out.println(e);
    }   
  }
}
