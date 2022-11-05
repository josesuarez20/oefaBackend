package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

@SuppressWarnings("serial")
public class ParticipanteFiltroRequest implements Serializable{

	private BigDecimal reunionId;

	public ParticipanteFiltroRequest() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getReunionId() {
		return reunionId;
	}

	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

}
