package com.zhangjikai.tools;

/**
 * @author Jikai Zhang
 * @date 2018-01-22
 */
public class Run {
    
    public static void main(String[] args) {
        String filePath = "D:\\source\\git\\gitee\\thesis\\source\\BGSA.tex";
        int count = CountChineseWords.count(filePath);
        System.out.println(count);
    }
}
