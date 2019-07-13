package com.tan.forfun.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tan.forfun.model.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tan.forfun.model.ResponseObject;
import com.tan.forfun.model.TreeModel;
import com.tan.forfun.service.TestService;

@RestController
@RequestMapping("/api")
public class TestController {
	@Autowired
	TestService testService;
	
	@RequestMapping(value = "test",method = RequestMethod.GET)
	public ResponseObject<Object> index (@RequestBody TestVo params ) {
		ResponseObject<Object> responseObject = new ResponseObject<>();
		responseObject.setMessage(params.getMessage());
		responseObject.setData(params.getIds());
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
