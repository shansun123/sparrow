package com.shansun.sparrow.actor;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.google.common.collect.ForwardingQueue;

/**
 * 消息队列。每条处理线程会对应一个私有的消息队列。
 * 在发送消息的时候，会随机进入某一个私有队列中。
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-7-20
 */
public class MessageQueue extends ForwardingQueue<MessageWrapper> {
	
	/** 使用非阻塞队列保存消息 */
	private Queue<MessageWrapper>	msgQueue	= new ConcurrentLinkedQueue<MessageWrapper>();

	public static MessageQueue create() {
		return new MessageQueue();
	}

	/**
	 * 获取队列头部的消息，但不从队列移除。如果队列为空，则返回null。
	 * 
	 * @return
	 */
	public MessageWrapper peek() {
		return super.peek();
	}

	/**
	 * 移除并返回队列头部的消息。如果队列为空，则返回null。
	 */
	public MessageWrapper poll() {
		return super.poll();
	}

	/**
	 * 添加一个消息到队列尾部，并返回true。如果队列已满，则返回false。
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
