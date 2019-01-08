package cn.itcast.day08.demo01;

/*
字符串常量池：程序当中直接写上的【双引号】字符串，就在【字符串常量池】中。【字符串常量池】中只保存由【双引号】创建的【字符串对象】
【堆】中的【字符串常量池】中的【字符串对象】保存的是也在【堆】中的底层【byte[]数组】的地址值
而【字符串对象】本身也有一个地址，它的地址由在【栈】中的【字符串对象名称】（即引用名）保存

对于【基本类型】来说，==是进行【数值】的比较。
对于【引用类型】来说，==是进行【地址值】的比较。
 */
public class Demo02StringPool {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

}
