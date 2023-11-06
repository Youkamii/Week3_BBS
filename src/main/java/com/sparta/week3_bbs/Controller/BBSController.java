package com.sparta.week3_bbs.Controller;

import com.sparta.week3_bbs.dto.BBSRequestDto;
import com.sparta.week3_bbs.dto.BBSResponseDto;
import com.sparta.week3_bbs.entity.BBS;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BBSController {

	private final Map<Long, BBS> bbsList = new HashMap<>();
	@PostMapping("/BBS")
	public BBSResponseDto createBBS(@RequestBody BBSRequestDto requestDto) {
		BBS bbs = new BBS(requestDto);
		// Request >> Dto

		Long maxId = !bbsList.isEmpty() ? Collections.max(bbsList.keySet()) + 1 : 1;
		// BBs Max ID Check
		bbs.setId(maxId);

		bbsList.put(bbs.getId(), bbs);
		// 저장

		BBSResponseDto bbsResponseDto;
		bbsResponseDto = new BBSResponseDto(bbs);

		return bbsResponseDto;
	}


	@GetMapping("/BBS")
	public List<BBSResponseDto> getBBS() {
		List<BBSResponseDto> responseList;

		responseList = bbsList.values().stream().map(BBSResponseDto::new).toList();

		return responseList;
	}
}


