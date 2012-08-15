package com.shansun.sparrow.event;

/**
 * �¼�������
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-6-6
 */
public interface EventListener extends java.util.EventListener {

	/**
	 * �����¼�
	 * 
	 * @param e
	 * @return
	 */
	void onEvent(Event e);

	/**
	 * ���¼������߶���Щ�¼�����Ȥ
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes") Class[] getHandledEventClasses();
}
