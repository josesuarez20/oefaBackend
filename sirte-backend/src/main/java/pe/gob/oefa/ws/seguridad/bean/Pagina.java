/**
 * Pagina.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class Pagina  implements java.io.Serializable {
    private java.lang.Integer idPagina;

    private java.lang.Integer idPaginaPadre;

    private java.lang.String url;

    private java.lang.String nombre;
    
    private java.lang.String ayuda;    

	private java.lang.String icono;
    
    

    private java.lang.Integer nivel;

    private java.lang.Integer orden;

    private java.lang.Boolean visible;
    
    private java.lang.String perfil;

    private pe.gob.oefa.ws.seguridad.bean.Modulo modulo;

    private pe.gob.oefa.ws.seguridad.bean.Grupo grupo;

    private pe.gob.oefa.ws.seguridad.bean.Estado estado;

    
    public Pagina() {
    }

    public Pagina(
           java.lang.Integer idPagina,
           java.lang.Integer idPaginaPadre,
           java.lang.String url,
           java.lang.String nombre,
           java.lang.String icono,
           java.lang.Integer nivel,
           java.lang.Integer orden,
           java.lang.Boolean visible,
           pe.gob.oefa.ws.seguridad.bean.Modulo modulo,
           pe.gob.oefa.ws.seguridad.bean.Grupo grupo,
           pe.gob.oefa.ws.seguridad.bean.Estado estado) {
           this.idPagina = idPagina;
           this.idPaginaPadre = idPaginaPadre;
           this.url = url;
           this.nombre = nombre;
           this.icono = icono;
           this.nivel = nivel;
           this.orden = orden;
           this.visible = visible;
           this.modulo = modulo;
           this.grupo = grupo;
           this.estado = estado;
    }


    /**
     * Gets the idPagina value for this Pagina.
     * 
     * @return idPagina
     */
    public java.lang.Integer getIdPagina() {
        return idPagina;
    }


    /**
     * Sets the idPagina value for this Pagina.
     * 
     * @param idPagina
     */
    public void setIdPagina(java.lang.Integer idPagina) {
        this.idPagina = idPagina;
    }


    /**
     * Gets the idPaginaPadre value for this Pagina.
     * 
     * @return idPaginaPadre
     */
    public java.lang.Integer getIdPaginaPadre() {
        return idPaginaPadre;
    }


    /**
     * Sets the idPaginaPadre value for this Pagina.
     * 
     * @param idPaginaPadre
     */
    public void setIdPaginaPadre(java.lang.Integer idPaginaPadre) {
        this.idPaginaPadre = idPaginaPadre;
    }


    /**
     * Gets the url value for this Pagina.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Pagina.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the nombre value for this Pagina.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Pagina.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the icono value for this Pagina.
     * 
     * @return icono
     */
    public java.lang.String getIcono() {
        return icono;
    }


    /**
     * Sets the icono value for this Pagina.
     * 
     * @param icono
     */
    public void setIcono(java.lang.String icono) {
        this.icono = icono;
    }


    /**
     * Gets the nivel value for this Pagina.
     * 
     * @return nivel
     */
    public java.lang.Integer getNivel() {
        return nivel;
    }


    /**
     * Sets the nivel value for this Pagina.
     * 
     * @param nivel
     */
    public void setNivel(java.lang.Integer nivel) {
        this.nivel = nivel;
    }


    /**
     * Gets the orden value for this Pagina.
     * 
     * @return orden
     */
    public java.lang.Integer getOrden() {
        return orden;
    }


    /**
     * Sets the orden value for this Pagina.
     * 
     * @param orden
     */
    public void setOrden(java.lang.Integer orden) {
        this.orden = orden;
    }


    /**
     * Gets the visible value for this Pagina.
     * 
     * @return visible
     */
    public java.lang.Boolean getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this Pagina.
     * 
     * @param visible
     */
    public void setVisible(java.lang.Boolean visible) {
        this.visible = visible;
    }


    /**
     * Gets the modulo value for this Pagina.
     * 
     * @return modulo
     */
    public pe.gob.oefa.ws.seguridad.bean.Modulo getModulo() {
        return modulo;
    }


    /**
     * Sets the modulo value for this Pagina.
     * 
     * @param modulo
     */
    public void setModulo(pe.gob.oefa.ws.seguridad.bean.Modulo modulo) {
        this.modulo = modulo;
    }


    /**
     * Gets the grupo value for this Pagina.
     * 
     * @return grupo
     */
    public pe.gob.oefa.ws.seguridad.bean.Grupo getGrupo() {
        return grupo;
    }


    /**
     * Sets the grupo value for this Pagina.
     * 
     * @param grupo
     */
    public void setGrupo(pe.gob.oefa.ws.seguridad.bean.Grupo grupo) {
        this.grupo = grupo;
    }


    /**
     * Gets the estado value for this Pagina.
     * 
     * @return estado
     */
    public pe.gob.oefa.ws.seguridad.bean.Estado getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Pagina.
     * 
     * @param estado
     */
    public void setEstado(pe.gob.oefa.ws.seguridad.bean.Estado estado) {
        this.estado = estado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pagina)) return false;
        Pagina other = (Pagina) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idPagina==null && other.getIdPagina()==null) || 
             (this.idPagina!=null &&
              this.idPagina.equals(other.getIdPagina()))) &&
            ((this.idPaginaPadre==null && other.getIdPaginaPadre()==null) || 
             (this.idPaginaPadre!=null &&
              this.idPaginaPadre.equals(other.getIdPaginaPadre()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.icono==null && other.getIcono()==null) || 
             (this.icono!=null &&
              this.icono.equals(other.getIcono()))) &&
            ((this.nivel==null && other.getNivel()==null) || 
             (this.nivel!=null &&
              this.nivel.equals(other.getNivel()))) &&
            ((this.orden==null && other.getOrden()==null) || 
             (this.orden!=null &&
              this.orden.equals(other.getOrden()))) &&
            ((this.visible==null && other.getVisible()==null) || 
             (this.visible!=null &&
              this.visible.equals(other.getVisible()))) &&
            ((this.modulo==null && other.getModulo()==null) || 
             (this.modulo!=null &&
              this.modulo.equals(other.getModulo()))) &&
            ((this.grupo==null && other.getGrupo()==null) || 
             (this.grupo!=null &&
              this.grupo.equals(other.getGrupo()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado())));
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
        if (getIdPagina() != null) {
            _hashCode += getIdPagina().hashCode();
        }
        if (getIdPaginaPadre() != null) {
            _hashCode += getIdPaginaPadre().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getIcono() != null) {
            _hashCode += getIcono().hashCode();
        }
        if (getNivel() != null) {
            _hashCode += getNivel().hashCode();
        }
        if (getOrden() != null) {
            _hashCode += getOrden().hashCode();
        }
        if (getVisible() != null) {
            _hashCode += getVisible().hashCode();
        }
        if (getModulo() != null) {
            _hashCode += getModulo().hashCode();
        }
        if (getGrupo() != null) {
            _hashCode += getGrupo().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pagina.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Pagina"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPagina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdPagina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPaginaPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdPaginaPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Url"));
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
        elemField.setFieldName("icono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Icono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Nivel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Orden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Visible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Modulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Modulo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Grupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Grupo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Estado"));
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
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }
    

    public java.lang.String getAyuda() {
		return ayuda;
	}

	public void setAyuda(java.lang.String ayuda) {
		this.ayuda = ayuda;
	}

	public java.lang.String getPerfil() {
		return perfil;
	}

	public void setPerfil(java.lang.String perfil) {
		this.perfil = perfil;
	}

}
