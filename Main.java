class Main {
    public static void main(String[] args) {
  
      int star = 20;
      int ambersand = 15;
  
      // outer loop prints weeks
      for (int i = 1; i <= ambersand; ++i) {
        System.out.println("& " + i);
  
        // inner loop prints days
        for (int j = 1; j <= star; ++j) {
          System.out.println("  *: "  +j);
        }
      }
    }
  }