package com.bridgelabz.annotation;

public class Heart {
	
	private String AnimalName;
	private String NoOfAnimal;
	
	public void setAnimalName(String animalName) {
		AnimalName = animalName;
	}

	public void setNoOfAnimal(String noOfAnimal) {
		NoOfAnimal = noOfAnimal;
	}

	public void pump()
	{
		System.out.println("You heart Puming");
	}

}
