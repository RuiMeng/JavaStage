/**
 * @author RuiMeng
 * @date 20180829
 *
 * @CheckPoint
 *
 * java 类中的 public、protected、private 的作用。
 */

package com.ruimeng.Day12;

import java.util.Scanner;

public class AtmSimulation {

    private boolean customerLogin() {

        String customerPassword = "RuiMeng";
        boolean loginState = false;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入交易密码：");
            String passwordInput = sc.next();
            if (passwordInput.equals(customerPassword)) {
                loginState = true;
                break;
            } else {
                if (i != 2) {
                    System.out.println("密码错误，剩余 " + (2 - i) +" 次机会。请重新输入密码。");
                } else {
                    System.out.println("您已输错误密码 3 次密码，请取卡。");
                }
            }
        }

        return loginState;
    }

    private void withdrawals() {
        int moneyInput;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("请输入取款金额：");
            moneyInput = sc.nextInt();

            if (moneyInput <= 1000 && moneyInput > 0 && (moneyInput % 100) == 0) {
                System.out.println("您取了 "  + moneyInput +" 元，交易完成，请取卡。");
                break;
            }
            else {
                System.out.println("您输入的金额不合法，请重新输入。");
            }
        }
    }

    public static void main(String[] args) {
        AtmSimulation atm = new AtmSimulation();
        if (atm.customerLogin()) {
            atm.withdrawals();
        }
    }
}
