public class CH1 {
    
    public static void main(String[] args) {
        System.out.println("Chapter 1: Introduction to Computers, Programming, and Java.");
    }
}


class Q1_1 {

    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    }
}


class Q1_2 {

    public static void main(String[] args) {
        byte i;
        for(i=0; i<5; i++)
        System.out.println("Welcome to Java");
    }
}


class Q1_3 {

    public static void main(String[] args) {
        // declare variables for for loop. x = x-axis, y = y-axis
        byte x;
        byte y;

        // J
        for(x=1; x<5; x++) {
            for(y=1; y<5; y++) {
                if(x==1 && y==4 || x==2 && y==4 || x==3 && y==1 | y==4 || x==4 && y==2 | y==3) {
                System.out.print("*");
                }
                else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
System.out.println();
        // A
        for(y=1; y<5; y++) {
            for(x=1; x<8; x++) {
                if(y==1 && x==4 || y==2 && x==3 | x==5 || y==3 && x==2 | x==3 | x==4 | x==5 | x==6 || y==4 && x==1 | x==7) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
System.out.println();
        // V
        for(y=1; y<5; y++) {
            for(x=1; x<8; x++) {
                if(x + y == 8 || x == y) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
System.out.println();
        // A
        for(y=1; y<5; y++) {
            for(x=1; x<8; x++) {
                if(y==1 && x==4 || y==2 && x==3 | x==5 || y==3 && x==2 | x==3 | x==4 | x==5 | x==6 || y==4 && x==1 | x==7) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


class Q1_4 {

    public static void main(String[] args) {
        System.out.println("a     a^2     a^3");
        byte a;
        for (a=1; a<5; a++) {
            System.out.println(a + "     " + Math.pow(a,2) + "       " + Math.pow(a,3));
        }
    }
}


class Q1_5 {

    public static void main(String[]args) {
        double ans;
        double numerator;
        double denominator;

        numerator = (9.5 * 4.5) - (2.5 * 3);
        denominator = 45.5 - 3.5;
        ans = numerator/denominator;
        //System.out.println(numerator);
        //System.out.println(denominator);

        System.out.println(ans);
    }
}


class Q1_6 {

    public static void main(String[] args) {
        int seq = 0;
        int a;

        for (a=1; a<=9; a++) {
            seq += a;
        }

        System.out.println(seq);
    }
}


class Q1_7 {

    double pi_approx(int a) {
        int no = 1;
        double res = 1;
        while(no<=a) {
            if (no % 2 == 0) {
                res = res + 1.0/(3 + (2 * (no - 1)));
            }
            else {
                res = res - 1.0/(3 + (2 * (no - 1)));
            }
            no++;
        }
        res = res * 4;
        return(res);
    }

    public static void main(String[] args) {
        double pi_approx_11;
        double pi_approx_13;

        Q1_7 approx = new Q1_7();
        pi_approx_11 = approx.pi_approx(5);
        pi_approx_13 = approx.pi_approx(6);

        System.out.println(pi_approx_11);
        System.out.println(pi_approx_13);


    }
}


class Q1_8 {

    Q1_7 pi = new Q1_7();

    double perimeter(double radius) {
        double per = 2 * radius * pi.pi_approx(100000);
        return (per);
    }

    double area(double radius) {
        double area = radius * radius * pi.pi_approx(100000);
        return (area);
    }

    public static void main(String[] args) {

        Q1_8 ans = new Q1_8();

        System.out.println(ans.perimeter(5.5));
        System.out.println(ans.area(5.5));
    }
}


class Q1_9 {

    double area(double width, double height) {
        return(width * height);
    }

    public static void main(String[] args) {
        Q1_9 ans = new Q1_9();

        System.out.println(ans.area(4.5, 7.9));
    }
}


class Q1_10 {

    double mph(double km, double hr) {
        return ((km * (1.0 / 1.6)) / hr);
    }

    public static void main(String[] args) {

        Q1_10 ans = new Q1_10();

        System.out.println(ans.mph(14, 45.5/60));
    }
}


class Q1_11 {

    public static void main(String[] args) {
        int currentpop = 312032486;

        double secperyear = (365 * 24 * 60 * 60);

        double deathperyear = secperyear/13;
        double birthperyear = secperyear/7;
        double immigrantperyear = secperyear/45;

        double plus = birthperyear + immigrantperyear;
        double minus = deathperyear;

        double changeperyear = plus - minus;

        int a ;
        for (a=0; a<6; a++) {
            System.out.print("base year" + " + " + a + ": ");
            System.out.println(currentpop + (changeperyear * a));
        }
    }
}


class Q1_12 {

    public static void main(String[] args) {

        Q1_10 ans = new Q1_10();

        double milestokm = 24 * 1.6;

        System.out.println(ans.mph(milestokm, (100 / 60 + ((35 / 60) / 60))) * 1.6 / 1.0);
    }
}


class Q1_13 {

    double Cramer(double a, double b, double c, double d, double e, double f) {
        double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
        double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        double fake = 0;
        return(fake);
    }

    public static void main(String[] args) {

        Q1_13 ans = new Q1_13();

        double answer = ans.Cramer(3.4, 50.2, 44.5, 2.1, 0.55, 5.9);
        System.out.println(answer);
    }
}