package com.sanju.repository;

import java.util.List;
import java.util.Optional;
import org.hibernate.type.TrueFalseConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sanju.entities.Customer;

import jakarta.transaction.Transactional;

public interface ICustRepository extends JpaRepository<Customer, Integer> {

//	@Query("from Customer where billAmt >=?1 and billAmt <= ?2")
//	@Query("from com.sanju.entities.Customer where billAmt >=?1 and billAmt <= ?2")	
//	@Query("from Customer cust where cust.billAmt >=?1 and cust.billAmt <= ?2")	
//	@Query("from Customer cust where cust.billAmt >=? and cust.billAmt <= ?")	//: java.lang.IllegalArgumentException: JDBC style parameters (?) are not supported for JPA queries
//	@Query("select cust from Customer cust where cust.billAmt >=?1 and cust.billAmt <= ?2")
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

	@Query("from Customer cust where cust.billAmt >=:fromAmt and cust.billAmt <= :toAmt")
	public List<Customer> searchCustomersByBillAmount(@Param("fromAmt") double fromBillAmt,
			@Param("toAmt") double toBillAmt);

//	@Query("from Customer cust where cust.billAmt >=:fromBillAmt and cust.billAmt <= :toBillAmt")
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	@Query("from Customer where billAmt >=?1 and billAmt <= ?3") //Exception: Unexpected gap in ordinal parameter labels [1 -> 3] : [1,3]
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt, double toBillAmt2);

//	@Query("from Customer where billAmt >=?0 and billAmt <= ?1") // Exception: Expected ordinal parameter labels to
//																	// start with 1, but found - 0
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	@Query("from Customer where billAmt >=?2 and billAmt <= ?1") // Valid: java method arg values goes to query params in reverse order
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	@Query("from Customer where billAmt >=?1 and billAmt <= :toBillAmt") // Exception: but parameter 'Optional[fromBillAmt]' not found in annotated query 'from Customer where billAmt >=?1 and billAmt <= :toBillAmt'
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	@Query("from Customer where billAmt >=:fromBillAmt and billAmt <= ?2") // Exception: but parameter 'Optional[fromBillAmt]' not found in annotated query 'from Customer where billAmt >=:fromBillAmt and billAmt <= ?2
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	@Query("from Customer where billAmt >=:fromBillAmt and billAmt <= ?2") // Exception: but parameter 'Optional[fromBillAmt]' not found in annotated query 'from Customer where billAmt >=:fromBillAmt and billAmt <= ?2
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	@Query("from Customer where billAmt >=? and billAmt <= ?") // Exception: JDBC style parameters (?) are not supported for JPA queries
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	@Query("from ?1 where billAmt >=?2 and billAmt <= ?3") // Exception: we can't take HQL keywords as the params
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	@Query("from Customer where billAmt >=?1 and billAmt <= ?1") // Valid: but meaning less
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	@Query("from Customer ?1 billAmt >=?2 and billAmt <= ?3") // Exception: Exception: we can't take HQL keywords as the params
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	@Query("from Customer where :prop >=:fromBillAmt and :prop <= :toBillAmt") // Exception: Exception: we can't take HQL keywords as the params
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

	@Query("from Customer where caddr in(:addr1, :addr2) order by caddr")
	public List<Customer> searchCustomersByAddress(String addr1, String addr2);

	@Query("from Customer where billAmt between :startBillAmt and :endBillAmt")
	public List<Object[]> showCustomersDataByBillAmt(Float startBillAmt, Float endBillAmt);

	@Query("select cid, cname from Customer where cid between :startCustId and :endCustId")
	public List<String> searchAllCustomersByCustID(Integer startCustId, Integer endCustId);

	@Query("from Customer where cname=:name")
	public Optional<Customer> showCustomerInfoByName(String name);

	@Query("select cname, caddr, billAmt from Customer where cname=:name")
	public Object showCustomerDataByName(String name);

	@Query("select caddr from Customer where cname=:name")
	public String showAddressByName(String name);

//	-----------------------------Aggregate Functions----------------------------
	@Query("select count(distinct cname) from Customer")
	public int fetchCustomersNameCount();

	@Query("select count(*), max(billAmt), min(billAmt), avg(billAmt), sum(billAmt) from Customer")
	public Object fetchAggregateData();

//	-----------------------------non-select operations----------------------------

	@Query("update Customer set billAmt = billAmt - 200")
	@Modifying
	@Transactional
	public int discountOfTwoHundredForEachCustomer();

	@Query("delete from Customer where billAmt>=:start and billAmt<=:end")
	@Transactional
	@Modifying
	public int revomeCustomersByRange(Double start, Double end);

//	-----------------------------native sql queries----------------------------
	@Query(nativeQuery = true, value = "insert into customer_details(cust_id , cust_bill_amt, cust_addr, cust_name) values ((select next_val from cust_seq_01), :cust_bill_amt, :cust_addr, :cust_name)")
	@Modifying
	@Transactional
	public int registerCustomer(double cust_bill_amt, String cust_addr, String cust_name);

	@Query(nativeQuery = true, value = "update cust_seq_01 set next_val=next_val+1")
	@Modifying
	@Transactional
	public int updateSeqValue();

	@Query(nativeQuery = true, value = "select now() from dual")
	public String showSystemDate();

	@Query(value = "create table demoTable(col1 int(5))", nativeQuery = true)
	@Modifying
	@Transactional
	public int createTable();
}