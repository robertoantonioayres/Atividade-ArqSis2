package br.usjt.AtividadePrevisaoTempo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "previsao")
public class PrevisaoTempo implements Serializable {
	private static final long serialVersionUID = 1L;
	 @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	   
	    @Column(name = "dia_semana")
	    private String diaSemana;  
	    
	    @Column(name = "temperatura_min")
	    private String temperaturaMin; 
	    
	    @Column(name = "temperatura_max")
	    private String temperaturaMax; 
	    
	    @Column(name = "humidade_relativa")
	    private String humidadeRelativa; 
	    
	    @Column(name = "descricao")
	    private String descricao;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDiaSemana() {
			return diaSemana;
		}

		public void setDiaSemana(String diaSemana) {
			this.diaSemana = diaSemana;
		}

		public String getTemperaturaMin() {
			return temperaturaMin;
		}

		public void setTemperaturaMin(String temperaturaMin) {
			this.temperaturaMin = temperaturaMin;
		}

		public String getTemperaturaMax() {
			return temperaturaMax;
		}

		public void setTemperaturaMax(String temperaturaMax) {
			this.temperaturaMax = temperaturaMax;
		}

		public String getHumidadeRelativa() {
			return humidadeRelativa;
		}

		public void setHumidadeRelativa(String humidadeRelativa) {
			this.humidadeRelativa = humidadeRelativa;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		} 

	
}
