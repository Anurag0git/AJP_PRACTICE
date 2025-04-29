import java.rmi.*;

import java.rmi.server.*;

import java.rmi.server.UnicastRemoteObject;

/********************UnicastRemoteObject*****************************

Used for exporting a remote object with JRMP and

obtaining a stub that communicates to the remote object

*********************************************************************/

public class palin_impl extends UnicastRemoteObject implements
string_palindrome{

// Default constructor to throw RemoteException and create object for UnicastRemoteObjec

// from its parent constructor

palin_impl() throws RemoteException

{

super();

}

// Implementation of the palin interface

public boolean palin(String str) throws RemoteException{


// Pointers pointing to the beginning

// and the end of the string

int i = 0, j = str.length() - 1;

// While there are characters to compare

while (i < j) {

// If there is a mismatch

if (str.charAt(i) != str.charAt(j))

return false;

// Increment first pointer and

// decrement the other

i++;

j--;

}

// Given string is a palindrome

return true;

}

}
