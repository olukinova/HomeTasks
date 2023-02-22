package HomeTask11;

public class Task5 {
   boolean isPrime (int num) {
       boolean flag = true;
       if(num > 1) {
           for(int i = 2; i < num/2; i++) {
               if (num%i == 0) {
                   flag = false;
                   break;
               }
           }
       } else {
           flag = false;
       }
       return flag;
   }
}
