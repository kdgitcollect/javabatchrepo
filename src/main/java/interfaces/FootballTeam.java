package main.java.interfaces;

public interface FootballTeam {
//	public String fname = "kd";
	public void printFootballName();
	default void show()
	{
		System.out.println("Default TestInterface1");
	}

//	public interface FootballTeam1{
//		public void printFootballName1();
//		
//	}
}
