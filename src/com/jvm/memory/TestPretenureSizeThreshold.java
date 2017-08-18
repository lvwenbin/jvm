package com.jvm.memory;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8  
 * -XX:PretenureSizeThreshold=3145728 
 */
public class TestPretenureSizeThreshold {
	public static final int MB = 1024 * 1024;
	public static void main(String[] args) {
//		byte[] allocation;
//		allocation = new byte[4 *MB];  //直接分配在老年代中
//		 List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();  
//	        for(GarbageCollectorMXBean b : l) {  
//	            System.out.println(b.getName());  
//	        }  
		
		
		
	}

}
