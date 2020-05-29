public class ForLoop {
    public static void main(String[] args) {
   for (int i =0; i<10; i++) {

       System.out.println("This is my loop!");

        }
        for (int i = 0; i<15; i++){
            System.out.println(i);
        }

        int[] grades = {98, 100, 83, 90, 95};

        for (int i=0; i< grades.length; i++){
            System.out.println(grades[i]);

        }
        for(int i = 1; i<=6; i++) {

            for (int j = 1; j <= 10; j++) {
                if (i == 5 && j == 5) {
                    break;
                }
                System.out.println(i + "  " + j);
            }
        }

   }

}
