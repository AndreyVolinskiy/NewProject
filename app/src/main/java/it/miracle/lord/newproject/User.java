package it.miracle.lord.newproject;

import io.realm.RealmObject;

/**
 * Created by Lord_ on 23.02.2018.
 */
public class User extends RealmObject {
    private String name;

    public User() {
    }

    public User(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
