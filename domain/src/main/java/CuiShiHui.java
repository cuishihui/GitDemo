import java.util.Objects;

public class CuiShiHui {
    public String name ;
    public Long age;
    public Boolean sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuiShiHui cuiShiHui = (CuiShiHui) o;
        return Objects.equals(name, cuiShiHui.name) &&
                Objects.equals(age, cuiShiHui.age) &&
                Objects.equals(sex, cuiShiHui.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public CuiShiHui() {
    }

    public CuiShiHui(String name, Long age, Boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
