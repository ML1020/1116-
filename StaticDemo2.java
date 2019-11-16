class Animal {
    private static String settle;
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public static void setSettle(String m) {
        settle = m;
    }

    public void getInfo() {
        System.out.println("姓名:" + this.name +
                "颜色:" + this.color + "居住地:" + this.settle);
    }
}
public class StaticDemo2 {
    public static void main(String[] args) {
        Animal.setSettle("zoo");
        Animal animal = new Animal("兔子","white");
        animal.getInfo();
    }
}
