package com.e3mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3mall.common.pojo.EasyUIDataGridResult;
import com.e3mall.pojo.TbItem;
import com.e3mall.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/findOne/{id}")
	@ResponseBody
	public TbItem findOne(@PathVariable(value="id") Long id){

		TbItem findOne = itemService.findOne(id);
		System.out.println(findOne);
		return findOne;
	}
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult findAll(@RequestParam(value="page",defaultValue="1") int page,@RequestParam(value="rows",defaultValue="10") int rows){
		return itemService.findAll(page, rows);
	}
}
