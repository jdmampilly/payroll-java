package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="OT_TABLE")
public class OtTable implements Serializable {
	private static final long serialVersionUID = 6882760035241203545L;
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="id")
	  private int id;
	  @Column(name="OT_RATE1")
	  private double otRate1;
	  @Column(name="OT_RATE2")
	  private double otRate2;
	  @Column(name="NS_AMT")
	  private double nightShiftAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getOtRate1() {
		return otRate1;
	}
	public void setOtRate1(double otRate1) {
		this.otRate1 = otRate1;
	}
	public double getOtRate2() {
		return otRate2;
	}
	public void setOtRate2(double otRate2) {
		this.otRate2 = otRate2;
	}
	public double getNightShiftAmount() {
		return nightShiftAmount;
	}
	public void setNightShiftAmount(double nightShiftAmount) {
		this.nightShiftAmount = nightShiftAmount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nightShiftAmount, otRate1, otRate2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		OtTable other = (OtTable) obj;
		return id == other.id
				&& Double.doubleToLongBits(nightShiftAmount) == Double.doubleToLongBits(other.nightShiftAmount)
				&& Double.doubleToLongBits(otRate1) == Double.doubleToLongBits(other.otRate1)
				&& Double.doubleToLongBits(otRate2) == Double.doubleToLongBits(other.otRate2);
	}
	@Override
	public String toString() {
		return "OtTable [id=" + id + ", otRate1=" + otRate1 + ", otRate2=" + otRate2 + ", nightShiftAmount="
				+ nightShiftAmount + "]";
	}





}
