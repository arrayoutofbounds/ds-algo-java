package Recursion;

import java.io.File;

public class DiskUsage {
	public static void main(String[] args) {
		File root = new File("/Users/anmoldesai/Workspace/eclipse-workspace/ds-algo/src");
		diskUsage(root);
	}
	
	public static long diskUsage(File root) {
		long total = root.length();
		if(root.isDirectory()) {
			for(String childName: root.list()) {
				File child = new File(root, childName);
				total += diskUsage(child);
			}
		}
		System.out.println(total + "\t" + root);
		return total;
	}
}
