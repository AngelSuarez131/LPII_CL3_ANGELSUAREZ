package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_productocl3 database table.
 * 
 */
@Entity
@NamedQuery(name="TblProductocl3.findAll", query="SELECT t FROM TblProductocl3 t")
public class TblProductocl3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int isproductoscl3;

	private String descripcl3;

	private String estadocl3;

	private String nombrecl3;

	private double preciocompcl3;

	private double precioventacl3;

	public TblProductocl3() {
	}

	public int getIsproductoscl3() {
		return this.isproductoscl3;
	}

	public void setIsproductoscl3(int isproductoscl3) {
		this.isproductoscl3 = isproductoscl3;
	}

	public String getDescripcl3() {
		return this.descripcl3;
	}

	public void setDescripcl3(String descripcl3) {
		this.descripcl3 = descripcl3;
	}

	public String getEstadocl3() {
		return this.estadocl3;
	}

	public void setEstadocl3(String estadocl3) {
		this.estadocl3 = estadocl3;
	}

	public String getNombrecl3() {
		return this.nombrecl3;
	}

	public void setNombrecl3(String nombrecl3) {
		this.nombrecl3 = nombrecl3;
	}

	public double getPreciocompcl3() {
		return this.preciocompcl3;
	}

	public void setPreciocompcl3(double preciocompcl3) {
		this.preciocompcl3 = preciocompcl3;
	}

	public double getPrecioventacl3() {
		return this.precioventacl3;
	}

	public void setPrecioventacl3(double precioventacl3) {
		this.precioventacl3 = precioventacl3;
	}

}