package pkg1.arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class TestClass {
	public static void main(String[] args) {
		int day = (int)TimeUnit.SECONDS.toDays(300);
		
		long hours = TimeUnit.SECONDS.toHours((long) 530555.557);
		
		System.out.println("HOURS - "+hours);
		
		Set<String> pendingEmailRequests = new HashSet<>();
		System.out.println(pendingEmailRequests!=null && !pendingEmailRequests.isEmpty() && pendingEmailRequests.size() > 0);
	}
}
