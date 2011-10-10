package com.ebmwebsourcing.petals.services.xslt.generated;

import com.ebmwebsourcing.petals.services.su.wizards.generation.EclipseSuBean;

/****************************************************************************
 * 
 * Copyright (c) 2008-2011, EBM WebSourcing
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
public class XsltService23 {

  protected static String nl;
  public static synchronized XsltService23 create(String lineSeparator)
  {
    nl = lineSeparator;
    XsltService23 result = new XsltService23();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<wsdl:definitions " + NL + "\txmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\"" + NL + "\txmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\" " + NL + "\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" + NL + "\txmlns:tns=\"http://petals.ow2.org/components/xslt/version-2\" " + NL + "\txmlns:mime=\"http://schemas.xmlsoap.org/wsdl/mime/\"" + NL + "\tname=\"XsltService\" " + NL + "\ttargetNamespace=\"http://petals.ow2.org/components/xslt/version-2\">" + NL + "\t" + NL + "\t<!-- Types -->" + NL + "\t<wsdl:types />" + NL + "\t" + NL + "\t" + NL + "\t<!-- Messages -->" + NL + "\t<wsdl:message name=\"transformRequest\">" + NL + "\t\t<wsdl:part name=\"transformRequest\" type=\"xsd:anyType\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<wsdl:message name=\"transformResponse\">" + NL + "\t\t<wsdl:part name=\"transformResponse\" type=\"xsd:anyType\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t" + NL + "\t<!-- Port type -->" + NL + "\t<wsdl:portType name=\"";
  protected final String TEXT_2 = "\">" + NL + "\t\t" + NL + "\t\t<!-- Transform -->" + NL + "\t\t<wsdl:operation name=\"transform\">" + NL + "\t\t\t<wsdl:input message=\"tns:transformRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:transformResponse\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t" + NL + "\t\t<!-- Transform to Attachment -->" + NL + "\t\t<!-- This operation cannot be declared properly in a WSDL -->" + NL + "\t</wsdl:portType>" + NL + "\t" + NL + "\t" + NL + "\t<!-- Binding -->" + NL + "\t<wsdl:binding name=\"";
  protected final String TEXT_3 = "Binding\" type=\"tns:";
  protected final String TEXT_4 = "\">" + NL + "\t\t<soap:binding style=\"document\"" + NL + "\t\t\ttransport=\"http://schemas.xmlsoap.org/soap/http\" />" + NL + "\t\t\t" + NL + "\t\t<wsdl:operation name=\"transform\">" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:binding>" + NL + "\t" + NL + "\t" + NL + "\t<!-- The service -->" + NL + "\t<wsdl:service name=\"";
  protected final String TEXT_5 = "\">" + NL + "\t\t<wsdl:port name=\"";
  protected final String TEXT_6 = "\" binding=\"tns:";
  protected final String TEXT_7 = "Binding\">" + NL + "\t\t\t<soap:address location=\"http://localhost:9090/";
  protected final String TEXT_8 = "\" />" + NL + "\t\t</wsdl:port>" + NL + "\t</wsdl:service>" + NL + "</wsdl:definitions>";
  protected final String TEXT_9 = NL;

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
     EclipseSuBean data = (EclipseSuBean) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( data.getInterfaceName() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(data.getServiceName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append( data.getInterfaceName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( data.getServiceName() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( data.getEndpointName() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(data.getServiceName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append( data.getEndpointName() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}