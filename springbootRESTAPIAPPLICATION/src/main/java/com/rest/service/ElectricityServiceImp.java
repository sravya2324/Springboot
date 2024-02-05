package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Electricity;
import com.rest.repo.ElectricityRepo;

@Service
public class ElectricityServiceImp implements ElectricityService {
   @Autowired
   private ElectricityRepo electricityrepo;
	@Override
	public Electricity saveRecord(Electricity electricity) {
		int unts=0;
		double total=0.0;
		unts=electricity.getCurrent_reading()-electricity.getPrevious_reading();
		electricity.setUnits(unts);
		if(unts<300)
		{
			total=unts*1.75;
		}
		else if(unts>=300&&unts<500)
		{
			total=unts*3.75;
		}
		else if(unts>=500)
		{
			total=unts*7.35;
		}
		electricity.setUnits(unts);
		electricity.setTotalBill(total);
		Electricity e=electricityrepo.save(electricity);
		return e;
	}
	@Override
	public Electricity getOneRecord(int cid) {
	Electricity get=electricityrepo.findById(cid).get();
	return get;
	}
	@Override
	public List<Electricity> getAllRecord() {
		List<Electricity> getAll=electricityrepo.findAll();
		return getAll;
	}

	@Override
	public Electricity updateRecord(Electricity electricity, int cid) {
	Electricity oldRecord=electricityrepo.findById(cid).get();
	oldRecord.setCname(electricity.getCname());
	oldRecord.setCurrent_reading(electricity.getCurrent_reading());
	oldRecord.setPrevious_reading(electricity.getPrevious_reading());
	int unts=0;
	double total=0.0;
	unts=electricity.getCurrent_reading()-electricity.getPrevious_reading();
	electricity.setUnits(unts);
	if(unts<300)
	{
		total=unts*1.75;
	}
	else if(unts>=300&&unts<500)
	{
		total=unts*3.75;
	}
	else if(unts>=500)
	{
		total=unts*7.75;
	}
	oldRecord.setUnits(unts);
	oldRecord.setTotalBill(total);
	Electricity e=electricityrepo.save(oldRecord);
		return e;
	}

	@Override
	public void deleteRecord(int cid) {
     electricityrepo.deleteById(cid);
	}
}
