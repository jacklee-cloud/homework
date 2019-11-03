package demo;

public class Person {
     void feed(Animals a){
         a.eat();
     }
           void take(Animals a){

         a.run();
         a.shit();
           }
       void get(){
           System.out.println("赶紧捡屎并丢到垃圾桶里");
       }
       void gohome(Animals a){
           System.out.println("遛狗结束，回家啦！");
       }
}
