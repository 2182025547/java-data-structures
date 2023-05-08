package zzuli.learnjava.reflection_;

/**
 * @Author songyitian
 * @date 2023/3/8
 * @time 21:44
 */
public class Cat {
    private String name="招财猫";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    //hi method
    public void hi(){
        System.out.println("cat: hi!");
    }

    public void cry(){
        System.out.println("miaomaioamiao");
    }
}
