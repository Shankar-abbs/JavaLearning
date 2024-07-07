package com.basicprograms.opps;
public class Abstract1 
{
	public static void main(String[] args) 
	{
		
		Dog d = new Dog();
		d.air();
		d.Infra();
		d.Sound();
		Tree t = new Tree();
		System.out.println();
		t.air();
		t.Infra();
		t.Sound();
	}
}
interface Universe
{
	void air();
}
interface Nature extends Universe
{
	void Infra();
}
interface Creature extends Universe
{
	void Sound();
}
class Dog implements Nature,Creature
{

	@Override
	public void air() {
		System.out.println("Dog breaths oxygen in air");
	}

	@Override
	public void Sound() {
		System.out.println("Dog makes Woof! sound");
	}

	@Override
	public void Infra() {
		System.out.println("Dog uses nature Infra like Water food etc");
	}	
}
 class Tree implements Nature,Creature
{

	@Override
	public void air() {
		System.out.println("Tree Breaths Oxygen in air");
	}

	@Override
	public void Sound() {
		System.out.println("Tree makes sound with air");
	}

	@Override
	public void Infra() {
		System.out.println("Tree uses infra like water sunlight etc");
	}
	
}