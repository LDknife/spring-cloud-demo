package com.ld.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
//@Data
//@Accessors(chain=true)
@Getter
@Setter
public class Dept implements Serializable{

	//id
	private Long deptno;
	
	//名称
	private String dname;
	
	//属于哪个数据库
	private String db_source;
	
}
