package information;
import java.sql.SQLException;
import java.util.List;

public interface ICustomersDao {
	List<Customers> showCustomers() throws ClassNotFoundException, SQLException ;
	void addCustomer(Customers ctm) throws ClassNotFoundException, SQLException;
	void updateCustomer(Customers ctm) throws ClassNotFoundException, SQLException;
	void delCustomers(Customers ctm) throws ClassNotFoundException, SQLException;
	List<Customers> findCustomers(Customers ctm) throws ClassNotFoundException, SQLException;
}
