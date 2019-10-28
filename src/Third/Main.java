package Third;


import java.util.Scanner;

interface a{
     public  String AUTHOR="恭喜你成为红岩的正式成员！";
     public void print();

}

class B implements a{
    public void print(){
        System.out.println(AUTHOR);
    }
}

public class Main {
    public static void main(String[] args) {
        B redrock=new B();
        double a;
        System.out.println("请输入你的考核成绩。");
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        if (a>=80&&a<=100){
            redrock.print();
        }
        if (a>=0&&a<80){
            System.out.println("你这个弱者！");
        }
    }
}
