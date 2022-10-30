package spring.pj.groubee.admin.vo;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="grb_draft")
public class ApproveDraftVO {
	
	@Id
	private int doc_id;
	private int load_id;
	private String id;
	private String depart_name;
	private String category;
	private String title;
	private String content;
	private int show;
	private String state;
	private String stateid;
	private Date upday;
	private String files;
	private String nonfiles;
	private String form_name;
	
	public ApproveDraftVO() {}


	public String getNonfiles() {
		return nonfiles;
	}

	public void setNonfiles(String nonfiles) {
		this.nonfiles = nonfiles;
	}

	public String getStateid() {
		return stateid;
	}

	public void setStateid(String stateid) {
		this.stateid = stateid;
	}


	public Date getUpday() {
		return upday;
	}

	public void setUpday(Date upday) {
		this.upday = upday;
	}

	public String getForm_name() {
		return form_name;
	}

	public void setForm_name(String form_name) {
		this.form_name = form_name;
	}

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public int getLoad_id() {
		return load_id;
	}

	public void setLoad_id(int load_id) {
		this.load_id = load_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepart_name() {
		return depart_name;
	}

	public void setDepart_name(String depart_name) {
		this.depart_name = depart_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getShow() {
		return show;
	}

	public void setShow(int show) {
		this.show = show;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "ApproveDraftDTO [doc_id=" + doc_id + ", load_id=" + load_id + ", id=" + id + ", depart_name="
				+ depart_name + ", category=" + category + ", title=" + title + ", content=" + content + ", show="
				+ show + ", state=" + state + ", upday=" + upday + ", files=" + files + "]";
	}
	
	

}
