package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
		// ����
		List<String> linkedList = new LinkedList<>();
		
		//��� �߰�
		linkedList.add("ù��°");
		linkedList.add("�ι�°");
		linkedList.add("����°");
		
		System.out.println("linkedList : " + linkedList);
		
		//��� ����
		linkedList.remove(2);
		System.out.println("���� �� : " + linkedList);
		
		//��� �˻�
		boolean isTrue = linkedList.contains("�ټ���°");
		System.out.println("�ι�° ��� ���Կ��� : " + isTrue);
		
		//��� ����
		int size = linkedList.size();
		System.out.println("ũ�� : " + size);
		
		LinkedList<String> linkedList2 = new LinkedList<>();
	}

}