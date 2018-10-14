package com.qp.service.impl;

import java.util.List;

import com.qp.dao.AdminInfoDao;
import com.qp.dao.impl.AdminInfoDaoImp;
import com.qp.entity.AdminInfo;
import com.qp.service.AdminService;

public class AdminServiceImp implements AdminService {

	@Override
	public List<AdminInfo> queryAdmin(String sql, Object... values) {
		// TODO Auto-generated method stub
		AdminInfoDao aid=new AdminInfoDaoImp();
		List<AdminInfo> list=aid.queryAdmin(sql, values);
		return list;
	}

	@Override
	public int updateUser(String sql, Object... values) {
		// TODO Auto-generated method stub
		AdminInfoDao aid=new AdminInfoDaoImp();
		return aid.updateUser(sql, values);
	}
	
}
