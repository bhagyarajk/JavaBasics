package com.keepitsimple.objectclass;

public class MobileClass {
	String modelName;
	int ramSize;

	@Override
	public String toString() {
		return "Model Name : " + this.modelName + " " + "Ram size : " + this.ramSize;
	}

}
