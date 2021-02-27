public class staticOuter {
   static class Nested_Demo {
      public void my_method() {
         System.out.println("This is my nested class");
      }
   }
   
   public static void main(String args[]) {
      staticOuter.Nested_Demo nested = new staticOuter.Nested_Demo();	 
      nested.my_method();
   }
}