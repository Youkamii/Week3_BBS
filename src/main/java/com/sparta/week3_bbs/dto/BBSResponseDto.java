package com.sparta.week3_bbs.dto;

import com.sparta.week3_bbs.entity.BBS;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BBSResponseDto {
	private Long id;
	private String title;
	private String userName;
	private String contents;
	private Date date;

	public BBSResponseDto(BBS bbs) {
		this.id = bbs.getId();
		this.title = bbs.getTitle();
		this.userName = bbs.getUserName();
		this.contents = bbs.getContents();
		this.date = bbs.getDate();
	}
}
