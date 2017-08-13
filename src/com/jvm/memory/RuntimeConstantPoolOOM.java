package com.jvm.memory;

import java.util.ArrayList;
import java.util.List;
/**
 * VM Args��-XX:PermSize=10M -XX:MaxPermSize=10M
 * @author lvwenbin
 */
public class RuntimeConstantPoolOOM {

//	public static void main(String[] args) {
//		 // ʹ��List�����ų��������ã�����Full GC���ճ�������Ϊ
//        List<String> list = new ArrayList<String>();
//        // 10MB��PermSize��integer��Χ���㹻����OOM��
//        int i = 0; 
//        while (true) {
//            list.add(String.valueOf(i++).intern());
//        }
//        
//        
//
//	}
	
	public static void main(String[] args) {
        String str1 = new StringBuilder("�й�").append("���㵺").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
	}
}
