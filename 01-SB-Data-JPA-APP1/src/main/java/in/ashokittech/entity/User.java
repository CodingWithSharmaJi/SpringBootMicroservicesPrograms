package in.ashokittech.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_dtls_vs")
public class User {

	@Id
	@Column(name= "USER_ID")
	private Integer user_id;
	@Column(name="user_name")
	private String user_name;
	@Column(name="user_phnno")
	private Long user_phnno ;
	@Column(name="use_age")
	private Integer age;
	@Column(name="user_country")
	private String user_country ;
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Long getUser_phnno() {
		return user_phnno;
	}
	public void setUser_phnno(Long user_phnno) {
		this.user_phnno = user_phnno;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getUser_country() {
		return user_country;
	}
	public void setUser_country(String user_country) {
		this.user_country = user_country;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_phnno=" + user_phnno + ", age=" + age
				+ ", user_country=" + user_country + "]";
	}
	
}
