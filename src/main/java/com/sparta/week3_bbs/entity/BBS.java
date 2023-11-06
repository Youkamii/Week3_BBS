package com.sparta.week3_bbs.entity;

import com.sparta.week3_bbs.dto.BBSRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @NoArgsConstructor
public class BBS {
	private Long id;
	private String title;
	private String userName;
	private String contents;
	private Date date;
	private String password;

	public BBS(BBSRequestDto requestDto) {
		this.title = requestDto.getTitle();
		this.userName = requestDto.getUserName();
		this.contents = requestDto.getContents();
		this.date = new Date();
		this.password = requestDto.getPassword();
	}
}
