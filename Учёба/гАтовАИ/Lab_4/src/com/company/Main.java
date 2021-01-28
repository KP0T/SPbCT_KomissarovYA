package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 //Первое задание

        System.out.println("\n-Задание 1-\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");

        int number = sc.nextInt();
        System.out.println(number < 100 ? "Less": "Not Less");

        //Второе задание

        System.out.println("\n-Задание 2-\n");
        sc = new Scanner(System.in);
        System.out.println("Введите оценку");

        number = sc.nextInt();

        switch (number) {
            case (2) -> System.out.println("Неудовлетворительно");
            case (3) -> System.out.println("Удовлетворительно");
            case (4) -> System.out.println("Хорошо");
            case (5) -> System.out.println("Отлично");
            default -> System.out.println("Такой оценки нет");
        }
        //Третье задание

        System.out.println("\n-Задание 3-\n");
        sc = new Scanner(System.in);
        System.out.println("Введите название дня недели");

        String day = sc.nextLine();

        switch(day)
        {
            case("Воскресенье"):
                System.out.println("0");
                break;
            case("Понедельник"):
                System.out.println("1");
                break;
            case("Вторник"):
                System.out.println("2");
                break;
            case("Среда"):
                System.out.println("3");
                break;
            case("Четверг"):
                System.out.println("4");
                break;
            case("Пятница"):
                System.out.println("5");
                break;
            case("Суббота"):
                System.out.println("6");
                break;
            default:
                System.out.println("День недели введён неверно");
                break;
        }
        //Четвертое задание

        System.out.println("\n---Задание 4---\n");
        sc = new Scanner(System.in);
        System.out.println("Введите баллы студента");

        number = sc.nextInt();

        if(number > 100)
        {
            System.out.println("Система оценивания стобальная!!!!");
        }
        else
        {
            if(number <= 100 && number > 91) System.out.println("Оценка: A");
            else if(number <= 90 && number > 81) System.out.println("Оценка: B");
            else if(number <= 80 && number > 71) System.out.println("Оценка: C");
            else if(number <= 70 && number > 50) System.out.println("Оценка: D");
            else if(number <= 50) System.out.println("Оценка: F");
        }
        //Пятое задание
        System.out.println("\n---Задание 5---\n");
        System.out.println("Номер варианта: " + (65 + 1)%305);

        //Пятое задание.Первая часть
        System.out.println("\n---Задание 5.1---\n");
        double a = 9.5, b= 3.8, x = -4.52, y = 0;

        y = Main.First(a, b, x);
        System.out.println("1) y = " + y);

        x = 1.83;

        y = Main.First(a, b, x);
        System.out.println("2) y = " + y);


        //Пятое задание.Вторая часть
        System.out.println("\n---Задание 5.2---\n");
        a = 7.1; b = 4.2; x = 1.48;

        y = Main.Second(a,b, x);
        System.out.println("1) y = " + y);

        x = 9.17;

        y = Main.Second(a,b, x);
        System.out.println("2) y = " + y);

        x = 6.23;

        y = Main.Second(a,b, x);
        System.out.println("3) y = " + y);
    }

    public static double First(double a, double b, double x)
    {
        if(x <= -1)
            return (a*Math.tan(x*x));

        else
            return (b+((x*x)/((x*x)+a)));

    }


    public static double Second(double a, double b, double x )
    {
        if( x<= 3)
            return (b-(x*x)-1);

        else if(x < 8 && x > 3)
            return (Math.sqrt(Math.log(x+a)));
        else
            return (Math.pow(Math.cos(a*(x*x)+3),2));
    }
}
