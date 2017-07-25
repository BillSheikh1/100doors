public class Door {

	private boolean open;

	public Door() {

		open = false;

	}

	public boolean isOpen() {
		if(open) {
			return true;
		}
		else {
			return false;
		}
	}

	public void changeDoor() {
		if(open) {
			open = false;
		}
		else {
			open = true;
		}
	}

	


}