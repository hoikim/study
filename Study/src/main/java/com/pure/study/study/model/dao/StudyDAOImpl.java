package com.pure.study.study.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pure.study.study.model.vo.Study;



@Repository
public class StudyDAOImpl implements StudyDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<Map<String, String>> selectStudyList(int cPage, int numPerPage) {
		RowBounds rowBounds = new RowBounds((cPage-1)*numPerPage, numPerPage);
		return sqlSession.selectList("study.studyList",null,rowBounds);
	}

	@Override
	public int studyTotalCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("study.studyTotalCount");
	}


	@Override
	public int insertStudy(Study study) {
		// TODO Auto-generated method stub
		return sqlSession.insert("study.insertStudy",study);
	}
	
	
	
	@Override
	public List<Map<String, Object>> selectSubject() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("study.selectSubject");
	}

	@Override
	public List<Map<String, Object>> selectKind(int subno) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("study.selectKind",subno);
	}

	@Override
	public List<Map<String, Object>> selectLocal() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("study.selectLocal");
	}

	@Override
	public List<Map<String, Object>> selectTown(int lno) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("study.selectTown", lno);
	}

	@Override
	public List<Map<String, Object>> selectLv() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("study.selectLv");
	}

	@Override
	public int updateStudyImg(Study study) {
		// TODO Auto-generated method stub
		return sqlSession.update("study.updateStudyImg", study);
	}

}