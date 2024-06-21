package main.java;

import java.util.List;

public class User {
    public User(int number) {
        this.number = number;
    }

    private int number;
    private List<Integer> list;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public User(int number, List<Integer> list) {
        this.number = number;
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "number=" + number +
                ", list=" + list +
                '}';
    }

}
