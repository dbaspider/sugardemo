package levis.ltt.com.sugartest.table;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

public class User extends SugarRecord {
    @Unique
    String name;
    String password;
    String sex;

    public User(){}

    public User(String name, String password, String sex){
        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() + "" +
                ",name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
