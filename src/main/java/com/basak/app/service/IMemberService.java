package com.basak.app.service;

import java.util.List;

import com.basak.app.model.MemberVO;

public interface IMemberService {
	// ȸ�� ���
	public List<MemberVO> memberList();
	// ȸ�� ��� ó��
	public void insertMember(MemberVO vo);
	// �α���
	public MemberVO login(MemberVO vo);
}
