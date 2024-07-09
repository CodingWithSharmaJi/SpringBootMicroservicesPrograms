package com.brillio.invoice;

public class Invoice {
	
	private String invoiceId;
	private String paidAmt;
	private String CustomerName;
	private String customerEmail;
	private String customerPhn;
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", paidAmt=" + paidAmt + ", CustomerName=" + CustomerName
				+ ", customerEmail=" + customerEmail + ", customerPhn=" + customerPhn + "]";
	}
	public String getPaidAmt() {
		return paidAmt;
	}
	public void setPaidAmt(String paidAmt) {
		this.paidAmt = paidAmt;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhn() {
		return customerPhn;
	}
	public void setCustomerPhn(String customerPhn) {
		this.customerPhn = customerPhn;
	}

}
