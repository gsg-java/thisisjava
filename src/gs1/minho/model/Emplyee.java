package gs1.minho.model;

import gs1.minho.enums.CompanyPosition;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */


public class Emplyee {
    private int id;
    private String name;
    private CompanyPosition position;

    public Emplyee() {
    }

    public Emplyee(String name, CompanyPosition position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyPosition getPosition() {
        return position;
    }

    public void setPosition(CompanyPosition position) {
        this.position = position;
    }

    public void changePosition(CompanyPosition currnetPosition, CompanyPosition newPosition) {

    }

    @Override
    public String toString() {
        return "이름 : " + this.name + " 직책 : " + this.position;
    }
}

