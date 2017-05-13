<<<<<<< HEAD
package exercise3;

import javax.swing.JOptionPane;

public class GameObject {

	int objectCenterX, objectCenterY;
	int objectVelocity;
	String objectState;
	int objectRotationAngle;

	// Constructor to initialize variables
	public GameObject(int objectCenterX, int objectCenterY, int objectVelocity, String objectState,
			int objectRotationAngle) {
		super();
		this.objectCenterX = objectCenterX;
		this.objectCenterY = objectCenterY;
		this.objectVelocity = objectVelocity;
		this.objectState = objectState;
		this.objectRotationAngle = objectRotationAngle;
	}

	public int getObjectCenterX() {
		return objectCenterX;
	}

	public int getObjectCenterY() {
		return objectCenterY;
	}

	public int getObjectVelocity() {
		return objectVelocity;
	}

	public String getObjectState() {
		return objectState;
	}

	public int getObjectRotationAngle() {
		return objectRotationAngle;
	}

	// Default Constructor
	public GameObject() {

	}

	// Method To display user input in Formatted String
	public void getGameObject() {
		String message = String.format("Your Object is at (" + getObjectCenterX() + "," + getObjectCenterY() + "). "
				+ "The Velocity of the object is " + getObjectVelocity() + ". Your Object's current state is "
				+ getObjectState() + "." + " Rotation angle of the object is " + getObjectRotationAngle() + ".");

		JOptionPane.showMessageDialog(null, message);

	}
}
=======
package exercise3;

import javax.swing.JOptionPane;

public class GameObject {

	int objectCenterX, objectCenterY;
	int objectVelocity;
	String objectState;
	int objectRotationAngle;

	// Constructor to initialize variables
	public GameObject(int objectCenterX, int objectCenterY, int objectVelocity, String objectState,
			int objectRotationAngle) {
		super();
		this.objectCenterX = objectCenterX;
		this.objectCenterY = objectCenterY;
		this.objectVelocity = objectVelocity;
		this.objectState = objectState;
		this.objectRotationAngle = objectRotationAngle;
	}

	public int getObjectCenterX() {
		return objectCenterX;
	}

	public int getObjectCenterY() {
		return objectCenterY;
	}

	public int getObjectVelocity() {
		return objectVelocity;
	}

	public String getObjectState() {
		return objectState;
	}

	public int getObjectRotationAngle() {
		return objectRotationAngle;
	}

	// Default Constructor
	public GameObject() {

	}

	// Method To display user input in Formatted String
	public void getGameObject() {
		String message = String.format("Your Object is at (" + getObjectCenterX() + "," + getObjectCenterY() + "). "
				+ "The Velocity of the object is " + getObjectVelocity() + ". Your Object's current state is "
				+ getObjectState() + "." + " Rotation angle of the object is " + getObjectRotationAngle() + ".");

		JOptionPane.showMessageDialog(null, message);

	}
}
>>>>>>> origin/master
