package multithreading123;

class mythread implements Runnable {
	
	public void run() {
		//  task in this method
		for(int i =0 ;i<10; i++) {
			System.out.println("System.out.ptintln "+i);
			
			// implements sleep 
			// to implements sleep method using try & catch
			try {
				Thread.sleep(1000);
			}
			catch
				(Exception e){}
			
			
		}
		
	}
	
	
	public static void main (String args[]) {
		//  create thread object
		
		mythread t =new mythread();
		// creat thread class
		Thread thr = new Thread(t);
		thr.run();
				
	}

	

}
