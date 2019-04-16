package com.tan.forfun.model;

import java.util.List;

public class TreeModel {
	
	private String id;
	private String parentId;
	private String itemName;
	private String money;
	
	private List<TreeModel> children;

	public TreeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TreeModel(String id, String parentId, String itemName, String money) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.itemName = itemName;
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public List<TreeModel> getChildren() {
		return children;
	}

	public void setChildren(List<TreeModel> children) {
		this.children = children;
	}
	
}
