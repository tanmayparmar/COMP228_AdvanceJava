<<<<<<< HEAD
package exercise3;

import javax.swing.JOptionPane;

public class GameObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Object of the Game Object Class
		GameObject gameObjectObj = new GameObject();
		
		//saving User input in the variables
		
		gameObjectObj.objectCenterX=Integer.parseInt(JOptionPane.showInputDialog("Please Enter X co-ordinate of the object."));
		gameObjectObj.objectCenterY=Integer.parseInt(JOptionPane.showInputDialog("Please Enter Y co-ordinate of the object."));
		gameObjectObj.objectVelocity=Integer.parseInt(JOptionPane.showInputDialog("Please Enter the velocity of the object on KM/Hour."));
		gameObjectObj.objectState=JOptionPane.showInputDialog("Please Enter the state of the object(Dead or Alive).");
		gameObjectObj.objectRotationAngle=Integer.parseInt(JOptionPane.showInputDialog("Please Enter the angle of the rotation."));
		
		//calling getGameObject Method
		
		gameObjectObj.getGameObject();
	}

}
=======
package exercise3;

import javax.swing.JOptionPane;

public class GameObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Object of the Game Object Class
		GameObject gameObjectObj = new GameObject();
		
		//saving User input in the variables
		
		gameObjectObj.objectCenterX=Integer.parseInt(JOptionPane.showInputDialog("Please Enter X co-ordinate of the object."));
		gameObjectObj.objectCenterY=Integer.parseInt(JOptionPane.showInputDialog("Please Enter Y co-ordinate of the object."));
		gameObjectObj.objectVelocity=Integer.parseInt(JOptionPane.showInputDialog("Please Enter the velocity of the object on KM/Hour."));
		gameObjectObj.objectState=JOptionPane.showInputDialog("Please Enter the state of the object(Dead or Alive).");
		gameObjectObj.objectRotationAngle=Integer.parseInt(JOptionPane.showInputDialog("Please Enter the angle of the rotation."));
		
		//calling getGameObject Method
		
		gameObjectObj.getGameObject();
	}

}
>>>>>>> origin/master
