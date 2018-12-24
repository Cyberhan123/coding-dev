package cn.hselfweb.jsp.coding.sandbox.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {
	private String command;
	private String data;
	private String signalId;
}
