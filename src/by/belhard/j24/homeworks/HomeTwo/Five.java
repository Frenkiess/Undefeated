package by.belhard.j24.homeworks.HomeTwo;

public class Five {

    public Five() {
    }

    public static void main(String[] args) {

        System.out.println(getPow(3, 4));
        System.out.println(sixWo(10000, 0.05, 5, 0.01));
    }


    public static int getPow(int a, int pow) {
        int result = a;
        for (int i = 1; i < pow; i++) {
            result = result * a;
        }
        return result;
    }

    public static double sixWo(double startSum, double proc, double years, double pen) {
        double result = startSum;
        double d = proc - pen ;
            for (double u = 1; u <= years; u++)
            result += result * proc * d;




//        double fyear = startSum + (startSum * proc) - (startSum * 0.01) ;
//        double syear = fyear + (fyear * proc) - (fyear * 0.01);
//        double tyear = syear + (syear * proc) - (syear *0.01);
//        double cash = (fyear + syear + tyear);{
//            System.out.println(cash);
//        }
        return result ;
    }

}

