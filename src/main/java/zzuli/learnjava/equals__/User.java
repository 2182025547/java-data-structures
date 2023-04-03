package zzuli.learnjava.equals__;

import java.util.Objects;

/**
 * @Author songyitian
 * @date 2023/4/2
 * @time 20:05
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if(obj == null) return false;
//        if(this == obj) return true;
//        if(obj instanceof User){
//            User obj1 = (User) obj;
//            return this.name.equals(obj1.name);
//        }
//        return false;
//    }

//    @Override
//    public int hashCode() {
//        return this.name.hashCode();
//    }

    public static void main(String[] args) {
        User yitian = new User("yitian");
        User yitian1 = new User("yitian");
        System.out.println(yitian1.equals(yitian));
        System.out.println(yitian.hashCode()==yitian1.hashCode());
    }
}
