public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Интерация цикла " + i);
        }
        System.out.println("Задача 2");
        for (int q = 10; q >= 0; q--) {
            System.out.println("Интерация цикла " + q);
        }
        System.out.println("Задача 3");
        for (int w = 0; w <= 17; w = w + 2) {
            System.out.println("Интерация цикла " + w);
        }
        System.out.println("Задача 4");
        for (int e = 10; e >= -10; e--) {
            System.out.println("Интерация цикла " + e);
        }
        System.out.println("Задача 5");
        for (int r = 1904; r <= 2096; r = r + 4) {
            System.out.println( r + " Год является високосным");
        }
        System.out.println("Задача 6");
        for (int t = 7; t <= 98; t = t + 7) {
            System.out.println(t);
        }
        System.out.println("Задача 7");
        for (int a = 1; a <= 512; a = a * 2) {
            System.out.println(a);
        }
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int s = 1; s <= 12; s++) {
            total = total + salary;
            System.out.println("Месяц " + s + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 9");
        int salary2 = 29000;
        float total2 = 0;
        for (int d = 1; d <= 12; d++) {
            total2 = total2 + total2/100;
            total2 = total2 + salary2;
            System.out.println("Месяц " + d + " сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println("Задача 10");
        for (int g = 1; g <=10; g++) {
            System.out.println("2 * " + g + " = " + 2 * g);
        }




    }
}
