package co.edu.usb.cali.banco.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the cuenta database table.
 * 
 */

public class CuentaDTO {
	

	private String cuenId;

	private String activa;

	private String clave;

	private BigDecimal saldo;

	private  long clieId;

	public CuentaDTO(String cuenId, String activa, String clave, BigDecimal saldo, long clieId) {
		super();
		this.cuenId = cuenId;
		this.activa = activa;
		this.clave = clave;
		this.saldo = saldo;
		this.clieId = clieId;
	}

	public CuentaDTO() {
		super();
	}

	public String getCuenId() {
		return cuenId;
	}

	public void setCuenId(String cuenId) {
		this.cuenId = cuenId;
	}

	public String getActiva() {
		return activa;
	}

	public void setActiva(String activa) {
		this.activa = activa;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public long getClieId() {
		return clieId;
	}

	public void setClieId(long clieId) {
		this.clieId = clieId;
	}

	

}