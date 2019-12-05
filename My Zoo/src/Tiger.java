
public class Tiger extends Mammal
	{

		@Override
		public void showThreat()
			{
				System.out.println("The " + name + " threatens by showing its teeth.");
			}

		public Tiger()
			{
				name = "Tiger";
				food = "Moose";
			}

		@Override
		public void sleepTime()
			{
				System.out.println("The " + name
						+ " likes to sleep during the day and is active at night, meaning it is nocturnal.");
			}

	}
