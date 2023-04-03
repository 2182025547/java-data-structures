package zzuli.learnjava.equals__;

import java.util.Date;
import java.util.Objects;

/**
 * @Author songyitian
 * @date 2023/4/2
 * @time 21:32
 */
public class Birthday {
    private Date date;
    private String name;
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Birthday(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birthday birthday = (Birthday) o;
        return Objects.equals(date, birthday.date) && Objects.equals(name, birthday.name);
    }
}
