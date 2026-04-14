
class salary {
    public static void main(String[] args) {
        int empno = Integer.parseInt(args[0]);
        String empname = args[1];
        double BS = Double.parseDouble(args[2]);
        double HRA = 0.7 * BS;
        double DA = 0.3 * BS;
        int CCA = 240;
        double Gross_Sal = CCA + DA + BS + HRA;
        System.out.println("employee no:" + empno);
        System.out.println("employee name :" +empname);

        System.out.println("Gross Salary is " + Gross_Sal);
        double PF = 0.1 * BS;
        int PT = 100;
        double Net_sal = Gross_Sal - PF - PT;
        System.out.println("net salary is" + Net_sal);
    }
}