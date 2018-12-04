package org.shzhong.keyword;

//final可以修饰类，方法，域。
//final的使用很简单，合理且精确的使用final需要些经验和原理支撑。
//final要从设计角度和效率角度综合考虑，对于方法和类来说，切勿滥用final。
//final修饰域这是很有效的做法，可以适当减轻系统计算的负担。
//final还有一部分内容涉及到并发，可能是我没有涉及到的。
//final和private可以使用，编译器不会报错，但是没有什么意义。
//final不能和abstract一起使用，因为语义是冲突的，很好理解。

public class FinalKey {


    public FinalKey() {
        final int age = (int) Math.random();
    }

    public static void main(String[] args) {
//        error
//        final int myInt = 1;
//        myInt = 2;


        //succuss
        final StringBuilder sb = new StringBuilder("Java");
        sb.append("Script");
        System.out.println(sb);  //resultJavaScript

    }
}

//如上代码所示， 虽然我们用final修饰变量，但仍旧无法阻止变量内在值的改变。
//使用final能保证变量不能改变引用的目标，却不能保证变量所引用的目标本身的变化。
//因为对于基本类型，我们可以把变量看作是变量值的本身；
//而对于引用类型变量，变量和变量的值需要区分看待，它们只是以某种方式被关联起来了而已，事实上它们是不同的东西，所以final无法同时作用于两者身上。
//https://zhuanlan.zhihu.com/p/33083924