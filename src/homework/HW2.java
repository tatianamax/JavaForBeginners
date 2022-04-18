package homework;

public class HW2 {

    public static void main (String []args) {

        int k = 10;
        int l = 20;
        int m = 30;

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        System.out.println("Sum of k and l = " + (k+l));

        System.out.println(k + " " + " " + l + " " + m);

        System.out.println(k + ", " + l + ", " + m +",");

        System.out.println("int k = 5");
        System.out.println("k = 5");

        System.out.println("k * m = " + (k * m));
        System.out.println("Результат деления k на l = " + (k/l)+", а остаток от деления  = " +
                (k % l));
        System.out.println("Результат деления k на l = " + (k/m)+", а остаток от деления  = " +
                (k % m));

        int apple = 40;
        int student = 6;

        System.out.println("Если " + apple + " яблок поделить на " + student +
                " учеников, то каждый ученик получит по " + (apple/student) + " яблок(a), и "
                + (apple % student) + " яблок(а) останется учителю.");

        int sumKLM = k+l+m;
        int sumLKM = sumKLM;
        m++;
        System.out.println(m);
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + (k+l+m++ + sumKLM) +
        ", а разность m++ и  sumLKM =" + (m++ - sumLKM));
        System.out.println(m);
        System.out.println("Число 48 кратно 8, так как остаток от деления " + (48%8) + ". Числа 47 и 49 - нечетные," +
                " так как остаток от деления на 2 = " + (47%2));

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        System.out.println("(x + 3) ^ 2 = " + Math.pow((x + 3),2));

        System.out.println("3 + 4x/5" + "- 10 (y - 5)( a + b +c) / x" + " + 9 ( 4/x + ( 9 + x) /y  ");

        System.out.println((3+4*x)/5);
        System.out.println((10 * (y-5) * (a + b + c))/x );
        System.out.println(9 * ((4/x) + (9 + x)/ y ));
        System.out.println(((3+4*x)/5) - ((10 * (y-5) * (a + b + c))/x) + (9 * ((4/x) + (9 + x)/ y )));

        System.out.println( (((5 * x) + ( 7*y)) / ( ( 8 * x) + (10 * y))) / (( 3 * x) - y )/ (x + y)) ;













    }
}
