package com.example.day24.c;

/**
 *
 */
public class tetx001 {
    public static void main(String[] args) {
        int money = 20, price = 3;   //0.5分
        // temp表示每一次购买的可乐瓶数
        int temp = 0;
        // change表示每次购买完可乐剩下的钱
        int change = 0;
        // sum表示总的可乐瓶数
        int sum = 0;   //0.5分
        // 如果钱数大于可乐价格
        while (money >= price) {//0.5分
            // 购买可乐
            temp = money / price; //0.5分
            // 总可乐瓶数增加
            sum += temp; //0.5分
            // 计算买可乐剩下的钱
            change = money % price; //0.5分
            // 兑换可乐瓶子，计算剩余的总钱数
            money = temp + change; //0.5分
        }
        // 输出结果
        System.out.println(sum); //0.5分
    }
}
