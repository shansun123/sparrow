package com.shansun.sparrow.event;

/**
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-6-6
 */
public interface EventPublisher {
	/**
	 * �����¼�
	 * 
	 * @param event
	 */
	void publish(Event event);

	/**
	 * ע�������
	 * 
	 * @param listener
	 */
	void register(EventListener listener);

	/**
	 * ��ע�������
	 * 
	 * @param listener
	 */
	void unregister(EventListener listener);

	/**
	 * ��ע�����м�����
	 */
	void unregisterAll();
}
