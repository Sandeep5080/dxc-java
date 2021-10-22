package abstraction;

public class Signal {
	

		public static void main(String[] args) {
		
			Tv s = new Remote();
					
			s.Tvon();
			s.TvOff();
			s.Tvpower(12);
			s.TvAv();
		}


}
