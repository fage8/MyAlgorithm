package com.myPracticeCode;
/**
 * 自定义实现queue
 * @author Administrator
 *
 */
public class MyQueue {
	private long a[];
	private int size; //数组大小
	private int nItems;//实际存储数量
	private int front;//头
	private int rear;//尾
	
	public MyQueue(int maxSize){//构造器里面进行初始化
		this.size = maxSize;
		a = new long[size];
		nItems = 0;
		front = 0;
		rear = -1;
	}
	
	//判断队列是否为空
	public boolean isEmpty(){
		return (nItems == 0);
	}
		
	//判断队列是否已满
	public boolean isFull(){
		return (nItems == size);
	}
	
	//队列实际存储数量大小
	public int size(){
		return nItems;
	}
	
	//往队列添加数据
	public void insert(long value){
		if(isFull()){
			System.out.println("队列已满！");
			return ;
		}
		rear = ++nItems % size;
		a[rear] = value;//尾指针满了就循环到0处,这句相当于下面注释内容    
		nItems++;
		/*if(rear == size-1){
			rear = -1;
		}
		a[++rear] = value;*/
	}
	//删除队列数据，返回新的队头元素
	public long remove(){
		if(isEmpty()){
			System.out.println("队列为空！");
			return 0;
		}
		nItems--;
		front = front % size;
		return a[front++];
	}
	//取队列头部元素
	public long peek(){
		if(isEmpty()){
			System.out.println("队列为空！");
			return 0;
		}
		return a[front];
	}
	
	//打印 队列
	public void display(){
		if(isEmpty()){
			System.out.println("队列为空！");
			return;
		}
		int item=front;
		for(int i=0;i<nItems;i++){
			System.out.println(a[item++ % size]+" ");
		}
		System.out.println(" ");
	}
	
	//测试
    public static void main(String[] args) throws Exception{
    	MyQueue roundQueue = new MyQueue(30);
    	roundQueue.insert(3);
    	roundQueue.insert(6);
    	roundQueue.insert(9);
 
        System.out.println("打印输出： ");
        roundQueue.display();
        
        int elem = (int)roundQueue.remove();
        System.out.println("移除队列===： "+elem);
        System.out.println(" ");
        System.out.println("移除队列后打印输出===： ");
        roundQueue.display();
        
        int elem1 = (int)roundQueue.peek();
        System.out.println("队头元素---： "+elem1);
    }
		
}
