package com.tan.forfun.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tan.forfun.model.ResponseObject;
import com.tan.forfun.model.TreeModel;
import com.tan.forfun.service.TestService;

@RestController
@RequestMapping("/api")
public class TestController {
	@Autowired
	TestService testService;
	
	@RequestMapping("test")
	public ResponseObject<Object> index () {
		ResponseObject<Object> responseObject = new ResponseObject<>();
		responseObject.setMessage("6666");
		Map<String, String> hashMap = new HashMap<String ,String >();
		hashMap.put("1", "1");
		responseObject.setData(hashMap);
		return responseObject;
	}
	@RequestMapping("treesGet")
	public ResponseObject<Object> getTree () {
		ResponseObject<Object> responseObject = new ResponseObject<>();
		List<TreeModel> tree = testService.getTree();
		responseObject.setData(tree);
		responseObject.setMessage("6666");
		return responseObject;
	}
}
