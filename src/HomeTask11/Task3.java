package HomeTask11;

public class Task3 {
   void isPalindrome (String str) {
       StringBuilder st = new StringBuilder();
       String reversed = st.reverse().toString();
       if(str.equalsIgnoreCase(reversed)) {
           System.out.println("This string is a palindrome");
       } else {
           System.out.println("This string is not a palindrome");
       }
   }
}

