package com.gl.lab.client;

import com.gl.lab.service.BinaryTreeToSkewedTreeService;
import com.gl.lab.service.Node;

public class SkewedTree {

	public static void main(String[] args) {

		BinaryTreeToSkewedTreeService tree = new BinaryTreeToSkewedTreeService();
		BinaryTreeToSkewedTreeService.node = new Node(50);
		BinaryTreeToSkewedTreeService.node.left = new Node(30);
		BinaryTreeToSkewedTreeService.node.right = new Node(60);
		BinaryTreeToSkewedTreeService.node.left.left = new Node(10);
		BinaryTreeToSkewedTreeService.node.right.left = new Node(55);
		int order = 0;
		tree.flattenBTToSkewed(BinaryTreeToSkewedTreeService.node, order);
		tree.traverseRightSkewed(BinaryTreeToSkewedTreeService.headNode);
	}

}
