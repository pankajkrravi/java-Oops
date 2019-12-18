package com.goomo.Components;

public class GraphicCard {
	private String brand;
	private int series;
	private String memory;

	public GraphicCard() {
		this.brand = "Nvedia";
		this.series = 1605;
		this.memory = "4 GB";
	}

	public GraphicCard(String brand, int series, String memory) {
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "GraphicCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}

}
