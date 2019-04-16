package com.tan.forfun.utils;

import java.util.ArrayList;
import java.util.List;

import com.tan.forfun.model.TreeModel;

public class TreeUtils {
		 
		  /** 
	     * 两层循环实现建树 
	     * @param treeNodes 传入的树节点列表 
	     * @return 
	     */  
	    public static List<TreeModel> bulid(List<TreeModel> treeNodes) {  
	  
	        List<TreeModel> trees = new ArrayList<TreeModel>();  
	  
	        for (TreeModel TreeModel : treeNodes) {  
	  
	            if ("0".equals(TreeModel.getParentId())) {  
	                trees.add(TreeModel);  
	            }  
	  
	            for (TreeModel it : treeNodes) {  
	                if (it.getParentId().equals(TreeModel.getId()) ) {  
	                    if (TreeModel.getChildren() == null) {  
	                        TreeModel.setChildren(new ArrayList<TreeModel>());  
	                    }  
	                    TreeModel.getChildren().add(it);  
	                }  
	            }  
	        }  
	        return trees;  
	    }  
	  
	    /** 
	     * 使用递归方法建树 
	     * @param treeNodes 
	     * @return 
	     */  
	    public static List<TreeModel> buildByRecursive(List<TreeModel> treeNodes) {  
	        List<TreeModel> trees = new ArrayList<TreeModel>();  
	        for (TreeModel TreeModel : treeNodes) {  
	            if ("0".equals(TreeModel.getParentId())) {  
	                trees.add(findChildren(TreeModel,treeNodes));  
	            }  
	        }  
	        return trees;  
	    }  
	  
	    /** 
	     * 递归查找子节点 
	     * @param treeNodes 
	     * @return 
	     */  
	    public static TreeModel findChildren(TreeModel TreeModel,List<TreeModel> treeNodes) {  
	    	TreeModel.setChildren(new ArrayList<TreeModel>());
	 
	        for (TreeModel it : treeNodes) {  
	            if(TreeModel.getId().equals(it.getParentId())) {  
	                if (TreeModel.getChildren() == null) {  
	                    TreeModel.setChildren(new ArrayList<TreeModel>());  
	                }  
	                TreeModel.getChildren().add(findChildren(it,treeNodes));  
	            }  
	        }  
	        return TreeModel;  
	    }  
}
