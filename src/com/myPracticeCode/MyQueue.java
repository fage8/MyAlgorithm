package com.myPracticeCode;
/**
 * �Զ���ʵ��queue
 * @author Administrator
 *
 */
public class MyQueue {
	private long a[];
	private int size; //�����С
	private int nItems;//ʵ�ʴ洢����
	private int front;//ͷ
	private int rear;//β
	
	public MyQueue(int maxSize){//������������г�ʼ��
		this.size = maxSize;
		a = new long[size];
		nItems = 0;
		front = 0;
		rear = -1;
	}
	
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		return (nItems == 0);
	}
		
	//�ж϶����Ƿ�����
	public boolean isFull(){
		return (nItems == size);
	}
	
	//����ʵ�ʴ洢������С
	public int size(){
		return nItems;
	}
	
	//�������������
	public void insert(long value){
		if(isFull()){
			System.out.println("����������");
			return ;
		}
		rear = ++nItems % size;
		a[rear] = value;//βָ�����˾�ѭ����0��,����൱������ע������    
		nItems++;
		/*if(rear == size-1){
			rear = -1;
		}
		a[++rear] = value;*/
	}
	//ɾ���������ݣ������µĶ�ͷԪ��
	public long remove(){
		if(isEmpty()){
			System.out.println("����Ϊ�գ�");
			return 0;
		}
		nItems--;
		front = front % size;
		return a[front++];
	}
	//ȡ����ͷ��Ԫ��
	public long peek(){
		if(isEmpty()){
			System.out.println("����Ϊ�գ�");
			return 0;
		}
		return a[front];
	}
	
	//��ӡ ����
	public void display(){
		if(isEmpty()){
			System.out.println("����Ϊ�գ�");
			return;
		}
		int item=front;
		for(int i=0;i<nItems;i++){
			System.out.println(a[item++ % size]+" ");
		}
		System.out.println(" ");
	}
	
	//����
    public static void main(String[] args) throws Exception{
    	MyQueue roundQueue = new MyQueue(30);
    	roundQueue.insert(3);
    	roundQueue.insert(6);
    	roundQueue.insert(9);
 
        System.out.println("��ӡ����� ");
        roundQueue.display();
        
        int elem = (int)roundQueue.remove();
        System.out.println("�Ƴ�����===�� "+elem);
        System.out.println(" ");
        System.out.println("�Ƴ����к��ӡ���===�� ");
        roundQueue.display();
        
        int elem1 = (int)roundQueue.peek();
        System.out.println("��ͷԪ��---�� "+elem1);
    }
		
}
