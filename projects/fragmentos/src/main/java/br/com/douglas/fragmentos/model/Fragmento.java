package br.com.douglas.fragmentos.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Fragmento {

	private Integer groupId;
	private String file;
	private int line;
	private String text;
	
	public Fragmento() {
	}
	
	public Fragmento(Integer groupId, String file, int line, String text) {
		this.groupId = groupId;
		this.file = file;
		this.line = line;
		this.text = text;
	}

	public Fragmento(ResultSet rs) throws SQLException{
		this.groupId = rs.getInt("Id");
		this.file = rs.getString("File");
		this.line = rs.getInt("Line");
		this.text = rs.getString("Text");
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Fragmento [groupId=" + groupId + ", file=" + file + ", line=" + line + ", text=" + text + "]";
	}
	
}
