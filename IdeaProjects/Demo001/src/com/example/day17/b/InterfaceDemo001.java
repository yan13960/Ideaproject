package com.example.day17.b;

/**
 *接口
 * 1.接口不可以被实例化 也就是new
 * 2.接口不能有构造方法
 * 3.接口不能被继承 也就是子类这样写extends InterfaceDemo001
 * 4。子类必需通过这种方法继承 implements InterfaceDemo001
 * 5.接口中没有普通方法 接口就是一种约束 约定
 * 6.接口中定义的抽象方法之类必需实现了
 * 7接口中的变量都是静态变量
 */
public interface InterfaceDemo001 {
    //静态常量
    public  static  final int  MAX_ID=100;

    //这也是 静态常量  如果不写 public  static  final 系统默认加上
    int  MIN_ID=10;

    /*public InterfaceDemo001(){
        //接口不能有构造方法
    }*/
  /* public  void addUser(){
        //接口中没有普通方法
    }*/

    //这只有定义（就是一种规范），没有具体实现 ，具体子类去实现
    //如果开发，不写接口能不能完成项目，100%可以，但公司都是接口开发
    public abstract int addUser(String name,String pwd);
    //如果我们不写 public abstract 系统默认加上
    void  getCCC();
    //开发过种中大家都这样写 这是标准写法
    public  int  deleteUser(int id);

}
