package com.di.approval.domain;

import java.sql.Blob;
import java.util.*;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.springframework.beans.factory.annotation.Required;

import com.di.util.rest.BlobXmlAdapter;

@XmlRootElement
public class Approval {

	private String rowId;
	private String approvalId;
	
	private String subject;
	private Blob content;								//TODO : type conversion like clob
	private boolean delFlag;
	private List<ApprovalLine> mapApprovalLine;			
	private Map<String, String> mapAttachedFile;		//key: filename, value: full path
		
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;

	@Required
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getRowId() {
		return rowId;
	}

	public String getApprovalId() {
		return approvalId;
	}

	@Required
	public void setApprovalId(String approvalId) {
		this.approvalId = approvalId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@XmlJavaTypeAdapter(BlobXmlAdapter.class)
	public Blob getContent() {
		return content;
	}

	public void setContent(Blob content) {
		this.content = content;
	}

	public List<ApprovalLine> getMapApprovalLine() {
		return mapApprovalLine;
	}

	public void setMapApprovalLine(List<ApprovalLine> mapApprovalLine) {
		this.mapApprovalLine = mapApprovalLine;
	}

	public Map<String, String> getMapAttachedFile() {
		return mapAttachedFile;
	}

	public void setMapAttachedFile(Map<String, String> mapAttachedFile) {
		this.mapAttachedFile = mapAttachedFile;
	}

	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}

	public void setModifiedData(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	public String getModifiedBy() {
		return modifiedBy;
	}

	public boolean isDelFlag() {
		return delFlag;
	}

	public void setDelFlag(boolean delFlag) {
		this.delFlag = delFlag;
	}

	@Override
	public String toString() {
		return "Approval [rowId=" + rowId + ", approvalId=" + approvalId
				+ ", content=" + content + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((approvalId == null) ? 0 : approvalId.hashCode());
		result = prime * result + ((rowId == null) ? 0 : rowId.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		Approval other = (Approval) obj;
		if (approvalId == null) {
			if (other.approvalId != null)
				return false;
		} else if (!approvalId.equals(other.approvalId))
			return false;
		if (rowId == null) {
			if (other.rowId != null)
				return false;
		} else if (!rowId.equals(other.rowId))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	
}
