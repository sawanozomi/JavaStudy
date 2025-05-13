
public class Kadai1 {
    public static void main(String[] args) {

        num1 = 
        try {
            int num1 = Integer.parseInt (args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("引数が設定されていません") ;
        }

        int count = 0;

        for (int i = 0; i <= 1000; i++){
            System.out.print (i);
            count ++;
            if (count == num1){
                count = 0;
                System.out.println ();
            }else if (i == 1000){
                break;
            }
            else {
                System.out.print(" ");
            }
            System.out.print("");
        }









    }
}



