/**
 * 
 */
package com.Iinerface;

/**
 * @author vinoth
 *
 */

interface Buliding {
	void hall();
	void bedRoom();
	void kitchen();

}

public class VinothHouse implements Buliding {

	public void hall() {
		System.out.println("WELCOME MY HALL");
	}

	public void bedRoom() {
		System.out.println("BEDROOM");
	}

	public void kitchen() {
		System.out.println("WELCOME MY KITCHEN");
	}
	
	public static void main(String args[]){
		VinothHouse house=new VinothHouse();
		house.bedRoom();
		house.hall();
		house.kitchen();
	}
	

}
