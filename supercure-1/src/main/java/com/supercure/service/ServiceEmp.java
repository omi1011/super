package com.supercure.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supercure.dao.DaoCatagory;
import com.supercure.dao.DaoEmp;
import com.supercure.dto.DtoEmp;
import com.supercure.entity.Catagory;
import com.supercure.entity.Employee;
import com.supercure.utility.UserNotFoundException;

@Service
public class ServiceEmp {

	@Autowired
	private DaoEmp repo;
	
	ModelMapper modelMapper = new ModelMapper();
	
	public DtoEmp createEmp(DtoEmp ele) {
		Employee map = modelMapper.map(ele, Employee.class);
		map.setStatus(true);
		Employee savedEmployyee = repo.save(map);
		DtoEmp savedEle = modelMapper.map(savedEmployyee, DtoEmp.class);
		
//		BeanUtils.copyProperties(ele, employee);
//		employee.setStatus(true);
//		Employee saveEmployee = repo.save(employee);
//		BeanUtils.copyProperties(saveEmployee, ele);
		return savedEle;
	}
	
	public List<Employee> getAllEmp() {
		List<Employee> findAllemployee = repo.findAll();
		/* for (Employee emp: findAllemployee) {
			//findAllemployee.removeIf(emp1->emp1.getStatus()==false);
			if(emp.getStatus()==false) {
				 findAllemployee.remove(emp);	
			}
		}
		*/
		List<Employee> collect = findAllemployee.stream().
				filter((emp)->emp.getStatus()==true).
				collect(Collectors.toList());
		
		return collect;
	}
	
	public DtoEmp updateEmp(DtoEmp ele) {
		Employee mapEmp = modelMapper.map(ele, Employee.class);
		Employee saveEmp = repo.save(mapEmp);
		DtoEmp mapDtoEmp = modelMapper.map(saveEmp, DtoEmp.class);
		return mapDtoEmp;
	}
	
	
	public Employee getEmpById(Long id) {
		return repo.findById(id).
			orElseThrow(()->new UserNotFoundException("This user is not present :" +id));
	}
	
	public List<Employee> getEmployeesByCatagoryId(Long catagoryId){
		return repo.findEmployeeByCatagoryId(catagoryId);
	}
	
	
	
	// soft delete from database "deleteById"
	public void deleteEmpById(Long id) {
		Optional<Employee> findById = repo.findById(id);
		findById.orElseThrow(()-> new UserNotFoundException("given id is not present:" +id));
		findById.ifPresent((emp)-> {emp.setStatus(false); repo.save(emp);}  );
		
	}

	
			
	// login
	// how to take two credintials like mail or empCode and passw
	public String getEmpByMailAndPassw(String mail, String passw) {
		Employee findEmployee = repo.findEmployeeByMailAndPassw(mail, passw);
		String msg=null;
		if (findEmployee==null) {
			msg= "invalid credientials";
		}
		else {
			msg="successfully login";	
		}
			return msg;
	}
	
	//===========================================================//

	
	public Employee getByName(String name) {
		// TODO Auto-generated method stub
		return repo.getEmployeeByName(name);
		
	}

	// this is hard delete from database
	public void deleteEmp(Employee ele) {
		repo.delete(ele); // so this is deleted from database.
	}
	
	public void softDeleteEmp(Employee ele) {
//		Employee map = modelMapper.map(ele, Employee.class);
//		map.setStatus(false); // so it will not deleted from database.
		ele.setStatus(false);
		repo.save(ele);
	}

	public List<Employee> getDeletedEmployee(){
		List<Employee> findAllemployee = repo.findAll();
		List<Employee> collect = findAllemployee.stream().
		filter((emp)->emp.getStatus()==false).
		collect(Collectors.toList());
		return collect;
	}
}
