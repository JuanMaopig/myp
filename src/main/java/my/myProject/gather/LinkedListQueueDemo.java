package my.myProject.gather;

import java.util.LinkedList;

public class LinkedListQueueDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// 队列，先进先出
		list.offer("西游记");
		list.offer("三国演义");
		list.offer("石头记");
		list.offer("水浒传");
		System.out.println(list);
		// 出队列
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());

		System.out.println(list.size());

		System.out.println(list.peek()); // 获取队列的头元素，但是不删除
		System.out.println(list.peekFirst()); // 获取队列的头元素，但是不删除
		System.out.println(list.peekLast()); // 获取队列的最后一个元素但是不删除

	}

}
