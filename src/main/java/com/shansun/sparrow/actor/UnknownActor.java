package com.shansun.sparrow.actor;



/**
 * ������Ϣ����Դû��ָ��ʱ�����Զ�����ΪUnknownActor.
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-7-23
 */
public class UnknownActor extends AbstractActor {

	@Override
	public String getName() {
		return "unknown-actor";
	}

	@Override
	public String getCategory() {
		return "default";
	}

	@Override
	public boolean process(Message message) {
		return true;
	}

}
