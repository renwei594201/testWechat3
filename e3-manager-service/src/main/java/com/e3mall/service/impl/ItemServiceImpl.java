package com.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3mall.common.pojo.EasyUIDataGridResult;
import com.e3mall.mapper.TbItemMapper;
import com.e3mall.pojo.TbItem;
import com.e3mall.pojo.TbItemExample;
import com.e3mall.service.ItemService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class ItemServiceImpl implements ItemService {
	
	
	//@Qualifier("")
	//@Resource
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem findOne(Long id) {
		return itemMapper.selectByPrimaryKey(id);
	}

	@Override
	public EasyUIDataGridResult findAll(int page, int rows) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, rows);
		Page<TbItem> pageInfo = (Page<TbItem>)itemMapper.selectByExample(new TbItemExample());
		return new EasyUIDataGridResult(pageInfo.getTotal(),pageInfo.getResult());
	}

}
