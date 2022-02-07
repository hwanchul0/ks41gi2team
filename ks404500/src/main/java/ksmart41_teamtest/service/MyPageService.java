package ksmart41_teamtest.service;

import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.mapper.MyPageMapper;

@Service
@Transactional
public class MyPageService {
	
	@Autowired
	private MyPageMapper myPageMapper;
	
	public int modifyMyPage(MultipartFile multipartFile, Member member, HttpServletRequest request) {
		//파일경로
		String filePath = request.getSession().getServletContext().getRealPath("");
		System.out.println(filePath + "<- filePath MyPageService.java / 22-02-07 15:33");
		String imgPath = "/profile/";
		//파일이름
		String fileName = member.getMemberId() + "_" + multipartFile.getOriginalFilename();
		
		//파일전체경로
		String fullPath = filePath + imgPath + fileName;
		System.out.println(fullPath + "<-- fullPath MyPageService.java");
		
		//파일을 받음
		if(multipartFile.getSize() != 0) {
			//프로필이 있으면
			System.out.println("test.파일확인");
			
			if(member.getMemberProfile() != null) {
				//파일로 저장
				File file = new File(filePath, "random"); 
				file.delete();
				System.out.println("test.파일있음");
			}	
			
			//프로필이 없으면
			try {
				multipartFile.transferTo(new File(fullPath));
				System.out.println("test.파일저장");
				String memberProfile = imgPath + fileName; // /profile/swid001_test.png
				member.setMemberProfile(memberProfile);
			} catch (IOException e) {
				e.printStackTrace();
			}
			//member.setMemberProfile(fileName);
		}
		return myPageMapper.modifyMyPage(member);
	}
	
	//[재천]회원정보 조회
	public Member MemberInfo(String memberId) {
		return myPageMapper.MemberInfo(memberId);
	}
	
	//회원상태체크
	public Member selectMemberStatus(String memberId) {
		return myPageMapper.selectMemberStatus(memberId);
	}
	
	public int modifystatus(Member member) {
		return myPageMapper.modifystatus(member);
	}
	
}
