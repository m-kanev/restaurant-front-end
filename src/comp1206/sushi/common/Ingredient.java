package comp1206.sushi.common;

import comp1206.sushi.common.Ingredient;
import comp1206.sushi.common.Supplier;

public class Ingredient extends Model {

	private String name;
	private String unit;
	private Supplier supplier;
	private Number stock;
	private Number restockThreshold;
	private Number restockAmount;

	public Ingredient(String name, String unit, Supplier supplier, Number restockThreshold, Number restockAmount) {
		this.setName(name);
		this.setUnit(unit);
		this.setSupplier(supplier);
		this.setRestockThreshold(restockThreshold);
		this.setRestockAmount(restockAmount);
		setStock(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public Number getStock() {
		return stock;
	}

	public void setStock(Number stock) {
		notifyUpdate("Stock", this.stock, stock);
		this.stock = stock;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Number getRestockThreshold() {
		return restockThreshold;
	}

	public void setRestockThreshold(Number restockThreshold) {
		this.restockThreshold = restockThreshold;
	}

	public Number getRestockAmount() {
		return restockAmount;
	}

	public void setRestockAmount(Number restockAmount) {
		this.restockAmount = restockAmount;
	}

}
