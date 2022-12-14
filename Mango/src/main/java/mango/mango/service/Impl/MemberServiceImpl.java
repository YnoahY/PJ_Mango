package mango.mango.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import mango.mango.dao.MemberDAO;
import mango.mango.model.MemberVO;
import mango.mango.service.MemberService;

@Service("MemberService")
public class MemberServiceImpl extends EgovAbstractServiceImpl implements MemberService {

	@Resource(name = "MemberDAO")
	private MemberDAO memberDAO;

	@Override
	public String getId(String id) throws Exception {
		return memberDAO.getId(id);
	}

	@Override
	public int register(MemberVO mVO) throws Exception {

		return memberDAO.register(mVO);
	}
	
	@Override
	public int sellerRegister(MemberVO mVO) throws Exception {
		
		return memberDAO.sellerRegister(mVO);
	}

	@Override
	public MemberVO login(MemberVO mVO) throws Exception {

		return memberDAO.login(mVO);
	}

	@Override
	public void updateMember(MemberVO mVO) throws Exception {
		memberDAO.updateMember(mVO);
	}

	@Override
	public void deleteMember(String id) throws Exception {
		memberDAO.deleteMember(id);
	}

}