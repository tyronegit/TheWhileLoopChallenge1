public class TheWhileLoopChallenge {

   public static void main(String[] args) {
//       {
//        System.out.println (isEvenNumber ( 2 ));
//    }
//
//    public static boolean isEvenNumber(int number) {
//
//        while (number <= 20) {
//            if ( number % 2 == 0){
//                System.out.println (number + " is even.");
//                number++;
//            } else {
//                System.out.println (number + " is odd.");
//            }
//        }
//        return false;
//    }

       int number = 5;
       while (number <= 20) {
           if (isEvenNumber ( number )) {
               System.out.println ( number + " is even." );
           }
           number++;
       }
   }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}


