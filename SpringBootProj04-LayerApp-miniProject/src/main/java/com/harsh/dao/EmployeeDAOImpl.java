package com.harsh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.harsh.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {


	private static final String GET_EMPS_QUERY = "SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";

	@Autowired
	private DataSource ds;


	@Override
	public List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list = new ArrayList<>();
		
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMPS_QUERY);) {

			// set value to param
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);

			// exe query
			try (ResultSet rs = ps.executeQuery()) {

				// copy eacy record of rs obj to model class
				while (rs.next()) {
					Employee emp = new Employee();

					emp.setEId(rs.getInt(1));
					emp.setEName(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));

					list.add(emp);
				}

			} catch (Exception e) {
				e.printStackTrace();
				throw e;		//exception rethrowing for exception propagation
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;		//exception rethrowing for exception propagation
		}
		return list;
	}

}
