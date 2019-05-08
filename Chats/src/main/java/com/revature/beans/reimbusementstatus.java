package com.revature.beans;


public class reimbusementstatus {
	private String reimbStatus;
	private int reimbStatusId;
	public String getReimbStatus() {
		return reimbStatus;
	}
	public void setReimbStatus(String reimbStatus) {
		this.reimbStatus = reimbStatus;
	}
	public int getReimbStatusId() {
		return reimbStatusId;
	}
	public void setReimbStatusId(int reimbStatusId) {
		this.reimbStatusId = reimbStatusId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reimbStatus == null) ? 0 : reimbStatus.hashCode());
		result = prime * result + reimbStatusId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		reimbusementstatus other = (reimbusementstatus) obj;
		if (reimbStatus == null) {
			if (other.reimbStatus != null)
				return false;
		} else if (!reimbStatus.equals(other.reimbStatus))
			return false;
		if (reimbStatusId != other.reimbStatusId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "reimbusementstatus [reimbStatus=" + reimbStatus + ", reimbStatusId=" + reimbStatusId + "]";
	}
	public reimbusementstatus(String reimbStatus, int reimbStatusId) {
		super();
		this.reimbStatus = reimbStatus;
		this.reimbStatusId = reimbStatusId;
	}
	public reimbusementstatus() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
