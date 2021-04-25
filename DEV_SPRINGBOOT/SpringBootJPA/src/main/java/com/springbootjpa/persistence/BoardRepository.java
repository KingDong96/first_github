package com.springbootjpa.persistence;

import org.springframework.data.repository.CrudRepository;

import com.springbootjpa.entity.Board;

public interface BoardRepository  extends CrudRepository<Board, Long>{
	
}
