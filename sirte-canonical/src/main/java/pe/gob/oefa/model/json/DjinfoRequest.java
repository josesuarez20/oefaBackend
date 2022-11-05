package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DjinfoRequest implements Serializable {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8671466308624747733L;
	private BigDecimal djinteresId;
	private String info01 = "0";
	private String info02 = "0";
	private String info03 = "0";
	private String info04 = "0";
	private String info05 = "0";
	private String info06 = "0";
	private String info07 = "0";
	private String info08 = "0";
	private String info09 = "0";
	private String infoesp = "0";
	public String getInfo01() {
		return info01;
	}
	public String getInfo02() {
		return info02;
	}
	public String getInfo03() {
		return info03;
	}
	public String getInfo04() {
		return info04;
	}
	public String getInfo05() {
		return info05;
	}
	public String getInfo06() {
		return info06;
	}
	public String getInfo07() {
		return info07;
	}
	public String getInfo08() {
		return info08;
	}
	public String getInfo09() {
		return info09;
	}
	public String getInfoesp() {
		return infoesp;
	}
	public void setInfo01(String info01) {
		this.info01 = info01;
	}
	public void setInfo02(String info02) {
		this.info02 = info02;
	}
	public void setInfo03(String info03) {
		this.info03 = info03;
	}
	public void setInfo04(String info04) {
		this.info04 = info04;
	}
	public void setInfo05(String info05) {
		this.info05 = info05;
	}
	public void setInfo06(String info06) {
		this.info06 = info06;
	}
	public void setInfo07(String info07) {
		this.info07 = info07;
	}
	public void setInfo08(String info08) {
		this.info08 = info08;
	}
	public void setInfo09(String info09) {
		this.info09 = info09;
	}
	public void setInfoesp(String infoesp) {
		this.infoesp = infoesp;
	}
	public BigDecimal getDjinteresId() {
		return djinteresId;
	}
	public void setDjinteresId(BigDecimal djinteresId) {
		this.djinteresId = djinteresId;
	}
}
