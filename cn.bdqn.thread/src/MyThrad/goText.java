package MyThrad;

public class goText {

	public static void main(String[] args) {
		/*gotomorrow gotomorrow = new gotomorrow("��ͨ��", 500);
		gotomo gotomo = new gotomo("�����", 1000);
		
		gotomo.setPriority(Thread.MAX_PRIORITY);//����Ÿ��ʸ�
		
		gotomorrow.start();
		
		gotomo.start();*/
		Thread thread = new Thread(new Runnable() {			
			@Override
			public void run() {
				for (int i = 1; i <=10; i++) {
					System.out.println("����ţ�"+i+"�Ų����ڿ�������");
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
					System.out.println("��ͨ�ţ�"+i+"�Ų����ڿ�������");
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
					System.out.println("����ţ�"+i+"�Ų����ڿ�����");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		//�����������ȼ�
		t1.setPriority(10);;
		
		Thread t2 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for (int i = 1; i <= 50; i++) {
							System.out.println("��ͨ�ţ�"+i+"�Ų����ڿ�����");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							if (i==10) {
								//�쳣����
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
