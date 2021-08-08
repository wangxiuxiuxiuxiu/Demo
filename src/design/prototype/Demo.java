package design.prototype;

public class Demo {

    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
// TODO Auto-generated method stub
        Sheep sheep = new Sheep("tom", 1, "白色");

        sheep.friend = new Sheep("jack", 2, "黑色");

        Sheep sheep2 = (Sheep) sheep.clone(); //克隆Sheep sheep3 = (Sheep)sheep.clone(); //克隆Sheep sheep4 = (Sheep)sheep.clone(); //克隆Sheep sheep5 = (Sheep)sheep.clone(); //克隆


        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.getAge());
        sheep.friend.setAge(99);
        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.getAge());
    }
}
