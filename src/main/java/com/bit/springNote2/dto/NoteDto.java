package com.bit.springNote2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NoteDto {
	private int id;
	private String writer;
	private String content;
}
