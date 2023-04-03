package zzuli.learnjava.equals__;

import java.util.*;

/**
 * @Author songyitian
 * @date 2023/4/2
 * @time 21:32
 */
public class Employee {
    private String name;
    private String sal;
    private Birthday birthday;

    @Override
    public boolean equals(Object o) {
        if(o == null)return false;
        if(o == this) return true;
        if(o instanceof Employee){
            Employee e = (Employee) o;
            return this.name.equals(e.name)&&this.birthday.equals(e.birthday);
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name,birthday);
    }



    public Employee(String name, Birthday birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public static void main(String[] args) {
        Birthday birthday1 = new Birthday(new Date(2000,11,28));
        Birthday birthday2 = new Birthday(new Date(2000,12,28));
        birthday1.setName("songyitian");
        birthday2.setName("songtitian");
        Employee e1 = new Employee("songyitian",birthday1);
        Employee e2 = new Employee("songyitian",birthday2);
        System.out.println(e1.equals(e2));
        Set set = new HashSet();
        set.add(e1);
        System.out.println(set.add(e2));
        System.out.println(set);
    }
}
