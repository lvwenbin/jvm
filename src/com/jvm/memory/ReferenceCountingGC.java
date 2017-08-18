package com.jvm.memory;

public class ReferenceCountingGC {
	public Object instance = null;

	private static final int _1MB = 1024 * 1024;
	public static void main(String[] args) {
		ReferenceCountingGC objA = new ReferenceCountingGC();
		ReferenceCountingGC objB = new ReferenceCountingGC();
		objA.instance = objB;
		objB.instance = objA;

		objA = null;
		objB = null;

		// ���������з���GC��objA��objB�Ƿ��ܱ����գ�
		System.gc();

	}

}
