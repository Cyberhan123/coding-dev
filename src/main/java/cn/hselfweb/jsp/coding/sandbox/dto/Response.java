package cn.hselfweb.jsp.coding.sandbox.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Response {
	private String requestCommand;
	private String responseCommand;
	private String data;
	private String signalId;
}
