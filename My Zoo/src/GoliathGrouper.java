
public class GoliathGrouper extends Fish
	{

		@Override
		public void showThreat()
			{
				System.out.println("The " + name + " threatens by opening its large mouth super wide to intimidate.");
			}

		@Override
		public void sleepTime()
			{
				System.out.println("The " + name + " is active during the day, meaning it is diurnal.");
			}

		public GoliathGrouper()
			{
				name = "Goliath Grouper";
				food = "Barracudas";
			}

	} 
