package gs1.kingbbode.common.domain;

import gs1.kingbbode.common.enums.Position;

/**
 * Created by YG-MAC on 2017. 6. 4..
 */
public class Member {
    private String name;
    private Position position;

    public Member(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void update(Position position){
        this.position = position;
    }

    @Override
    public String toString() {
        return "이름 : " + this.name + " / 직급 : " + this.position;
    }

    /*
    private Member(Builder builder) {
        this.name = name;
        this.position = position;
    }

    public static class Builder {
        private String name;
        private Position position;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder position(Position position){
            this.position = position;
            return this;
        }

        public Member build(){
            return new Member(this);
        }
    }*/
}
