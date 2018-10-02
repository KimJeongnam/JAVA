package ch06;

public class _13_CdInfo {
	private String registerNo;		// 관리 번호
	private String title;		// 제목
	
	public _13_CdInfo() {}
	
	
	public _13_CdInfo(String registerNo, String title) {
		this.registerNo = registerNo;
		this.title = title;
	}
	
	
	public String getResiterNo() { return this.registerNo; }
	public String getTitle() { return this.title; }
}
