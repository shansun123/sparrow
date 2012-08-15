package com.shansun.sparrow.actor;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.google.common.collect.ForwardingQueue;

/**
 * ��Ϣ���С�ÿ�������̻߳��Ӧһ��˽�е���Ϣ���С�
 * �ڷ�����Ϣ��ʱ�򣬻��������ĳһ��˽�ж����С�
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-7-20
 */
public class MessageQueue extends ForwardingQueue<MessageWrapper> {
	
	/** ʹ�÷��������б�����Ϣ */
	private Queue<MessageWrapper>	msgQueue	= new ConcurrentLinkedQueue<MessageWrapper>();

	public static MessageQueue create() {
		return new MessageQueue();
	}

	/**
	 * ��ȡ����ͷ������Ϣ�������Ӷ����Ƴ����������Ϊ�գ��򷵻�null��
	 * 
	 * @return
	 */
	public MessageWrapper peek() {
		return super.peek();
	}

	/**
	 * �Ƴ������ض���ͷ������Ϣ���������Ϊ�գ��򷵻�null��
	 */
	public MessageWrapper poll() {
		return super.poll();
	}

	/**
	 * ���һ����Ϣ������β����������true����������������򷵻�false��
	 */
	public boolean offer(MessageWrapper msg) {
		return super.offer(msg);
	}
	
	public boolean add(MessageWrapper msg) {
		return super.add(msg);
	}

	@Override
	protected Queue<MessageWrapper> delegate() {
		return msgQueue;
	}
}
