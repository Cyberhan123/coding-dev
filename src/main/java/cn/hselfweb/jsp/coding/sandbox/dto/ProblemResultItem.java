package cn.hselfweb.jsp.coding.sandbox.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProblemResultItem {
	private long useTime;
	private long useMemory;
	private String result;
	private String message;
	private boolean isNormal;
	private String inputFilePath;
	@Override
	public String toString() {
		return "ProblemResultItem [useTime=" + useTime + ", useMemory="
				+ useMemory + ", result=" + result + ", message=" + message
				+ ", isNormal=" + isNormal + ", inputFilePath=" + inputFilePath
				+ "]";
	}

}
