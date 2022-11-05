package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ReunionStarRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9037562195742477960L;

	private BigDecimal idReunion;

	public ReunionStarRequest() {
	}

	/**
	 * @return the idReunion
	 */
	public BigDecimal getIdReunion() {
		return idReunion;
	}

	/**
	 * @param idReunion
	 *            the idReunion to set
	 */
	public void setIdReunion(BigDecimal idReunion) {
		this.idReunion = idReunion;
	}

}
