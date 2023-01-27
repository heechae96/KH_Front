package notice.model.vo;

import java.sql.Timestamp;

// notice.model.service의 selectAll때문에 생성
public class Notice {
	private int noticeNo;
	private String noticeSubject;
	private String noticeContent;
	private String noticeWriter;
	private Timestamp noticeDate; // 시분초까지
	private int viewCount;

	public Notice() {
		super();
	}

	public Notice(String noticeSubject, String noticeContent) {
		super();
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
	}
	
	public Notice(int noticeNo, String noticeSubject, String noticeContent) {
		super();
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
		this.noticeNo = noticeNo;
	}


	public Notice(int noticeNo, String noticeSubject, String noticeContent, String noticeWriter, Timestamp noticeDate,
			int viewCount) {
		super();
		this.noticeNo = noticeNo;
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
		this.noticeWriter = noticeWriter;
		this.noticeDate = noticeDate;
		this.viewCount = viewCount;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeSubject() {
		return noticeSubject;
	}

	public void setNoticeSubject(String noticeSubject) {
		this.noticeSubject = noticeSubject;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeWriter() {
		return noticeWriter;
	}

	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}

	public Timestamp getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Timestamp noticeDate) {
		this.noticeDate = noticeDate;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", noticeSubject=" + noticeSubject + ", noticeContent=" + noticeContent
				+ ", noticeWriter=" + noticeWriter + ", noticeDate=" + noticeDate + ", viewCount=" + viewCount + "]";
	}

}
