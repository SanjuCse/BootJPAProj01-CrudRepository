package com.sanju.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.sanju.entities.Customer;
import com.sanju.repository.ICustRepository;

@Component
public class CustServiceImpl implements ICustService {

	@Autowired
	private ICustRepository custRepository;

	@Override
	public Iterable<Customer> showCustomersBySorting(boolean asc, String... props) {
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, props);
		Iterable<Customer> iterable = custRepository.findAll(sort);
		return iterable;
	}

	@Override
	public Page<Customer> showCustomersByPageNo(int pageNo, int pageSize, boolean ascOrder, String props) {
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, props);
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		Page<Customer> page = custRepository.findAll(pageable);
		return page;
	}

	@Override
	public void showCustomersPageByPage(int pageSize) {
		long count = custRepository.count();
		long pagesCount = count / pageSize;
		pagesCount = (count % pageSize == 0) ? pagesCount : ++pagesCount;

		for (int i = 0; i < pagesCount; i++) {
			Pageable pageable = PageRequest.of(i, pageSize);
			Page<Customer> page = custRepository.findAll(pageable);
			page.forEach(System.out::println);
			System.out.println("---------" + (page.getNumber() + 1) + "/" + page.getTotalPages() + ".........");

		}
	}
}
