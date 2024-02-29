package com.apiexception.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   // @Data is the combination of [getter,setter,toString,hashcode & equals
		// methods..] trick -->gsthe
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private int pId;

	private String pName;

	private Double price;

}
