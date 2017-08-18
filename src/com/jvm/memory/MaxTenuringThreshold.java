package com.jvm.memory;
/**
 * VM������-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
 * -XX:+PrintTenuringDistribution
 */
public class MaxTenuringThreshold {
	public static final int MB = 1024 * 1024;
	public static void main(String[] args) {
		byte[] allocation1, allocation2, allocation3;
		allocation1 = new byte[MB / 2];  // ʲôʱ����������������XX:MaxTenuringThreshold����
		//allocation2 = new byte[4*MB];
		allocation3 = new byte[4*MB];
		allocation3 = null;
		allocation3 = new byte[4*MB];
		System.out.println(allocation1);
		//System.out.println(allocation2);
		System.out.println(allocation3);
	}

}
