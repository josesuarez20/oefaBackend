/**
 * RespuestaVehiculoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunarp.service;

public class RespuestaVehiculoBean  implements java.io.Serializable {
    private java.lang.String color;

    private java.lang.String estado;

    private java.lang.String marca;

    private java.lang.String modelo;

    private java.lang.String nro_motor;

    private java.lang.String placa;

    private java.lang.String[] propietarios;

    private java.lang.String sede;

    private java.lang.String serie;

    private java.lang.String vin;

    public RespuestaVehiculoBean() {
    }

    public RespuestaVehiculoBean(
           java.lang.String color,
           java.lang.String estado,
           java.lang.String marca,
           java.lang.String modelo,
           java.lang.String nro_motor,
           java.lang.String placa,
           java.lang.String[] propietarios,
           java.lang.String sede,
           java.lang.String serie,
           java.lang.String vin) {
           this.color = color;
           this.estado = estado;
           this.marca = marca;
           this.modelo = modelo;
           this.nro_motor = nro_motor;
           this.placa = placa;
           this.propietarios = propietarios;
           this.sede = sede;
           this.serie = serie;
           this.vin = vin;
    }


    /**
     * Gets the color value for this RespuestaVehiculoBean.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this RespuestaVehiculoBean.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the estado value for this RespuestaVehiculoBean.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this RespuestaVehiculoBean.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the marca value for this RespuestaVehiculoBean.
     * 
     * @return marca
     */
    public java.lang.String getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this RespuestaVehiculoBean.
     * 
     * @param marca
     */
    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }


    /**
     * Gets the modelo value for this RespuestaVehiculoBean.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this RespuestaVehiculoBean.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the nro_motor value for this RespuestaVehiculoBean.
     * 
     * @return nro_motor
     */
    public java.lang.String getNro_motor() {
        return nro_motor;
    }


    /**
     * Sets the nro_motor value for this RespuestaVehiculoBean.
     * 
     * @param nro_motor
     */
    public void setNro_motor(java.lang.String nro_motor) {
        this.nro_motor = nro_motor;
    }


    /**
     * Gets the placa value for this RespuestaVehiculoBean.
     * 
     * @return placa
     */
    public java.lang.String getPlaca() {
        return placa;
    }


    /**
     * Sets the placa value for this RespuestaVehiculoBean.
     * 
     * @param placa
     */
    public void setPlaca(java.lang.String placa) {
        this.placa = placa;
    }


    /**
     * Gets the propietarios value for this RespuestaVehiculoBean.
     * 
     * @return propietarios
     */
    public java.lang.String[] getPropietarios() {
        return propietarios;
    }


    /**
     * Sets the propietarios value for this RespuestaVehiculoBean.
     * 
     * @param propietarios
     */
    public void setPropietarios(java.lang.String[] propietarios) {
        this.propietarios = propietarios;
    }

    public java.lang.String getPropietarios(int i) {
        return this.propietarios[i];
    }

    public void setPropietarios(int i, java.lang.String _value) {
        this.propietarios[i] = _value;
    }


    /**
     * Gets the sede value for this RespuestaVehiculoBean.
     * 
     * @return sede
     */
    public java.lang.String getSede() {
        return sede;
    }


    /**
     * Sets the sede value for this RespuestaVehiculoBean.
     * 
     * @param sede
     */
    public void setSede(java.lang.String sede) {
        this.sede = sede;
    }


    /**
     * Gets the serie value for this RespuestaVehiculoBean.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this RespuestaVehiculoBean.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the vin value for this RespuestaVehiculoBean.
     * 
     * @return vin
     */
    public java.lang.String getVin() {
        return vin;
    }


    /**
     * Sets the vin value for this RespuestaVehiculoBean.
     * 
     * @param vin
     */
    public void setVin(java.lang.String vin) {
        this.vin = vin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaVehiculoBean)) return false;
        RespuestaVehiculoBean other = (RespuestaVehiculoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.nro_motor==null && other.getNro_motor()==null) || 
             (this.nro_motor!=null &&
              this.nro_motor.equals(other.getNro_motor()))) &&
            ((this.placa==null && other.getPlaca()==null) || 
             (this.placa!=null &&
              this.placa.equals(other.getPlaca()))) &&
            ((this.propietarios==null && other.getPropietarios()==null) || 
             (this.propietarios!=null &&
              java.util.Arrays.equals(this.propietarios, other.getPropietarios()))) &&
            ((this.sede==null && other.getSede()==null) || 
             (this.sede!=null &&
              this.sede.equals(other.getSede()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.vin==null && other.getVin()==null) || 
             (this.vin!=null &&
              this.vin.equals(other.getVin())));
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
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getNro_motor() != null) {
            _hashCode += getNro_motor().hashCode();
        }
        if (getPlaca() != null) {
            _hashCode += getPlaca().hashCode();
        }
        if (getPropietarios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropietarios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropietarios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSede() != null) {
            _hashCode += getSede().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getVin() != null) {
            _hashCode += getVin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaVehiculoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "respuestaVehiculoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("", "color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marca"));
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
        elemField.setFieldName("nro_motor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nro_motor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propietarios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propietarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sede");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sede"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
