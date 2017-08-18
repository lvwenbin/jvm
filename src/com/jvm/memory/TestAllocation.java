package com.jvm.memory;

/**
 * @author Administrator
 *-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 */
public class TestAllocation {
	public static final int MB = 1024 * 1024;
	public static void main(String[] args) {
		byte[] allocation1, allocation2, allocation3, allocation4;
	 	allocation1 = new byte[2 *MB];
	 	allocation2 = new byte[2 *MB];
	 	allocation3 = new byte[2 *MB];
	 	allocation4 = new byte[4 *MB];  // 出现一次Minor GC
	 	System.out.println(MB);
	 	int[] a=new int[4];
	 	System.out.println(a[2]);
	 	byte b= (byte) 127;
	 	System.out.println(b);

	}

}
