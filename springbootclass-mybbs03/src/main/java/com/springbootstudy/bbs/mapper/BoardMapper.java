package com.springbootstudy.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springbootstudy.bbs.domain.Board;

@Mapper
public interface BoardMapper {
	
	public List<Board> boardList();
}
