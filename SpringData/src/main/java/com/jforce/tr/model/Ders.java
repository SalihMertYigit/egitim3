package com.jforce.tr.model;
import javax.persistence.*;
@Entity


	@Table(name="dersler")
public class Ders {
		@Id
		private Integer Id;
		
		
		@Column(name="ders_adı")
		private String dersAdı;
		
		@Column(name="ortalama")
		private int dersOrtalamasi;
		
		@Column(name="ders_ortalamasi")
		private double dersortalamasi;
		
		@Column(name="float_ortalamasi")
		private float dersfloatOrtalamasi;
		
		public float getDersfloatOrtalamasi() {
			return dersfloatOrtalamasi;
		}
		public void setDersfloatOrtalamasi(float dersfloatOrtalamasi) {
			this.dersfloatOrtalamasi = dersfloatOrtalamasi;
		}
		public Integer getDersOrtalamasi() {
			return dersOrtalamasi;
		}
		public void setDersOrtalamasi(Integer dersOrtalamasi) {
			this.dersOrtalamasi = dersOrtalamasi;
		}
		public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public String getDersAdı() {
			return dersAdı;
		}
		public void setDersAdı(String dersAdı) {
			this.dersAdı = dersAdı;
		}
		public Ders() {
			
		}
		public double getDersortalamasi() {
			return dersortalamasi;
		}
		public void setDersortalamasi(double dersortalamasi) {
			this.dersortalamasi = dersortalamasi;
		}
		public void setDersOrtalamasi(int dersOrtalamasi) {
			this.dersOrtalamasi = dersOrtalamasi;
		}
		
		
}
