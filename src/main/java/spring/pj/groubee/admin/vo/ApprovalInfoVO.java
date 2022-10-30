package spring.pj.groubee.admin.vo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "grb_approvalInfo")
public class ApprovalInfoVO extends CommonVO {
	

	private int load_id;
	private String id;
	private String getter_id;
	private int load_num;
	private String load_status;
	private String co_approve;
	private String category;
	private String form_name;
	private Date checkday;
	
	public ApprovalInfoVO() {}

	public Date getCheckday() {
		return checkday;
	}

	public void setCheckday(Date checkday) {
		this.checkday = checkday;
	}

	public String getForm_name() {
		return form_name;
	}

	public void setForm_name(String form_name) {
		this.form_name = form_name;
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


	public String getGetter_id() {
		return getter_id;
	}


	public void setGetter_id(String getter_id) {
		this.getter_id = getter_id;
	}


	public int getLoad_num() {
		return load_num;
	}


	public void setLoad_num(int load_num) {
		this.load_num = load_num;
	}


	public String getCo_approve() {
		return co_approve;
	}


	public void setCo_approve(String co_approve) {
		this.co_approve = co_approve;
	}


	public String getLoad_status() {
		return load_status;
	}


	public void setLoad_status(String load_status) {
		this.load_status = load_status;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "ApprovalInfoDTO [load_id=" + load_id + ", id=" + id + ", getter_id=" + getter_id + ", load_num="
				+ load_num + ", co_approve=" + co_approve + ", load_status=" + load_status + ", category=" + category
				+ "]";
	}
	
	
}
