package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import test.dto.BirthDto;
import test.util.DBConnect;

public class BirthDao {
	
	private static BirthDao dao;
	
	private BirthDao() {};
	
	public BirthDao getInstense() {
		if(this.dao == null) dao = new BirthDao();
		return dao;
	}
	
	// insert 생일정보추가( 필드 추가 )
	public boolean insert(BirthDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "insert into birth " + "(num,name,birthday) "+
			"values(birth_seq.nextval(), ? ,?);";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getBirthday());
			flag = pstmt.executeUpdate();
			System.out.println("정보 추가 완료 !");
			
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		if(flag != 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// modify 생일정보수정( 필드 수정 )
	public boolean modify(BirthDto dto) {
		return false;
	}
	
	// delete 생일정보삭제( 필드 삭제 )
	public boolean delete(int idx) {
		return false;
	}
	
	// select 한개의 생일정보가져오기( select )
	public BirthDto getData(int idx) {
		BirthDto dto = new BirthDto();
		return dto;
	}
	
	// select all 모든 필드 가져오기
	public List<BirthDto> getList(){
		List<BirthDto> blist = new ArrayList();
		
		return null;
	}

}
