package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Student;
import com.web.repo.StudentRepo;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepo repo; 
	@Override
	public Student savestudent(Student student) {
		int tot=0;
		double p=0.0;
		String g=null,r=null;
		tot=student.getHibernate()+student.getSpring()+student.getSpringboot();
		p=tot/3;
		if(p>=70)
		{
			g="A grade";
		}
		else if(p>=60)
		{
			g="B grade";
		}
		else if(p>=50)
		{
			g="C grade";
		}
		else
		{
			g="D grade";
		}
		if(student.getHibernate()>=35&&student.getSpring()>=35&&student.getSpringboot()>=35)
		{
			r="Pass";
		}
		else
		{
			r="Fail";
		}
		student.setTotal(tot);
		student.setPercentage(p);
		student.setGrade(g);
		student.setResult(r);
		Student save=repo.save(student);
		return save;
		
	}
	@Override
	public List<Student> getallstudents() {
	List<Student> allstudents=(List<Student>) repo.findAll();
	return allstudents;
	}
	@Override
	public void deletestudent(int stdId) {
    repo.deleteById(stdId);
	}
	@Override
	public Student getstudent(int stdId) {
		Student get=repo.findById(stdId).get();
		return get;
	}
	@Override
	public Student updateestudent(Student student) {
		int tot=0;
		double p=0.0;
		String g=null,r=null;
		tot=student.getHibernate()+student.getSpring()+student.getSpringboot();
		p=tot/3;
		if(p>=70)
		{
			g="A grade";
		}
		else if(p>=60)
		{
			g="B grade";
		}
		else if(p>=50)
		{
			g="C grade";
		}
		else
		{
			g="D grade";
		}
		if(student.getHibernate()>=35&&student.getSpring()>=35&&student.getSpringboot()>=35)
		{
			r="Pass";
		}
		else
		{
			r="Fail";
		}
		student.setTotal(tot);
		student.setPercentage(p);
		student.setGrade(g);
		student.setResult(r);
		Student save=repo.save(student);
		return save;
	}
}


