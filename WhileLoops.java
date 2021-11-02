public class WhileLoops {
    public static void main(String[] args) {
        boolean t = true;
        boolean t2 = 5 > 2;
        boolean t3 = 5 == 5;
        boolean t4 = 5 != 6;
        boolean t5 = 5 > 7;
        int value = 0;
        boolean t6 = value > 5;
        System.out.println(t);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);

        while(value<5) {
            System.out.println(value);
            value+=1;
        }

    }
}
