package com.jvm.memory;

import java.util.ArrayList;
import java.util.List;
/**
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 下述代码执行时有较大的风险,可能会导致操作系统假死。
 * @author lvwenbin
 */
public class HeapOOM {
	static class OOMObject {
    }

	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }

	}

}
