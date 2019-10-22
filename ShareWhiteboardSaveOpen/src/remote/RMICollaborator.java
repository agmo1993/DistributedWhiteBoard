package remote;

import java.rmi.RemoteException;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.IOException; 
import java.rmi.Remote; 
import java.util.Properties;
public interface RMICollaborator extends Remote {  
	public Identity getIdentity() throws RemoteException;
  // Connect to a mediator − subclasses dictate properties needed  
public boolean connect(Properties p) throws RemoteException;
  // Outgoing messages/data  
public boolean send(String tag, String msg, Identity dst)throws IOException, RemoteException;  
public boolean send(String tag, Object data, Identity dst)throws IOException, RemoteException;  
public boolean broadcast(String tag, String msg)throws IOException, RemoteException;  
public boolean broadcast(String tag, Object data)throws IOException, RemoteException;

  // Incoming messages/data  
public boolean notify(String tag, String msg, Identity src)throws IOException, RemoteException;  
public boolean notify(String tag, Object data, Identity src)throws IOException, RemoteException;
public boolean notifyPaint(String shape, Color col, MouseEvent e, int X, int Y, int brushSize)throws IOException, RemoteException; 

}