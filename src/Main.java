public class Main {
    public static void main(String[] args) {
        for (int c = 1; c <= 10; c = c + 1)
            System.out.println(c);
        System.out.println();
    for (int b=10; b>=1; b--)
        System.out.println(b);
        System.out.println();
    for(int a=0; a<=17; a= a+2)
        System.out.println(a);
        System.out.println();
    for(int c=10; c>=-10; c--)
        System.out.println(c);
        System.out.println();
    for(int yaer =1904; yaer<=2096; yaer = yaer+4)
        System.out.println(yaer+" год является високосным.");
        System.out.println();
    for (int d=7; d<=98; d=d+7)
        System.out.println(d);
        System.out.println();
    for (int f=1; f<=512; f= f*2)
        System.out.println(f);
        System.out.println();
    int salary =29000;
    int total =0;
    for(int i=0; i<12; i++){
        total = total;
        total = total+salary;
        System.out.println("Месяц " +i+" сумма накоплений равна "+total);}
        System.out.println();
    int salaryTwo = 29000;
    int totalTwo =0;
    for (int g=0; g<12; g++){
        totalTwo = totalTwo + totalTwo/100;
        totalTwo = totalTwo + salaryTwo;
        System.out.println("Месяц " +g+" сумма накоплений равна "+totalTwo);
        System.out.println();
    }
    int number =2;
    for(int x=0; x<=10; x++){
        System.out.println(number+" * "+x+" = "+number * x);
    }
}
}