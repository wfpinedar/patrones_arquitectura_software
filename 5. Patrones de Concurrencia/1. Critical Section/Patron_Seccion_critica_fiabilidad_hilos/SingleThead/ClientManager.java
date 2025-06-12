public class ClientManager {

	public static void main(String[] args) {

		FileProcess proceso1 = new FileProcess("Thread 1 is wrtting");
		proceso1.start();
		FileProcess proceso2 = new FileProcess("Thread 2 is writting");
		proceso2.start();
		FileProcess proceso3 = new FileProcess("Thread 3 is writting");
		proceso3.start();
		FileProcess proceso4 = new FileProcess("Thread 4 is writting");
		proceso4.start();
		FileProcess proceso5 = new FileProcess("Thread 5 is writting");
		proceso5.start();
	}
}

class FileProcess extends Thread {
	private String msgLog;

	public FileProcess(String msg) {
		this.msgLog = msg;
	}

	@Override
	public void run() {
		Logger fileLogger;
		long t1,t2,t3,tObtener,tRegistrar;
		for (int i = 0; i < 20; i++) {
			t1 = System.nanoTime();
			fileLogger = FileLogger.getFileLogger();
			t2 = System.nanoTime();
			fileLogger.log(msgLog);
			t3 = System.nanoTime();
			tObtener = t2-t1; // Tiempo que tardo en obtener el registrador de mensajes
			tRegistrar = t3-t2; // Tiempo que tardo en escribir el mensaje

			System.out.println(msgLog.charAt(7)+","+tObtener+" \t"+ "," + tRegistrar);
		}
	}

}
