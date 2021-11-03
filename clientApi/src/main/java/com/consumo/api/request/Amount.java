package com.consumo.api.request;

import java.math.BigDecimal;

public class Amount {

    	private int subtotalIva;
    	private int subtotalIva0;
    	private int ice;
    	private Double iva;
    	private String currency;
    	
		public int getSubtotalIva() {
			return subtotalIva;
		}
		public void setSubtotalIva(int subtotalIva) {
			this.subtotalIva = subtotalIva;
		}
		public int getSubtotalIva0() {
			return subtotalIva0;
		}
		public void setSubtotalIva0(int subtotalIva0) {
			this.subtotalIva0 = subtotalIva0;
		}
		public int getIce() {
			return ice;
		}
		public void setIce(int ice) {
			this.ice = ice;
		}
		public Double getIva() {
			return iva;
		}
		public void setIva(Double iva) {
			this.iva = iva;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
    	    	
}
