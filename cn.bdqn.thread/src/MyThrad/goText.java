package MyThrad;

public class goText {

	public static void main(String[] args) {
		/*gotomorrow gotomorrow = new gotomorrow("普通号", 500);
		gotomo gotomo = new gotomo("特需号", 1000);
		
		gotomo.setPriority(Thread.MAX_PRIORITY);//特需号概率高
		
		gotomorrow.start();
		
		gotomo.start();*/
		Thread thread = new Thread(new Runnable() {			
			@Override
			public void run() {
				for (int i = 1; i <=10; i++) {
					System.out.println("特需号："+i+"号病人在看病！！");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}				
			}
		});
		thread.setPriority(10);
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <=50; i++) {
					System.out.println("普通号："+i+"号病人在看病！！");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
					if (i==10) {
						try {
							thread.join();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
				}
				
			}
		});
		
		
		thread.start();
		thread2.start();
Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("特需号："+i+"号病人在看病！");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		//特需号提高优先级
		t1.setPriority(10);;
		
		Thread t2 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for (int i = 1; i <= 50; i++) {
							System.out.println("普通号："+i+"号病人在看病！");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							if (i==10) {
								//异常处理
								try {
									t1.join();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				});
		t1.start();
		t2.start();

	}

}
