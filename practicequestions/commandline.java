public class commandline {
    public static void main(String[] args) {
        int empno;
        String empname;
        double basic,net,gross;

        empno = Integer.parseInt(args[0]);
        empname = args[1];
        basic = Double.parseDouble(args[2]);
        gross = basic + (0.4*basic)+(0.2*basic);
        net = gross - (0.1*gross);

        System.out.println("employee no. :"+empno);
        System.out.println("employee name :"+empname);
        System.out.println("gross salary :"+gross);
        System.out.println("net salary :"+net);
    }
}

//javac commandline.java
//java commandline 1 "abc" 4000
