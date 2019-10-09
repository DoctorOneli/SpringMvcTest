package org.freedom.mvctest;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class User  {

	private Integer id;
	@NotBlank(message = "姓名不能为空")
	@Pattern(regexp = "(^[a-zAZ_-]{2,13}$)|(^[\u2E80-\u9FFF]{2,6})", message = "姓名由2到5个汉字或2到13的英文组合")
	private String username;
	@NotBlank(message = "密码不能为空")
	@Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,12}$", message = "密码要求含有数字和字母，且长度要在8-12位之间")
	private String password;
	@NotNull(message = "年龄不能为空")
	@Range(max = 60, min = 18, message = "年龄范围为18到60")
	private Integer age;
	@NotBlank(message = "邮箱不能为空")
	@Email(message = "请输入正确的邮箱格式")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
