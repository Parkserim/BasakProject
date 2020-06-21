package com.basak.app.dao;

import java.util.List;

import com.basak.app.model.MemberVO;

public interface IMemberDAO {
	// ȸ�� ���
	public List<MemberVO> memberList();
	// �α���
	public MemberVO login(MemberVO vo);
	// ȸ������
	public void insertMember(MemberVO vo);
}
