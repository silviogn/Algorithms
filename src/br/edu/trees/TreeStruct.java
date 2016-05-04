package br.edu.trees;

import java.util.List;

public class TreeStruct<T> {
	
	private T data;
	
	private T parent;
	
	private List<T> childs;

	public TreeStruct(T data, T parent, List<T> childs) {
		super();
		this.data = data;
		this.parent = parent;
		this.childs = childs;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getParent() {
		return parent;
	}

	public void setParent(T parent) {
		this.parent = parent;
	}

	public List<T> getChilds() {
		return childs;
	}

	public void setChilds(List<T> childs) {
		this.childs = childs;
	}
	
}
