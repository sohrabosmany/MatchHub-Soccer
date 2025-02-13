package com.project.soccer;

public class CatTest {
    String fact;
    int length;

    public CatTest() {

    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "catTest{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }
}
