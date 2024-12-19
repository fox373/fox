package com.bjsxt;

/**
 * 实体类
 */
public class Person {
    private int id;
    private String name;
    private String age;
    private String sex;
    private String telNum;
    private String address;

    public Person() {
    }

    public Person(String name, String age, String sex, String telNum, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.telNum = telNum;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    // public String toString() {
    // StringBuffer sb = new StringBuffer();
    // sb.append("id").append(this.id).append("#").append("\t");
    // sb.append("name").append(this.name).append("\t\t");
    // sb.append("age").append(this.age).append("\t\t");
    // sb.append("sex").append(this.sex).append("\t\t");
    // sb.append("phone number").append(this.telNum).append("\t\t");
    // sb.append("address").append(this.address);
    // return sb.toString();
    // }
    public String toString() {
        // 使用 String.format 来格式化输出并确保每个字段对齐
        return String.format("id: %-5d name: %-20s age: %-3s sex: %-5s phone number: %-15s address: %-30s",
                this.id, this.name, this.age, this.sex, this.telNum, this.address);
    }
}
