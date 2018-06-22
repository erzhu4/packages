import java.util.*;
import mypackages.*;

class Test {
	
// %%%%%%%%%%%%%%%%%%%%%%

// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

	public static void main(String[] args){
		System.out.println("hello from java");

		MultiPurposeLinkedList list = new MultiPurposeLinkedList();

		list.append(2);
		list.append(4);
		list.append(34);
		list.append(22);
		list.append(6);

		String arr = Arrays.toString(list.toArr());
		System.out.println(arr);
		list.prepend(100);
		list.prepend(90);

		arr = Arrays.toString(list.toArr());
		System.out.println(arr);

		int a = list.pop();
		System.out.println("popped " + a);
		int b = list.pop();
		System.out.println("popped " + b);
		arr = Arrays.toString(list.toArr());
		System.out.println(arr);

		a = list.takeFirst();
		System.out.println("took first element: " + a);
		b = list.takeFirst();
		System.out.println("took first element: " + b);
		arr = Arrays.toString(list.toArr());
		System.out.println(arr);

		System.out.println("append 1000 and 543");
		list.append(1000);
		list.append(543);
		System.out.println("prepend 11 and 12");
		list.prepend(11);
		list.prepend(12);
		arr = Arrays.toString(list.toArr());
		System.out.println(arr);
	}

}