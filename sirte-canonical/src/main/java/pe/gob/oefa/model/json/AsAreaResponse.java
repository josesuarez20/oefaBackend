package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AsAreaResponse implements Serializable {

	private BigDecimal idarea;
	private BigDecimal idareapadre;
	private String nombre;
	private BigDecimal empleadoresponsable;
	private BigDecimal empleadoresponsable2;
	private BigDecimal empleadoresponsable3;
	private BigDecimal empleadoresponsable4;
	private BigDecimal empleadoaprobador;
	private BigDecimal empleadoaprobador2;
	private BigDecimal empleadoaprobador3;
	private BigDecimal empleadoaprobador4;

	private String flagcorreoresponsable1;
	private String flagcorreoresponsable2;
	private String flagcorreoresponsable3;
	private String flagcorreoresponsable4;
	private String flagcorreoaprobador1;
	private String flagcorreoaprobador2;
	private String flagcorreoaprobador3;
	private String flagcorreoaprobador4;

	public AsAreaResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getIdarea() {
		return idarea;
	}

	public void setIdarea(BigDecimal idarea) {
		this.idarea = idarea;
	}

	public BigDecimal getIdareapadre() {
		return idareapadre;
	}

	public void setIdareapadre(BigDecimal idareapadre) {
		this.idareapadre = idareapadre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getEmpleadoresponsable() {
		return empleadoresponsable;
	}

	public void setEmpleadoresponsable(BigDecimal empleadoresponsable) {
		this.empleadoresponsable = empleadoresponsable;
	}

	public BigDecimal getEmpleadoresponsable2() {
		return empleadoresponsable2;
	}

	public void setEmpleadoresponsable2(BigDecimal empleadoresponsable2) {
		this.empleadoresponsable2 = empleadoresponsable2;
	}

	public BigDecimal getEmpleadoresponsable3() {
		return empleadoresponsable3;
	}

	public void setEmpleadoresponsable3(BigDecimal empleadoresponsable3) {
		this.empleadoresponsable3 = empleadoresponsable3;
	}

	public BigDecimal getEmpleadoresponsable4() {
		return empleadoresponsable4;
	}

	public void setEmpleadoresponsable4(BigDecimal empleadoresponsable4) {
		this.empleadoresponsable4 = empleadoresponsable4;
	}

	public BigDecimal getEmpleadoaprobador() {
		return empleadoaprobador;
	}

	public void setEmpleadoaprobador(BigDecimal empleadoaprobador) {
		this.empleadoaprobador = empleadoaprobador;
	}

	public BigDecimal getEmpleadoaprobador2() {
		return empleadoaprobador2;
	}

	public void setEmpleadoaprobador2(BigDecimal empleadoaprobador2) {
		this.empleadoaprobador2 = empleadoaprobador2;
	}

	public BigDecimal getEmpleadoaprobador3() {
		return empleadoaprobador3;
	}

	public void setEmpleadoaprobador3(BigDecimal empleadoaprobador3) {
		this.empleadoaprobador3 = empleadoaprobador3;
	}

	public BigDecimal getEmpleadoaprobador4() {
		return empleadoaprobador4;
	}

	public void setEmpleadoaprobador4(BigDecimal empleadoaprobador4) {
		this.empleadoaprobador4 = empleadoaprobador4;
	}

	public String getFlagcorreoresponsable1() {
		return flagcorreoresponsable1;
	}

	public void setFlagcorreoresponsable1(String flagcorreoresponsable1) {
		this.flagcorreoresponsable1 = flagcorreoresponsable1;
	}

	public String getFlagcorreoresponsable2() {
		return flagcorreoresponsable2;
	}

	public void setFlagcorreoresponsable2(String flagcorreoresponsable2) {
		this.flagcorreoresponsable2 = flagcorreoresponsable2;
	}

	public String getFlagcorreoresponsable3() {
		return flagcorreoresponsable3;
	}

	public void setFlagcorreoresponsable3(String flagcorreoresponsable3) {
		this.flagcorreoresponsable3 = flagcorreoresponsable3;
	}

	public String getFlagcorreoresponsable4() {
		return flagcorreoresponsable4;
	}

	public void setFlagcorreoresponsable4(String flagcorreoresponsable4) {
		this.flagcorreoresponsable4 = flagcorreoresponsable4;
	}

	public String getFlagcorreoaprobador1() {
		return flagcorreoaprobador1;
	}

	public void setFlagcorreoaprobador1(String flagcorreoaprobador1) {
		this.flagcorreoaprobador1 = flagcorreoaprobador1;
	}

	public String getFlagcorreoaprobador2() {
		return flagcorreoaprobador2;
	}

	public void setFlagcorreoaprobador2(String flagcorreoaprobador2) {
		this.flagcorreoaprobador2 = flagcorreoaprobador2;
	}

	public String getFlagcorreoaprobador3() {
		return flagcorreoaprobador3;
	}

	public void setFlagcorreoaprobador3(String flagcorreoaprobador3) {
		this.flagcorreoaprobador3 = flagcorreoaprobador3;
	}

	public String getFlagcorreoaprobador4() {
		return flagcorreoaprobador4;
	}

	public void setFlagcorreoaprobador4(String flagcorreoaprobador4) {
		this.flagcorreoaprobador4 = flagcorreoaprobador4;
	}

}
