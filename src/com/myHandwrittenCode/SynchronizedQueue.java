package com.myHandwrittenCode;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;


/**
 * 飞猪重启面试题(正确做法)
 * 实现一个线程安全的去重队列(装饰者模式)
 * @author Administrator
 *
 * @param <E>
 */
public class SynchronizedQueue<E> implements Queue<E>, Serializable {

	private static final long serialVersionUID = -1439242290701194806L;
	private final Queue<E> q;

	public SynchronizedQueue(Queue<E> q) {
		this.q = q;
	}

	public synchronized boolean add(E e) {//这种锁方法就是锁对象q，添加元素，队满报异常
		if (!q.contains(e)) {//去重
			return q.add(e);
		}else {			
			return false;
		}
	}

	public synchronized E element() {//获取队头元素，没有报异常
		return q.element();
	}

	public synchronized boolean offer(E e) {
		if (!q.contains(e)) {//去重
			return q.offer(e);
		}else {			
			return false;
		}
	}

	public synchronized E peek() {
		return q.peek();
	}

	public synchronized E poll() {
		return q.poll();
	}

	public synchronized E remove() {//移除队头元素，队空报异常
		return q.remove();
	}

	public synchronized boolean addAll(Collection<? extends E> c) {
		return q.addAll(c);
	}

	public synchronized void clear() {
		q.clear();
	}

	public synchronized boolean contains(Object o) {
		return q.contains(o);
	}

	public synchronized boolean containsAll(Collection<?> c) {
		return q.containsAll(c);
	}

	public synchronized boolean isEmpty() {
		return q.isEmpty();
	}

	public synchronized Iterator<E> iterator() {
		return q.iterator();
	}

	public synchronized boolean remove(Object o) {
		return q.remove(o);
	}

	public synchronized boolean removeAll(Collection<?> c) {
		return q.removeAll(c);
	}

	public synchronized boolean retainAll(Collection<?> c) {
		return q.retainAll(c);
	}

	public synchronized int size() {
		return q.size();
	}

	public synchronized Object[] toArray() {
		return q.toArray();
	}

	public synchronized <T> T[] toArray(T[] a) {
		return q.toArray(a);
	}

	@Override
	public synchronized boolean equals(Object obj) {
		return q.equals(obj);
	}

	@Override
	public synchronized int hashCode() {
		return q.hashCode();
	}

	@Override
	public synchronized String toString() {
		return q.toString();
	}
}

