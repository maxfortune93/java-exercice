package heranca;

import java.text.NumberFormat;

public class Fornecedor extends pessoa {
		private float valorCredito;
		private float valorDivida;
		
		
		
		
		
		public Fornecedor(String nome, String endereço, String telefone) {
			super(nome, endereço,telefone);
		}
		
		public Fornecedor(String nome, String endereço, String telefone, float valorCredito, float valorDivida) {
			super(nome, endereço, telefone);
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
		}



		public float obterSaldo() {
			return this.valorCredito - this.valorDivida;
		}
		
		
		public String format(float number) {
			return NumberFormat.getCurrencyInstance().format(number);
		}

		@Override
		public String toString() {
			return  super.toString() 
					+ " Fornecedor[valorCredito= " + this.format(valorCredito) + ", valorDivida= " 
					+ this.format(valorDivida)
					+", saldo= "+this.format(this.obterSaldo())+ "]";
		}

		//getters and setters
		public float getValorCredito() {
			return valorCredito;
		}
		public void setValorCredito(float valorCredito) {
			this.valorCredito = valorCredito;
		}
		public float getValorDivida() {
			return valorDivida;
		}
		public void setValorDivida(float valorDivida) {
			this.valorDivida = valorDivida;
		}
		
}

