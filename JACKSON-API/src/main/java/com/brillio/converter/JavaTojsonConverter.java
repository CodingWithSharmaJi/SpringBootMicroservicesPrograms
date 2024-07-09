package com.brillio.converter;

import com.brillio.invoice.Invoice;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

public class JavaTojsonConverter {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Invoice invoice=new Invoice();
		invoice.setInvoiceId("INV-101");
		invoice.setPaidAmt("1100");
		invoice.setCustomerName("Vaibhav Sharma");
		invoice.setCustomerEmail("vs14190@gmai.com");
		invoice.setCustomerPhn("9988552233");
		
		ObjectMapper ojectmapper = new ObjectMapper();
		ojectmapper.writeValue(new File("invoice.json"), invoice);

	}

}
