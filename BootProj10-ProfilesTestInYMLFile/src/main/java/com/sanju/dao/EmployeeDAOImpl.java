package com.sanju.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanju.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPS_BY_DESGS = "SELECT  EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	@Autowired
	private DataSource dataSource;

	@Override
	public List<Employee> getEmployeesByDesgs(String Desg1, String Desg2, String Desg3) throws Exception {
		System.out.println("EmployeeDAOImpl.getEmployeesByDesgs():: DataSource class name" + dataSource.getClass());
		List<Employee> list = null;

		try (Connection con = dataSource.getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(GET_EMPS_BY_DESGS)) {
			preparedStatement.setString(1, Desg1);
			preparedStatement.setString(2, Desg2);
			preparedStatement.setString(3, Desg3);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {
				list = new ArrayList<>();
				while (resultSet.next()) {
					Employee employee = new Employee();
					employee.setEno(resultSet.getInt(1));
					employee.setEName(resultSet.getString(2));
					employee.setDesg(resultSet.getString(3));
					employee.setSalary(resultSet.getDouble(4));
					employee.setDeptNo(resultSet.getInt(5));

					list.add(employee);
				}

			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
