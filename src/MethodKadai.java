public class MethodKadai {
    public static void main(String[] args) {
        greet("���낤");
        System.out.println(doubleNumber(5));
    }

    /*
    * Q1
    * */
    public static void greet(String name) {
        System.out.println("����ɂ��́A"+ name +"����I");
    }

    public static int doubleNumber(int num){
        return num*2;
    }

}

