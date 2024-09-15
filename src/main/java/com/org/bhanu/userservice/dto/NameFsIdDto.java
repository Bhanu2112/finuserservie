package com.org.bhanu.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NameFsIdDto {
	private String name;
	private String fsid;
	private Long userId;
}
