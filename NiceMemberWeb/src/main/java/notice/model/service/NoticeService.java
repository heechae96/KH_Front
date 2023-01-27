package notice.model.service;

import java.sql.Connection;
import java.util.List;

import common.JDBCTemplate;
import notice.model.dao.NoticeDAO;
import notice.model.vo.Notice;
import notice.model.vo.PageData;

public class NoticeService {

	private NoticeDAO nDao;

	public NoticeService() {
		nDao = new NoticeDAO();
	}

	/**
	 * 공지사항 등록 Service
	 * 
	 * @param notice
	 * @return result
	 */
	public int registerNotice(Notice notice) {
		Connection conn = JDBCTemplate.getConnection();
		int result = -1;
		result = nDao.insertNotice(conn, notice);
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

	/**
	 * 공지사항 목록 조회 Service
	 * 
	 * @return nList
	 */
	public PageData selectAll(int currentPage) {
		Connection conn = JDBCTemplate.getConnection();
		// 2번째 인자값을 변경하면 서버에서도 변화가 생김!
		List<Notice> nList = nDao.selectAllNotice(conn, currentPage);
		String pageNavigator =  nDao.generatePageNavi(conn, currentPage);
		// 2개를 한번에 반환하기 위해 notice.model.vo에 PageData 클래스를 만들었음
		// -> HashMap을 사용해도 좋음
		PageData pd = new PageData();
		pd.setnList(nList);
		pd.setPageNavigator(pageNavigator);
		return pd;
	}

	/**
	 * 공지사항 상세 조회 Service
	 * 
	 * @param noticeNo
	 * @return notice
	 */
	public Notice selectOneByNo(int noticeNo) {
		Connection conn = JDBCTemplate.getConnection();
		Notice notice = nDao.selelctOneByNo(conn, noticeNo);
		return notice;
	}

	/**
	 * 공지사항 삭제 Service
	 * 
	 * @param noticeNo
	 * @return
	 */
	public int deleteNotice(int noticeNo) {
		Connection conn = JDBCTemplate.getConnection();
		int result = -1;
		result = nDao.deletNotice(conn, noticeNo);
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

	/**
	 * 공지사항 수정 Service
	 * 
	 * @param notice
	 * @return result
	 */
	public int updateNotice(Notice notice) {
		Connection conn = JDBCTemplate.getConnection();
		int result = -1;
		result = nDao.updateNotice(conn, notice);
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}
}
