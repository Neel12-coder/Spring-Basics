package sep;

public class Beans
{
private Animal animal;

Beans(Animal animal)
{
this.animal = animal;

}

public void shout()
{
animal.makeNoise();
}
}