package by.belhard.j24.homeworks.HomeTwo;

public class HomeTwo {

    public static void main(String[] args) {


        double summa = 10000;
        double proc = 0.05;
        double pen = 0.01;
        double dif = proc - pen;
        double years = 5;
        for(double i = 1; i <= years; i++){
            summa += summa * dif;
        }
        System.out.println(summa);
//        шестая задача первой будет.


//      первая задача

        int i = 120;
        char c = 30;
        double d = 70.5;
        boolean b = c <= i;

        System.out.println(i >= 100);
        System.out.println(c * d);
        System.out.println(++d);
        System.out.println(i * 23 % 13);
        System.out.println(b);

//        вторая задача

        System.out.println();

        int r = 10;
        double p = 3.14;
        boolean m = (r >= 0);

        if (m){
            System.out.println(r * r * p);
            System.out.println(2 * r * p);
        }
        else {
            System.out.println("error");

        }

//        третья задача
        System.out.println();

        int temp = 16;
        if (temp < 10){
            System.out.println("куртка");
        }else
            if (temp <= 15){
            System.out.println("ветровка");
            }else
                if (temp <= 19) {
                System.out.println("свитер");
                }else
                    if (temp <= 29){
                    System.out.println("майка");
                    }else
                        if (temp > 29){
                        System.out.println("ничего");
        }

        System.out.println();

//      четвертая задача
        int salary1 = 3000;
        int salary2 = 2000;
        int salary3 = 1000;

        if (salary1 > salary2 && salary2 > salary3) {
            System.out.println(salary1-salary3);
        }else
            if (salary1 > salary3 && salary3 > salary2 ){
                System.out.println(salary1 - salary2);
            } else
                if (salary2 > salary1 && salary1 > salary3){
                    System.out.println(salary2 - salary3);
                } else
                    if (salary2 > salary3 && salary3 > salary1){
                        System.out.println(salary2 - salary1);
                    } else
                        if (salary3 > salary1 && salary1 > salary2){
                            System.out.println(salary3 - salary2);
                        } else
                            if (salary3 > salary2 && salary2 > salary1){
                                System.out.println(salary3 - salary1);
                            }


        }

        }













