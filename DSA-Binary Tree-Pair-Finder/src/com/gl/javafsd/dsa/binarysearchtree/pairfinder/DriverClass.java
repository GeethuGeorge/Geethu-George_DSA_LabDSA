package com.gl.javafsd.dsa.binarysearchtree.pairfinder;

import com.gl.javafsd.dsa.binarysearchtree.pairfinder.FindSumPairBST.Node;

public class DriverClass {

	public static void main(String[] args) {
		Node root=null;
		FindSumPairBST findSumPairBST=new FindSumPairBST ();
		root=findSumPairBST.insert(root, 40);
		root=findSumPairBST.insert(root, 20);
		root=findSumPairBST.insert(root, 60);
		root=findSumPairBST.insert(root, 10);
		root=findSumPairBST.insert(root, 30);
		root=findSumPairBST.insert(root, 50);
		root=findSumPairBST.insert(root, 70);
		int sum=130;
		findSumPairBST.findPairWithGivenSum(root, sum);
		
	}
	}