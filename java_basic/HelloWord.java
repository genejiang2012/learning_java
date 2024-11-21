/*
 * @Author: gene.jiang
 * @Date: 2024-07-13 15:52:09
 * @LastEditors: gene.jiang
 * @LastEditTime: 2024-07-13 16:03:04
 * @Description: file content
 * @FilePath: \learning_java\java_basic\001HelloWord.java
 */


 package java_basic;

 public class HelloWord{
    /**
     * 程序的入口点。
     * 这个方法是所有Java应用程序的起点，无论它们的复杂度如何。当Java虚拟机启动时，它会查找并执行这个方法。
     * 
     * @param args 命令行参数。这些参数是在启动Java应用程序时从命令行传递给它的字符串数组。
     *             在这个简单的示例中，我们没有使用这些参数，因此参数数组被直接传递给了系统输出语句。
     */
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
 }