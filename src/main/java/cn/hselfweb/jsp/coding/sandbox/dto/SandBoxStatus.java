package cn.hselfweb.jsp.coding.sandbox.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SandBoxStatus {
	private String pid;
	private long useMemory;
	private long maxMemory;
	private long beginStartTime;
	private boolean isBusy;
}
