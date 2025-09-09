public class MethodKadai {
    public static void main(String[] args) {
        greet("‚½‚ë‚¤");
        System.out.println(doubleNumber(5));
    }

    /*
    * Q1
    * */
    public static void greet(String name) {
        System.out.println("‚±‚ñ‚É‚¿‚ÍA"+ name +"‚³‚ñI");
    }

    public static int doubleNumber(int num){
        return num*2;
    }

}

