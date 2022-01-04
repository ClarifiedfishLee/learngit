public class max {
      public static int findmax(int[] m) {
      int t = 0;
      for(int i = 0;i<m.length;i++) {
          if (m[i] > t) {
              t = m[i];
          }
      }
          return t;
   }
   public static void main(String[] args) {
     int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.println(findmax(numbers));
   }
}