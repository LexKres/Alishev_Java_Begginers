public class StrBuild {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " my";
        String str3 = " friend";
        String strAll = str1 + str2 + str3;
        /* вначале в памяти будет создана строка "Hello my" (str1 + str2)
           затем в памяти будет создана строка "Hello my friend" ( "Hello my" + str3)
           Если это делать много, например, в цикле, то ведет к перерасходу памяти
           Поэтлому был сделан класс StringBuilder, который в отличие от String является изменяемым.
         */

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my");
        sb.append(" dear").append("\n");
        sb.append("friend!");
        System.out.println(sb.toString());


        //форматирование строк
        System.out.print("Hello");
        System.out.println(" my friend");

        System.out.printf("This is a string, %s", "NICE");
        System.out.printf("\n %f This is a %s string, %d", 11.3, "NICE", 10);
        System.out.printf("\n This is a string, %7d", 5);
        System.out.printf("\n This is a string, %7d", 555);
        System.out.printf("\n This is a string, %7d", 555555);
        System.out.printf("\n This is a string, %-7d", 5);
        System.out.printf("\n This is a string, %-7d", 555);
        System.out.printf("\n This is a string, %-7d", 555555);
        System.out.printf("\n This is a string, %.2f", 45.3);

    }
}
