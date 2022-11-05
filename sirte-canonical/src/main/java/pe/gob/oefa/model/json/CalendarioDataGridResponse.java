package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.gob.oefa.util.CustomDateTimeSerializer;

@JsonInclude(Include.NON_NULL)
public class CalendarioDataGridResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -588106990344275459L;
	private String title;
	private Date start;
	private Date end;
	private String backgroundColor;
	private BigDecimal reunionId;
	public CalendarioDataGridResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public BigDecimal getReunionId() {
		return reunionId;
	}

	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@JsonSerialize(using=CustomDateTimeSerializer.class)
	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}
	@JsonSerialize(using=CustomDateTimeSerializer.class)
	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	

}
