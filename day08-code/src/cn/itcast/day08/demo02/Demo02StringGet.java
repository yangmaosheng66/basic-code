package cn.itcast.day08.demo02;

/*
String 当中与获取相关的常用方法有：

public int Length()：获取字符串当中含有的【字符个数】，拿到字符串的【长度】。
public String concat(String str)：将当前字符串和参数字符串【拼接】成为返回值新的字符串。
public char charAt(int index)：获取【指定】索引位置的【单个字符】。(索引从0开始)
public int indexOf(String str)：查找参数字符串在本字符串当中【首次】出现的【索引位置】，如果没有返回-1值。
 */
public class Demo02StringGet {

    public static void main(String[] args) {
        // 获取字符串长度
        int length = "abcdefg".length();
        System.out.println("字符串的长度是：" + length); // 7

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1); // Hello，原封不动
        System.out.println(str2); // World，原封不动
        System.out.println(str3); // HelloWorld，【新的】字符串
        System.out.println("===========");

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);
        System.out.println("===========");

        // 查找参数字符串在本来字符串当中出现的【第一次】索引位置
        // 如果根本没有，返回-1值
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次出现的索引值是：" + index); // 2

        System.out.println("HelloWorld".indexOf("abc")); // -1
    }

}
