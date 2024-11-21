/*
 * @Author: gene.jiang
 * @Date: 2024-07-13 16:00:24
 * @LastEditors: gene.jiang
 * @LastEditTime: 2024-07-13 16:03:16
 * @Description: file content
 * @FilePath: \learning_java\java_basic\002FreshJuiceTest.java
 */
package java_basic;

class FreshJuice{
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("juice.size");        
    }
}
