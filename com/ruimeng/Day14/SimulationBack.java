package com.ruimeng.Day14;

import java.util.Scanner;

public class SimulationBack {
    private float moneySummary;

    public void showMoney() {
        System.out.println("***当前账户余额为：" + moneySummary + "***");
    }
    public void save(float moneySave) {
        moneySummary += moneySave;
        System.out.println("***存款成功***\n***当前账户余额为：" + moneySummary + "***");
    }

    public boolean withdraw(float moneyWithdraw) {

        boolean state = false;

        if (moneyWithdraw > moneySummary) {
            System.out.println("***账户余额不足，取款失败。***");
        } else {
            moneySummary -= moneyWithdraw;
            System.out.println("***取款成功***\n***当前账户余额为：" + moneySummary + "***");
            state = true;
        }

        return state;
    }

    public static void main(String[] args) {

        SimulationBack sBack = new SimulationBack();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.存款\t2.取款\t3.查询余额\t0.退出");
            System.out.print("请选择你需要办理的业务：");
            int serviceInd = sc.nextInt();
            if (1 == serviceInd) {
                System.out.print("请输入存款金额：");
                float saveMoney = sc.nextFloat();
                sBack.save(saveMoney);
            } else if (2 == serviceInd) {
                System.out.print("请输入取款金额：");
                float withdrawMoney = sc.nextFloat();
                sBack.withdraw(withdrawMoney);
            } else if (3 == serviceInd) {
                sBack.showMoney();
            } else if (0 == serviceInd) {
                break;
            }
        }
    }
}
