package thread;
	public class ImplementigRun implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("implementing Runnable interface");
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ImplementigRun t=new ImplementigRun();
			Thread t1= new Thread(t);
			t1.start();
		}
	}

