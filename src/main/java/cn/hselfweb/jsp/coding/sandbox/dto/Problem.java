package cn.hselfweb.jsp.coding.sandbox.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Problem {
	private long timeLimit;
	private long memoryLimit;
	private String classFileName;
	private String runId;
	private List<String> inputDataFilePathList = new ArrayList<String>();



	@Override
	public String toString() {
		return "Problem [timeLimit=" + timeLimit + ", memoryLimit="
				+ memoryLimit + ", classFileName=" + classFileName + ", runId="
				+ runId + ", inputDataFilePathList=" + inputDataFilePathList
				+ "]";
	}

}
