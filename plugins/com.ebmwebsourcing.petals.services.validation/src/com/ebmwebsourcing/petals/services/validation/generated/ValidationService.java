package com.ebmwebsourcing.petals.services.validation.generated;

import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/****************************************************************************
 * 
 * Copyright (c) 2009-2012, EBM WebSourcing
 * 
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 * 
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 * 
 *****************************************************************************/

/**
  * This class was generated by EMF JET. 
  * <b>DO NOT MODIFY IT!</b>
  * @author Adrien LOUIS - EBM WebSourcing 
  */
public class ValidationService {

  protected static String nl;
  public static synchronized ValidationService create(String lineSeparator)
  {
    nl = lineSeparator;
    ValidationService result = new ValidationService();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<wsdl:definitions " + NL + "\tname=\"ValidationService\"" + NL + "\txmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\" " + NL + "\txmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\"" + NL + "\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" " + NL + "\txmlns:tns=\"http://petals.ow2.org/components/validation/version-1\"" + NL + "\ttargetNamespace=\"http://petals.ow2.org/components/validation/version-1\">" + NL + "\t" + NL + "\t<!-- Types -->" + NL + "\t<wsdl:types>" + NL + "\t\t<xsd:schema " + NL + "\t\t\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" + NL + "\t\t\ttargetNamespace=\"http://petals.ow2.org/components/validation/version-1\"" + NL + "\t\t\telementFormDefault=\"qualified\">" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"validateResponse\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"valid\" type=\"xsd:boolean\" maxOccurs=\"1\" minOccurs=\"1\" />" + NL + "\t\t\t\t\t\t<xsd:element name=\"comment\" type=\"xsd:string\" maxOccurs=\"1\" minOccurs=\"0\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "" + NL + "\t\t\t<xsd:element name=\"validationFault\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"message\" type=\"xsd:string\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t</xsd:schema>" + NL + "\t</wsdl:types>" + NL + "\t" + NL + "\t<!-- Port type and messages -->" + NL + "\t<wsdl:message name=\"validateRequest\">" + NL + "\t\t<wsdl:part \tname=\"validateRequest\" type=\"xsd:anyType\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<wsdl:message name=\"validateResponse\">" + NL + "\t\t<wsdl:part \tname=\"validateResponse\" element=\"tns:validateResponse\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<wsdl:message name=\"filterRequest\">" + NL + "\t\t<wsdl:part \tname=\"filterRequest\" type=\"xsd:anyType\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<wsdl:message name=\"filterResponse\">" + NL + "\t\t<wsdl:part \tname=\"filterResponse\" type=\"xsd:anyType\" />" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<wsdl:message name=\"filterFault\">" + NL + "\t\t<wsdl:part name=\"filterFault\" element=\"tns:validationFault\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<wsdl:portType name=\"";
  protected final String TEXT_2 = "\">" + NL + "\t\t<wsdl:operation name=\"validate\">" + NL + "\t\t\t<wsdl:input message=\"tns:validateRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:validateResponse\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t" + NL + "\t\t<wsdl:operation name=\"filter\">" + NL + "\t\t\t<wsdl:input message=\"tns:filterRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:filterResponse\" />" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:filterFault\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:portType>" + NL + "" + NL + "\t<!-- Bindings -->" + NL + "\t<wsdl:binding name=\"";
  protected final String TEXT_3 = "Binding\" type=\"tns:";
  protected final String TEXT_4 = "\">" + NL + "\t\t<soap:binding style=\"document\"" + NL + "\t\t\ttransport=\"http://schemas.xmlsoap.org/soap/http\" />" + NL + "" + NL + "\t\t<wsdl:operation name=\"validate\">" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t" + NL + "\t\t<wsdl:operation name=\"filter\">" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t\t<wsdl:fault name=\"fault\">" + NL + "\t\t\t\t<soap:fault use=\"literal\" name=\"fault\" />" + NL + "\t\t\t</wsdl:fault>" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:binding>" + NL + "" + NL + "\t<!-- Service -->" + NL + "\t<wsdl:service name=\"";
  protected final String TEXT_5 = "\">" + NL + "\t\t<wsdl:port name=\"";
  protected final String TEXT_6 = "\" binding=\"tns:";
  protected final String TEXT_7 = "Binding\">" + NL + "\t\t\t<soap:address location=\"http://petals.ow2.org/";
  protected final String TEXT_8 = "/";
  protected final String TEXT_9 = "\"/>" + NL + "\t\t</wsdl:port>" + NL + "\t</wsdl:service>" + NL + "</wsdl:definitions>";

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
     AbstractEndpoint data = (AbstractEndpoint) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(data.getInterfaceName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(data.getServiceName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(data.getInterfaceName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(data.getServiceName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(data.getEndpointName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(data.getServiceName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(data.getServiceName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(data.getEndpointName());
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}