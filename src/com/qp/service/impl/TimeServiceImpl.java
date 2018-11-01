package com.qp.service.impl;

import com.qp.dao.TimeDao;
import com.qp.dao.impl.TimeDaoImpl;
import com.qp.service.TimeService;

public class TimeServiceImpl implements TimeService{
	TimeDao timedao=new TimeDaoImpl();

	@Override
	public int insertTime(String Time) {
		// TODO Auto-generated method stub
		return timedao.insertTime(Time);
	}

}
