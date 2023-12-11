package FinalExam;




public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HadisExam q = new HadisExam(4);
		
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		
		q.PrintTasktask();
		System.out.println("================");
		//q.removeEQ();
		q.PrintTasktask();
		
		
		q.enqueue(10);
		q.PrintTasktask();
		
		q.dequeue();
		q.PrintTasktask();
		
		System.out.println("========the front is ======");
		q.isEmpty();
		
		
			   q.insert(3);
			   q.insert(5);
			   q.insert(9);
			   q.insert(1);
			   q.insert(12);
			   q.insert(15);
			   System.out.print("Queue: ");
	
			  }
}

