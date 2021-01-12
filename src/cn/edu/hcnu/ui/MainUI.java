package cn.edu.hcnu.ui;

import java.util.Scanner;

public class MainUI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//接受键盘输入
        while (true) {
            System.out.println("请输入相应的数字进行操作：");

            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");
            System.out.println("按6，推出系统");

            int choice = sc.nextInt();

            if (choice == 1) {
                /*FLIGHT_ID           VARCHAR2(32)
                PLANE_TYPE          VARCHAR2(20) Y
                SEATS_NO            VARCHAR2(20) Y
                TOTAL_SEATS_NUM     NUMBER(3)    Y
                DEPARTURE_AIRPORT   VARCHAR2(30) Y
                DESTINATION_AIRPORT VARCHAR2(30) Y
                DEPARTURE_TIME      VARCHAR2(20) Y*/
                System.out.print("请输入机型：");
                String planeType=sc.next();


            }
        }
    }
}