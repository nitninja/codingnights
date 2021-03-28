package com.codingnights;

public class patient {
    private String name;
    private int age;
    private eyes left_eye;
    private eyes right_eye;
    private heart Heart;
    private stomach Stomach;
    private skin Skin;

    public patient(String name, int age, eyes left_eye,eyes right_eye, heart heart, stomach stomach, skin skin) {
        this.name = name;
        this.age = age;
        this.left_eye = left_eye;
        this.right_eye=right_eye;
        Heart = heart;
        Stomach = stomach;
        Skin = skin;
    }

    public patient(String kalinga, int i, eyes eyes, heart heart, stomach stomach, skin skin) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public eyes getLeft_eye() {
        return left_eye;
    }

    public eyes getRight_eye() {
        return right_eye;
    }

    public void setRight_eye(eyes right_eye) {
        this.right_eye = right_eye;
    }

    public void setLeft_eye(eyes left_eye) {
        this.left_eye = left_eye;
    }

    public heart getHeart() {
        return Heart;
    }

    public void setHeart(heart heart) {
        Heart = heart;
    }

    public stomach getStomach() {
        return Stomach;
    }

    public void setStomach(stomach stomach) {
        Stomach = stomach;
    }

    public skin getSkin() {
        return Skin;
    }

    public void setSkin(skin skin) {
        Skin = skin;
    }
}
