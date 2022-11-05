package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class NotificacionListaResponse extends BaseRequest implements Serializable {

	private static final long serialVersionUID = -7277958607367458698L;
	private BigDecimal notificacionId;	
	private String usuarioId;
	private String asunto;
	private String tipoCorreoCod;
	private String estadoCod;
	private String destinatario;
	private String tipoCorreo;
	private String estado;
	private String detalle;	
	private Date fecha;
	private String fechahora;

	public NotificacionListaResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public BigDecimal getNotificacionId() {
		return notificacionId;
	}

	public void setNotificacionId(BigDecimal notificacionId) {
		this.notificacionId = notificacionId;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getTipoCorreoCod() {
		return tipoCorreoCod;
	}

	public void setTipoCorreoCod(String tipoCorreoCod) {
		this.tipoCorreoCod = tipoCorreoCod;
	}

	public String getEstadoCod() {
		return estadoCod;
	}

	public void setEstadoCod(String estadoCod) {
		this.estadoCod = estadoCod;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getTipoCorreo() {
		return tipoCorreo;
	}

	public void setTipoCorreo(String tipoCorreo) {
		this.tipoCorreo = tipoCorreo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFechahora() {
		return fechahora;
	}

	public void setFechahora(String fechahora) {
		this.fechahora = fechahora;
	}
	
}
