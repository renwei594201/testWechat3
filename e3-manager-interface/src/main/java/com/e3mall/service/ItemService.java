package com.e3mall.service;

import java.util.List;

import com.e3mall.common.pojo.EasyUIDataGridResult;
import com.e3mall.pojo.TbItem;

public interface ItemService {
	public TbItem findOne(Long id); 
	public EasyUIDataGridResult findAll(int page,int rows);
}
 