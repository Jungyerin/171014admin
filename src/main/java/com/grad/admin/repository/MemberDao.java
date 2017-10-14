package com.grad.admin.repository;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.grad.admin.vo.MemberVo;
import com.grad.admin.vo.NotiVo;
import com.grad.admin.vo.ResrchAcrsltVo;



@Repository
public class MemberDao {

	@Autowired
	private SqlSession sqlSession;

	public void insert(MemberVo memberVo) {
		sqlSession.insert("member.insert", memberVo);
	}


	public MemberVo getByIden(String EMAIL) {
		return sqlSession.selectOne("member.getByIden", EMAIL);
	}

	public MemberVo getUser(Map<String, Object> map) throws Exception {
		return sqlSession.selectOne("member.getByLoginInfo", map);
	}


	public List<ResrchAcrsltVo> countNotiOrganz() {
		return sqlSession.selectList("member.countNotiOrganz");
	}


	public List<NotiVo> getNewNoti() {
		return sqlSession.selectList("member.getNewNoti");
	}


	public List<NotiVo> getNewOrganz() {
		return sqlSession.selectList("member.getNewOrganz");
	}


}