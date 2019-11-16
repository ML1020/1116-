public class StaticDemo1 {
        private static int age = 18;
        private String name = "待取" ;

    public static void main(String[] args) {
        StaticDemo1 girl1 = new StaticDemo1();
        System.out.println(girl1.name); //待取
        System.out.println(girl1.age);  //18
        System.out.println(StaticDemo1.age); //18
       // System.out.println(StaticDemo.name); 不允许
        girl1.name = "小美";
        girl1.age = 20;
        StaticDemo1 girl2 = new StaticDemo1();
        StaticDemo1 boy = new StaticDemo1();
        System.out.println(boy.age);   //20
        System.out.println(girl2.age);   //20
        System.out.println(boy.name);  //待取
        System.out.println(girl2.name); //待取
    }
}
