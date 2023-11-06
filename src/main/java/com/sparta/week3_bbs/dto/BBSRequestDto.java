package com.sparta.week3_bbs.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class BBSRequestDto {
	private String title;
	private String userName;
	private String contents;
	private Date date;
	private String password;

}