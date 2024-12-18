package com.bjsxt;

import java.util.Scanner;

/**
 * 数据校验类
 */
public class TelNoteRegx {
    /**
     * 对菜单项进行校验
     */
    public int  menuItemValidate (int min , int max){
        //定义菜单项的正则表达式
        String regex = "[1-9]";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please enter the correct number, minimum:"+min+"\t"+"maximum:"+max);
            String input = scanner.nextLine();
            if(input.matches(regex)){
                int inputNum = Integer.parseInt(input);
                if(inputNum >= min && inputNum <= max){
                    return inputNum;
                }else{
                    System.out.println("The menu item you have entered does not match, please re-enter it.");
                }
            }else{
                System.out.println("Wrong number entered, please check!");
            }
        }

    }

    /**
     * 对用户输入姓名的验证
     * 字母可以是大写或者小写，长度1~10之间
     */
    public String nameValidate (){
        //验证姓名的正则表达式
        String regex ="[a-zA-Z]{1,10}";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please enter your name in the following format: upper or lower case letters between 1 and 10");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("The name you are currently entering is incorrect, please re-enter it!");
            }
        }

    }

    /**
     * 对用户输入年龄验证
     * 年龄的格式要求：10~99之间的
     */
    public String ageValidate (){
        //对年龄校验的正则表达式
        String regex ="[1-9]\\d";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please enter your age in the format between 10 and 99");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("You have entered your age in the wrong format, please re-enter!");
            }
        }
    }
    /**
     * 对用户输入性别的验证
     * 性别的输入要求：男可以是（m或 M）女（f或 F）
     */
    public String sexValidate (){
       //对性别验证的正则表达式
        String regex = "[m|M|f|F]";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter gender: male (m or M) female (f or F)");
            String input = scanner.nextLine();
            if (input.matches(regex)){
                return input;
            }else{
                System.out.println("There is an error in the format of the gender input, please re-enter it!");
            }
        }

    }

    /**
     * 对用户输入电话号码验证
     * 电话号码要求：允许带有区号的座机号，允许手机号
     */
    public String telNumValidate() {
        String regex = "(\\d{3,4}-\\d{7,8})|(1\\d{10})";
        Scanner scanner = new Scanner(System.in);
        String validPhoneNumber = null;

        while (true) {
            System.out.println("Please enter a phone number: either a landline number or a cell phone number (enter 'exit' to exit):");
            String input = scanner.nextLine();

            // 增加退出判断
            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exit Input");
                break;
            }

            if (input.matches(regex)) {
                // 存储有效的电话号码
                validPhoneNumber = input;
                System.out.println("The entered phone number is valid:" + validPhoneNumber);
                break; // 成功验证后退出循环
            } else {
                System.out.println("The phone number entered was incorrect, please re-enter it!");
            }
        }
        return validPhoneNumber;
    }

    /**
     * 对用户输入地址验证
     * 地址格式要求：字母或者数字，长度1，50
     */
    public String addressValidate () {
       //对地址验证的正则表达式
        String regex = "\\w{1,50}";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please enter the address: in alphanumeric or numeric format Length 1-50");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("The address you have entered is in the wrong format, please re-enter it");
            }
        }
    }

}
