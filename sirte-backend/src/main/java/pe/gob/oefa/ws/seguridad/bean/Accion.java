/**
 * Accion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class Accion  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Integer idAccion;

    private java.lang.String codigoHTML;

    private java.lang.String nombre;

    private java.lang.String etiqueta;

    private java.lang.String mensajeToolTip;

    private java.lang.String evento;

    private java.lang.Boolean activo;

    private pe.gob.oefa.ws.seguridad.bean.Grupo grupo;

    public Accion() {
    }

    public Accion(
           java.lang.Integer idAccion,
           java.lang.String codigoHTML,
           java.lang.String nombre,
           java.lang.String etiqueta,
           java.lang.String mensajeToolTip,
           java.lang.String evento,
           java.lang.Boolean activo,
           pe.gob.oefa.ws.seguridad.bean.Grupo grupo) {
           this.idAccion = idAccion;
           this.codigoHTML = codigoHTML;
           this.nombre = nombre;
           this.etiqueta = etiqueta;
           this.mensajeToolTip = mensajeToolTip;
           this.evento = evento;
           this.activo = activo;
           this.grupo = grupo;
    }


    /**
     * Gets the idAccion value for this Accion.
     * 
     * @return idAccion
     */
    public java.lang.Integer getIdAccion() {
        return idAccion;
    }


    /**
     * Sets the idAccion value for this Accion.
     * 
     * @param idAccion
     */
    public void setIdAccion(java.lang.Integer idAccion) {
        this.idAccion = idAccion;
    }


    /**
     * Gets the codigoHTML value for this Accion.
     * 
     * @return codigoHTML
     */
    public java.lang.String getCodigoHTML() {
        return codigoHTML;
    }


    /**
     * Sets the codigoHTML value for this Accion.
     * 
     * @param codigoHTML
     */
    public void setCodigoHTML(java.lang.String codigoHTML) {
        this.codigoHTML = codigoHTML;
    }


    /**
     * Gets the nombre value for this Accion.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Accion.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the etiqueta value for this Accion.
     * 
     * @return etiqueta
     */
    public java.lang.String getEtiqueta() {
        return etiqueta;
    }


    /**
     * Sets the etiqueta value for this Accion.
     * 
     * @param etiqueta
     */
    public void setEtiqueta(java.lang.String etiqueta) {
        this.etiqueta = etiqueta;
    }


    /**
     * Gets the mensajeToolTip value for this Accion.
     * 
     * @return mensajeToolTip
     */
    public java.lang.String getMensajeToolTip() {
        return mensajeToolTip;
    }


    /**
     * Sets the mensajeToolTip value for this Accion.
     * 
     * @param mensajeToolTip
     */
    public void setMensajeToolTip(java.lang.String mensajeToolTip) {
        this.mensajeToolTip = mensajeToolTip;
    }


    /**
     * Gets the evento value for this Accion.
     * 
     * @return evento
     */
    public java.lang.String getEvento() {
        return evento;
    }


    /**
     * Sets the evento value for this Accion.
     * 
     * @param evento
     */
    public void setEvento(java.lang.String evento) {
        this.evento = evento;
    }


    /**
     * Gets the activo value for this Accion.
     * 
     * @return activo
     */
    public java.lang.Boolean getActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this Accion.
     * 
     * @param activo
     */
    public void setActivo(java.lang.Boolean activo) {
        this.activo = activo;
    }


    /**
     * Gets the grupo value for this Accion.
     * 
     * @return grupo
     */
    public pe.gob.oefa.ws.seguridad.bean.Grupo getGrupo() {
        return grupo;
    }


    /**
     * Sets the grupo value for this Accion.
     * 
     * @param grupo
     */
    public void setGrupo(pe.gob.oefa.ws.seguridad.bean.Grupo grupo) {
        this.grupo = grupo;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Accion)) return false;
        Accion other = (Accion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idAccion==null && other.getIdAccion()==null) || 
             (this.idAccion!=null &&
              this.idAccion.equals(other.getIdAccion()))) &&
            ((this.codigoHTML==null && other.getCodigoHTML()==null) || 
             (this.codigoHTML!=null &&
              this.codigoHTML.equals(other.getCodigoHTML()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.etiqueta==null && other.getEtiqueta()==null) || 
             (this.etiqueta!=null &&
              this.etiqueta.equals(other.getEtiqueta()))) &&
            ((this.mensajeToolTip==null && other.getMensajeToolTip()==null) || 
             (this.mensajeToolTip!=null &&
              this.mensajeToolTip.equals(other.getMensajeToolTip()))) &&
            ((this.evento==null && other.getEvento()==null) || 
             (this.evento!=null &&
              this.evento.equals(other.getEvento()))) &&
            ((this.activo==null && other.getActivo()==null) || 
             (this.activo!=null &&
              this.activo.equals(other.getActivo()))) &&
            ((this.grupo==null && other.getGrupo()==null) || 
             (this.grupo!=null &&
              this.grupo.equals(other.getGrupo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIdAccion() != null) {
            _hashCode += getIdAccion().hashCode();
        }
        if (getCodigoHTML() != null) {
            _hashCode += getCodigoHTML().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getEtiqueta() != null) {
            _hashCode += getEtiqueta().hashCode();
        }
        if (getMensajeToolTip() != null) {
            _hashCode += getMensajeToolTip().hashCode();
        }
        if (getEvento() != null) {
            _hashCode += getEvento().hashCode();
        }
        if (getActivo() != null) {
            _hashCode += getActivo().hashCode();
        }
        if (getGrupo() != null) {
            _hashCode += getGrupo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Accion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Accion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdAccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoHTML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "CodigoHTML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiqueta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Etiqueta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeToolTip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "MensajeToolTip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Evento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Activo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Grupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Grupo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           @SuppressWarnings("rawtypes") java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    @SuppressWarnings("rawtypes")
	public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
