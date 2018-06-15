package com.pure.study.study.model.dao;

import java.util.List;
import java.util.Map;

import com.pure.study.study.model.vo.Study;



public interface StudyDAO {

	List<Map<String, String>> selectStudyList(int cPage, int numPerPage);

	int studyTotalCount();

	List<Map<String, Object>> selectSubject();

	List<Map<String, Object>> selectKind(int subno);

	List<Map<String, Object>> selectLocal();

	List<Map<String, Object>> selectTown(int lno);

	List<Map<String, Object>> selectLv();

	int insertStudy(Study study);

	int updateStudyImg(Study study);

}