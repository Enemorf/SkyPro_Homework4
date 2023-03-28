public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    static void task1()
    {
        System.out.println("Задание 1");
        int age = 15;
        System.out.printf("Если возраст человека равен "+ age + ", то он ");

        if(age >= 18)
        {
            System.out.printf("совершенолетний.\n");
        }
        else
        {
            System.out.printf("не достиг совершеннолетия, нужно немного подождать.\n");
        }
        System.out.println("-----\n");
    }

    static void task2()
    {
        System.out.println("Задание 2");

        int temp = 8;

        System.out.printf("На улице "+ temp + " градусов. ");
        if(temp >= 5)
        {
            System.out.printf("Можно идти без шапки.\n");
        }
        else
        {
            System.out.printf("Нужно надеть шапку.\n");
        }
        System.out.println("-----\n");
    }

    static void task3()
    {
        System.out.println("Задание 3");

        int speed = 20;

        System.out.printf("Если скорость "+ speed + ", то ");
        if(speed > 60)
        {
            System.out.printf("придется заплатить штраф.\n");
        }
        else
        {
            System.out.printf("можно ездить спокойно.\n");
        }
        System.out.println("-----\n");
    }

    static void task4()
    {
        System.out.println("Задание 4");

        int age = 50;

        System.out.printf("Если возраст человека равен "+ age + ", то ему нужно ходить ");
        if(age >= 2 && age <= 6)
        {
            System.out.printf("в детский сад.\n");
        }
        if(age >= 7 && age <= 18)
        {
            System.out.printf("в школу.\n");
        }
        if(age >= 18 && age <= 24)
        {
            System.out.printf("в университет.\n");
        }
        else
        {
            System.out.printf("на работу.\n");
        }
        System.out.println("-----\n");
    }

    static void task5()
    {
        System.out.println("Задание 5");
        int age = 14;

        System.out.printf("Если возраст ребенка равен "+ age + ", то ему ");

        if(age < 5)
        {
            System.out.printf("нельзя кататься на аттракционе.\n");
        }
        if(age >= 5 && age < 14)
        {
            System.out.printf("можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.\n");
        }
        else
        {
            System.out.printf("можно кататься без сопровождения взрослого.\n");
        }
        System.out.println("-----\n");
    }

    static void task6()
    {
        System.out.println("Задание 6");

        int wagonMaxPass = 102;
        int currWagonPass = 103;

        if(currWagonPass > wagonMaxPass)
        {
            System.out.println("В вагоне нет мест.");
        }
        else
        {
            if(currWagonPass >= 60)
            {
                System.out.println("В вагоне только стоячие места.");
            }
            else
            {
                System.out.println("В вагоне стоячие и сидячие места.");
            }
        }
        System.out.println("-----\n");
    }

    static void task7()
    {
        System.out.println("Задание 7");

        int one = 50;
        int two = 12345;
        int three = 4411;

        if(one > two && one > three)
        {
            System.out.println("Самое большое число под переменной one. Число равно "+ one);
        }
        else
        {
            if(two > one && two > three)
            {
                System.out.println("Самое большое число под переменной two. Число равно "+ two);
            }
            else
            {
                System.out.println("Самое большое число под переменной three. Число равно "+ three);
            }
        }
        System.out.println("-----\n");
    }
}