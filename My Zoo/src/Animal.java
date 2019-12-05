
public abstract class Animal
	{
		protected String name;
		protected String food;

		public abstract void bearYoung();

		public abstract void showThreat();

		public abstract void sleepTime();

		public void eat()
			{
				System.out.println("The " + name + " likes to eat " + food + ".");
			}
	}
