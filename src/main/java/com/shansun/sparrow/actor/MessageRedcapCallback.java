package com.shansun.sparrow.actor;

/**
 * ��Ϣ�����̻߳�ȡ����Ϣ�󣬽������߼�����callbackȥ��
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-7-21
 */
public interface MessageRedcapCallback {

	/**
	 * ������Ϣ
	 * 
	 * @param message
	 */
	void execute(MessageWrapper message);
}
