package Abstraction;

public class Defense {
	public static  void main(String[] args) {
		System.out.println("Army");
		duty(new Army());
		System.out.println();
		System.out.println("Navy");
		duty(new Navy());
		System.out.println();
		System.out.println("Airforce");
		duty(new Airforce());
	}
	static void duty(SecurityForce sf) {
		sf.protect();
	}

}
abstract class SecurityForce {
	abstract void protect(); 
}
class Army extends SecurityForce{
	void useTank() {
		System.out.println("Army use tanks");
	}
	void protect() {
		
		System.out.println("protect lands");
	}
}
	class Navy extends SecurityForce{
		void useShip() {
			System.out.println("Navy use Ships");
		}
		void protect() {
			
			System.out.println("protect waterways");
		}
	}
		class Airforce extends SecurityForce{
			void useJet() {
				System.out.println("Airforce use jets");
			}
			void protect() {
				
				System.out.println("protect airways");
			}

}
