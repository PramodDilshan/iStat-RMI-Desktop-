/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.observers;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author student
 */
public interface Subject extends Remote{
    
    public void registerObserver(Observer observer)throws RemoteException;
    
    public void unregisterObserver(Observer observer)throws RemoteException;
    
    public void notifyAllObservers()throws RemoteException;
    
}
