package notice.model.service;

import java.sql.Connection;
import java.util.List;

import common.JDBCTemplate;
import notice.model.dao.NoticeDAO;
import notice.model.vo.Notice;

public class NoticeService {
	
	private NoticeDAO nDao;
	
	public NoticeService() {
		nDao = new NoticeDAO();
	}
	
	public int registerNotice(Notice notice) {
		Connection conn = JDBCTemplate.getConnection();
		int result = -1;
		result = nDao.insertNotice(conn, notice);
		if(result > 0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

	public List<Notice> selectAll() {
		Connection conn = JDBCTemplate.getConnection();
		List<Notice> nList = nDao.selectAll(conn);
		return nList;
	}
}
