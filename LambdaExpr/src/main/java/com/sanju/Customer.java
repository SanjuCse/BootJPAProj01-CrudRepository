package com.sanju;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
class Customer {

	int id;
	String name;

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			Customer customer = (Customer) obj;
			if (this.id == customer.id && this.name.equals(customer.name)) {
				return true;
			}
		}
		return false;
	}

	public boolean isCustomerFromBerhmapur() {
		return false;
	}
}