package com.example.day16作业.b;

/**
 *
 */
public class Machine {
    //私有化墨盒BoxDemo抽象类和纸张PaperDemo抽象类作为成员变量。
    //虽然抽象类不可以创建具体的实例对象，但可以声明，通过父类的引用指向子类的对象来实现多态。
    //这里存在继承、子类重写父类的方法、父类的引用指向子类的对象，，，是实现多态的三个必要条件。
    private BoxDemo boxDemo;
    private PaperDemo paperDemo;
    public Machine(){
        super();
    }
    public Machine(BoxDemo boxDemo,PaperDemo paperDemo){
        super();
        this.boxDemo=boxDemo;
        this.paperDemo=paperDemo;
    }
    //留下一个公开的startPrint（)方法给其他类调用
    public void startPrint(){
        System.out.println("正在使用"+boxDemo.boxPrint()+paperDemo.paperPrint());
    }

    public BoxDemo getBoxDemo() {
        return boxDemo;
    }

    public void setBoxDemo(BoxDemo boxDemo) {
        this.boxDemo = boxDemo;
    }

    public PaperDemo getPaperDemo() {
        return paperDemo;
    }

    public void setPaperDemo(PaperDemo paperDemo) {
        this.paperDemo = paperDemo;
    }
}
