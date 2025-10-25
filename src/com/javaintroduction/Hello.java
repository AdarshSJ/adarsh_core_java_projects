package com.javaintroduction;

class Main implements Runnable {
	    public void run() {
	        for(int i=1; i<=50; i++) {
	            System.out.println("Hello " + i);
	            try {
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

	class Hi implements Runnable {
	    public void run() {
	        for(int i=1; i<=50; i++) {
	            System.out.println("Hi " + i);
	            try {
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

	public class Hello {
	    public static void main(String[] args) {
	        Runnable obj1 = new Main();
	        Runnable obj2 = new Hi();
	        
	        Thread t1 = new Thread(obj1);
	        Thread t2 = new Thread(obj2);
	        
	        t1.start();
	        t2.start();
	    }
	}


