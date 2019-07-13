package com.tan.forfun.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.tan.forfun.dao.TestDao;
import com.tan.forfun.model.TreeModel;
import com.tan.forfun.service.TestService;
import com.tan.forfun.utils.TreeUtils;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {
	
	@Resource
	TestDao testDao;

	@Override
	public List<TreeModel> getTree() {
		List<TreeModel> list = testDao.getTree();
		List<TreeModel> bulidTree = TreeUtils.bulid(list);
		for (TreeModel treeModel : bulidTree) {
			calcTree(treeModel);
		}
		return bulidTree;
	}

	private void calcTree(TreeModel treeModel) {
		if(null != treeModel) {
			List<TreeModel> children = treeModel.getChildren();
			if(!CollectionUtils.isEmpty(children)) {
				for (TreeModel treeModel2 : children) {
					calcTree(treeModel2);
				}
				int intValue = children.stream().map(map -> {
					if(!StringUtils.isEmpty(map.getMoney())) {
						return Integer.parseInt(map.getMoney());
					} return 0;
				}).reduce(0,(a,b) ->  a+b).intValue();
				treeModel.setMoney(String.valueOf(intValue));
			}
		}
	}

}
