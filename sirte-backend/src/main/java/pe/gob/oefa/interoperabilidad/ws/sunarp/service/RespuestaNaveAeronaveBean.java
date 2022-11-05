/**
 * RespuestaNaveAeronaveBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunarp.service;

public class RespuestaNaveAeronaveBean  implements java.io.Serializable {
    private java.lang.String libro;

    private java.lang.String matricula;

    private java.lang.String mensaje;

    private java.lang.String modelo;

    private java.lang.String numeroFicha;

    private java.lang.String numeroPartida;

    private java.lang.String numeroSerie;

    private java.lang.String oficina;

    private java.lang.String registro;

    private java.lang.String tipoBien;

    private java.lang.String[] tomoFolio;

    public RespuestaNaveAeronaveBean() {
    }

    public RespuestaNaveAeronaveBean(
           java.lang.String libro,
           java.lang.String matricula,
           java.lang.String mensaje,
           java.lang.String modelo,
           java.lang.String numeroFicha,
           java.lang.String numeroPartida,
           java.lang.String numeroSerie,
           java.lang.String oficina,
           java.lang.String registro,
           java.lang.String tipoBien,
           java.lang.String[] tomoFolio) {
           this.libro = libro;
           this.matricula = matricula;
           this.mensaje = mensaje;
           this.modelo = modelo;
           this.numeroFicha = numeroFicha;
           this.numeroPartida = numeroPartida;
           this.numeroSerie = numeroSerie;
           this.oficina = oficina;
           this.registro = registro;
           this.tipoBien = tipoBien;
           this.tomoFolio = tomoFolio;
    }


    /**
     * Gets the libro value for this RespuestaNaveAeronaveBean.
     * 
     * @return libro
     */
    public java.lang.String getLibro() {
        return libro;
    }


    /**
     * Sets the libro value for this RespuestaNaveAeronaveBean.
     * 
     * @param libro
     */
    public void setLibro(java.lang.String libro) {
        this.libro = libro;
    }


    /**
     * Gets the matricula value for this RespuestaNaveAeronaveBean.
     * 
     * @return matricula
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this RespuestaNaveAeronaveBean.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the mensaje value for this RespuestaNaveAeronaveBean.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this RespuestaNaveAeronaveBean.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the modelo value for this RespuestaNaveAeronaveBean.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this RespuestaNaveAeronaveBean.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the numeroFicha value for this RespuestaNaveAeronaveBean.
     * 
     * @return numeroFicha
     */
    public java.lang.String getNumeroFicha() {
        return numeroFicha;
    }


    /**
     * Sets the numeroFicha value for this RespuestaNaveAeronaveBean.
     * 
     * @param numeroFicha
     */
    public void setNumeroFicha(java.lang.String numeroFicha) {
        this.numeroFicha = numeroFicha;
    }


    /**
     * Gets the numeroPartida value for this RespuestaNaveAeronaveBean.
     * 
     * @return numeroPartida
     */
    public java.lang.String getNumeroPartida() {
        return numeroPartida;
    }


    /**
     * Sets the numeroPartida value for this RespuestaNaveAeronaveBean.
     * 
     * @param numeroPartida
     */
    public void setNumeroPartida(java.lang.String numeroPartida) {
        this.numeroPartida = numeroPartida;
    }


    /**
     * Gets the numeroSerie value for this RespuestaNaveAeronaveBean.
     * 
     * @return numeroSerie
     */
    public java.lang.String getNumeroSerie() {
        return numeroSerie;
    }


    /**
     * Sets the numeroSerie value for this RespuestaNaveAeronaveBean.
     * 
     * @param numeroSerie
     */
    public void setNumeroSerie(java.lang.String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }


    /**
     * Gets the oficina value for this RespuestaNaveAeronaveBean.
     * 
     * @return oficina
     */
    public java.lang.String getOficina() {
        return oficina;
    }


    /**
     * Sets the oficina value for this RespuestaNaveAeronaveBean.
     * 
     * @param oficina
     */
    public void setOficina(java.lang.String oficina) {
        this.oficina = oficina;
    }


    /**
     * Gets the registro value for this RespuestaNaveAeronaveBean.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this RespuestaNaveAeronaveBean.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the tipoBien value for this RespuestaNaveAeronaveBean.
     * 
     * @return tipoBien
     */
    public java.lang.String getTipoBien() {
        return tipoBien;
    }


    /**
     * Sets the tipoBien value for this RespuestaNaveAeronaveBean.
     * 
     * @param tipoBien
     */
    public void setTipoBien(java.lang.String tipoBien) {
        this.tipoBien = tipoBien;
    }


    /**
     * Gets the tomoFolio value for this RespuestaNaveAeronaveBean.
     * 
     * @return tomoFolio
     */
    public java.lang.String[] getTomoFolio() {
        return tomoFolio;
    }


    /**
     * Sets the tomoFolio value for this RespuestaNaveAeronaveBean.
     * 
     * @param tomoFolio
     */
    public void setTomoFolio(java.lang.String[] tomoFolio) {
        this.tomoFolio = tomoFolio;
    }

    public java.lang.String getTomoFolio(int i) {
        return this.tomoFolio[i];
    }

    public void setTomoFolio(int i, java.lang.String _value) {
        this.tomoFolio[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaNaveAeronaveBean)) return false;
        RespuestaNaveAeronaveBean other = (RespuestaNaveAeronaveBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.libro==null && other.getLibro()==null) || 
             (this.libro!=null &&
              this.libro.equals(other.getLibro()))) &&
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.numeroFicha==null && other.getNumeroFicha()==null) || 
             (this.numeroFicha!=null &&
              this.numeroFicha.equals(other.getNumeroFicha()))) &&
            ((this.numeroPartida==null && other.getNumeroPartida()==null) || 
             (this.numeroPartida!=null &&
              this.numeroPartida.equals(other.getNumeroPartida()))) &&
            ((this.numeroSerie==null && other.getNumeroSerie()==null) || 
             (this.numeroSerie!=null &&
              this.numeroSerie.equals(other.getNumeroSerie()))) &&
            ((this.oficina==null && other.getOficina()==null) || 
             (this.oficina!=null &&
              this.oficina.equals(other.getOficina()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.tipoBien==null && other.getTipoBien()==null) || 
             (this.tipoBien!=null &&
              this.tipoBien.equals(other.getTipoBien()))) &&
            ((this.tomoFolio==null && other.getTomoFolio()==null) || 
             (this.tomoFolio!=null &&
              java.util.Arrays.equals(this.tomoFolio, other.getTomoFolio())));
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
        if (getLibro() != null) {
            _hashCode += getLibro().hashCode();
        }
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getNumeroFicha() != null) {
            _hashCode += getNumeroFicha().hashCode();
        }
        if (getNumeroPartida() != null) {
            _hashCode += getNumeroPartida().hashCode();
        }
        if (getNumeroSerie() != null) {
            _hashCode += getNumeroSerie().hashCode();
        }
        if (getOficina() != null) {
            _hashCode += getOficina().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getTipoBien() != null) {
            _hashCode += getTipoBien().hashCode();
        }
        if (getTomoFolio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTomoFolio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTomoFolio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaNaveAeronaveBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "respuestaNaveAeronaveBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("libro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "libro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroFicha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroFicha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPartida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroPartida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oficina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoBien");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoBien"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tomoFolio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tomoFolio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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

}
