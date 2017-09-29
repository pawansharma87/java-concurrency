package executer.firstresult.prg4;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class UserValidator {

	public String name;

	public UserValidator(String name) {
		this.name = name;
	}

	public boolean validate(String name, String password) {
		Random random = new Random();
		try {
			long duration = (long) (Math.random() * 10);
			System.out.printf(
					"Validator %s: Validating a user during %dseconds\n",
					this.name, duration);
			//TimeUnit.SECONDS.sleep(duration);
		} catch (Exception e) {
			return false;
		}
		return random.nextBoolean();
	}

	public String getName() {
		return name;
	}
}
