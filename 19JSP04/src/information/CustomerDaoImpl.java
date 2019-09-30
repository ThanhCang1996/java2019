package information;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements ICustomersDao{
	
	@Override
	public List<Customers> showCustomers() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		List<Customers> customersList = new ArrayList<Customers>();
		Connection connection = ConnectionUtils.getMyConnection();
		Statement statement = connection.createStatement();
		String sql_select = "Select id, name, age, address, salary from customers";
		ResultSet rs = statement.executeQuery(sql_select);
		while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
	          int id= rs.getInt(1);
	          String name = rs.getString(2);
	          int age = rs.getInt(3);
	          String add = rs.getString(4);
	          double salary = rs.getDouble(5);
	          Customers ctm = new Customers(id, name, age, add, salary);
	          customersList.add(ctm);
	      }
		return customersList;
	}

	@Override
	public void addCustomer(Customers ctm) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//input();
		Connection connection = ConnectionUtils.getMyConnection();
		Statement statement = connection.createStatement();
		String sql = "insert into customers(name,age,address,salary) values('"+ctm.getName()+"',"
				+ctm.getAge()+",'"+ctm.getAddress()+"',"+ctm.getSalary()+");";
		statement.executeUpdate(sql);
	}

	@Override
	public void updateCustomer(Customers customer) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = ConnectionUtils.getMyConnection();
		Statement statement = connection.createStatement();
		String sql = "UPDATE customers SET NAME = '"+customer.getName()+"', AGE = "+customer.getAge()+", ADDRESS = '"+customer.getAddress()+"', SALARY = " + customer.getSalary()+ " WHERE ID = "+customer.getId();
		statement.executeUpdate(sql);
	}

	@Override
	public void delCustomers(Customers ctm) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = ConnectionUtils.getMyConnection();
		Statement statement = connection.createStatement();
		String sql = "DELETE FROM customers WHERE NAME='"+ctm.getName()+"'";
		statement.executeUpdate(sql);
		
	}

	@Override
	public List<Customers> findCustomers(Customers ctm) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Customers> customersList = new ArrayList<Customers>();
		Connection connection = ConnectionUtils.getMyConnection();
		Statement statement = connection.createStatement();
		String sql_select = "Select id, name, age, address, salary from customers where name = '"+ctm.getName()+"'";
		ResultSet rs = statement.executeQuery(sql_select);
		while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
	          int id= rs.getInt(1);
	          String name = rs.getString(2);
	          int age = rs.getInt(3);
	          String add = rs.getString(4);
	          double salary = rs.getDouble(5);
	          Customers newCustomer = new Customers(id, name, age, add, salary);
	          customersList.add(newCustomer);
	      }
		return customersList;
	}

}
