package com.plog.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/*@ToString 
@AllArgsConstructor  
@Builder
*/

//@NoArgsConstructor
//@Table(name = "tb_user")
@Entity
@Getter
@Setter
public class User { 
	
	@Id @Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // mysql의 AUTO_INCREMENT를 그대로 사용 
	private Long id; 
	
	@Column(length = 10, nullable = false) 
	private String name; 
	
	@Column(length = 50, nullable = false)
	private String email;
	
	@Column(length = 50, nullable = false)
	private String pw;
	
//	@Column(length = 30, nullable = false)
//	private String region;
//	
//	private String major;
//	
//	private String profile_img_id;
//	
//	private String number;
//
//	private String number_open_yn;
//	
//	private String portfolio_open_yn;
//	
//	private String message_open_yn;
	
	
//	@Column(nullable = false)
//	@CreationTimestamp
//	private LocalDateTime createdAt;
//	
//	@CreationTimestamp
//	private LocalDateTime updatedAt;

	/*
	 * @Builder public User(String name, String email, String region, String major,
	 * String profile_img_id, String number, String number_open_yn, String
	 * portfolio_open_yn, String message_open_yn) { this.name = name; this.email =
	 * email; this.region = region; this.major = major; this.profile_img_id =
	 * profile_img_id; this.number = number; this.number_open_yn = number_open_yn;
	 * this.portfolio_open_yn = portfolio_open_yn; this.message_open_yn =
	 * message_open_yn; }
	 */
}
