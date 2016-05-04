package br.edu.trees;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {

	private TreeStruct<T> root;
	
	private List<TreeStruct<T>> childs;
	
	public Tree(T data){
		this.root = new TreeStruct<T>(data, null, null);
		this.childs = new ArrayList<TreeStruct<T>>();
	}
	
	
	public TreeStruct<T> getRoot() throws IllegalArgumentException {
		if (root == null){
			throw new IllegalArgumentException("The root element is null");
		}
		return null;
	}
	
	
}
